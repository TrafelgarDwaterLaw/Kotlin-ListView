import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.my_ticket.view.*


class MainActivity : AppCompatActivity() {

    var madapter:myAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // simple listview containing one item 
        
        madapter= ageAdapter()
        lv1.adapter=madapter

    }
    
    class myAdapter() : BaseAdapter() {
    
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
             // tried to stop refreshing the listView
             
             if (convertView==null) {
             
                 var myView = LayoutInflater.from(parent!!.context).inflate(R.layout.my_ticket,null)
                 
                 return myView
             }else{
             
                 return convertView
                 
             }   
             
             // it stoped refreshing in some android devices
             // but still refreshing in others
             
        override fun getItem(position: Int): Any {
            return position
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return 1
        }   
        
    }    
