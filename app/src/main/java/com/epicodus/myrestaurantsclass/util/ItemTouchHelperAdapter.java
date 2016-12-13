package com.epicodus.myrestaurantsclass.util;

/**
 * Created by divangtrongmo on 12/13/16.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove (int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
