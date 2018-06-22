package cubex.mahesh.fragmenttest

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomeFrag:Fragment( )
{
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        var v:View = inflater!!.inflate(R.layout.home_layout,
                                container,false)
        return v
    }

}