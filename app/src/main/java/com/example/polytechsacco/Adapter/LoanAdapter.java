package com.example.polytechsacco.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.polytechsacco.R;
import com.example.polytechsacco.models.Chat;

import java.util.List;

public class LoanAdapter extends RecyclerView.Adapter<LoanAdapter.LoanViewholder> {
/**DECLARATION OF THE LIST OF OUR CHART MODEL BEFORE USING IT IT THE CONSTRUCTOR
*/
    private final List<Chat>chats;

    /**
     *THIS IS OUR CONSTRUCTOR FOR ADAPTER CLASS
     */
  public LoanAdapter(final List<Chat>chats){

      this.chats=chats;

  }

    public class LoanViewholder extends RecyclerView.ViewHolder{

   private final TextView tvloanNo;
   private final TextView tvloantype;
   private final TextView tvloanbal;
        /**
         *COnstructor for the Viewholder Class
         */
        public LoanViewholder(@NonNull View view) {
            super(view);

            this.tvloanNo=view.findViewById(R.id.tvLoanNo);
            this.tvloantype=view.findViewById(R.id.tvLoanName);
            this.tvloanbal=view.findViewById(R.id.tvOutBal);
        }
        public void bind(final Chat chat){
            this.tvloanNo.setText(chat.getLoanNo());
            this.tvloantype.setText(chat.getLoanType());
            this.tvloanbal.setText(chat.getLoanBal());


        }
    }



    /**The three methods used in Recyclerview
     *
       */
    @NonNull
    @Override
    public LoanViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.loans_layout,parent,false);

        return new LoanViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LoanViewholder holder, int position) {
        holder.bind(this.chats.get(position));

    }

    @Override
    public int getItemCount() {
        return  this.chats==null ? 0 :this.chats.size();
    }

}
