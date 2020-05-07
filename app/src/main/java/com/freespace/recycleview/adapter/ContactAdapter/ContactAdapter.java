package com.freespace.recycleview.adapter.ContactAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.freespace.recycleview.MainActivity;
import com.freespace.recycleview.R;
import com.freespace.recycleview.model.Contact;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    List<Contact> contactList;
    Context context;
    private LayoutInflater mLayoutInflater;

    public ContactAdapter(Context context, List<Contact> contactList) {
        this.contactList=contactList;
        this.context=context;
        mLayoutInflater= LayoutInflater.from(context);


    }
    public class ContactViewHolder extends RecyclerView.ViewHolder {
        public TextView txtPhone;
        public TextView txtName;
        public ImageView imgAvatar;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.txtName);

            txtPhone=itemView.findViewById(R.id.txtPhone);

            imgAvatar=itemView.findViewById(R.id.imgAvatar);
        }
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View item = mLayoutInflater.inflate(R.layout.custom_list_item,parent,false);

        return new ContactViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
    Contact contact = contactList.get(position);
    holder.txtPhone.setText(contact.getPhone());
    holder.txtName.setText(contact.getName());
    holder.imgAvatar.setImageResource(contact.getAvatar());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }


}
