package com.example.mvvmtest1;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import java.util.List;

public class HolidayViewModel extends ViewModel {

    private final HolidayRepo holidayRepo;
    private MutableLiveData<List<HolidayModel>> mutableLiveData;

    public HolidayViewModel() {
        holidayRepo = new HolidayRepo();
    }

    public LiveData<List<HolidayModel>> getHolidays() {
        if (mutableLiveData == null) {
            mutableLiveData = holidayRepo.requestHolidays();
        }
        return mutableLiveData;
    }

}
