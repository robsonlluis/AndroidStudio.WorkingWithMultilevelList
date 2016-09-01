package com.example.rsouza.workingwithmultilevellist;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SecondLevelAdapter extends BaseExpandableListAdapter
{

    private Context _context;
    public SecondLevelAdapter(Context context){
        _context = context;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition)
    {
        return childPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition)
    {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent)
    {
        TextView tv = new TextView(_context);
        tv.setText("child");
        tv.setPadding(15, 5, 5, 5);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setLayoutParams(new ListView.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));
        return tv;
    }

    @Override
    public int getChildrenCount(int groupPosition)
    {
        return 5;
    }

    @Override
    public Object getGroup(int groupPosition)
    {
        return groupPosition;
    }

    @Override
    public int getGroupCount()
    {
        return 1;
    }

    @Override
    public long getGroupId(int groupPosition)
    {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent)
    {
        TextView tv = new TextView(_context);
        tv.setText("-->Second Level");
        tv.setPadding(12, 7, 7, 7);
        tv.setBackgroundColor(Color.RED);

        return tv;
    }

    @Override
    public boolean hasStableIds() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        // TODO Auto-generated method stub
        return true;
    }

}
