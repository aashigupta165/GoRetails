package com.goretails;

public class viewModel {
//    public List<String> listOfData = getListOfData();
//    public LiveData<List<String>> searchResults = new MutableLiveData(listOfData);
public String query;
    // filter list of data when query submitted
    public void filterData(String query) {
        //filter outside of your RecyclerView Adapter through your listOfData variable
//        searchResults.value = getFilter().filter(query);
        this.query = query;
    }

    public String getSearchResults() {
        return query;
    }
}
