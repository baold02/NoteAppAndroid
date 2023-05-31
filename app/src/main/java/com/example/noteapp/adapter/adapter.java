package com.example.noteapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteapp.R;
import com.example.noteapp.models.Note;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.NoteViewHodel> {
    List<Note> mListNote;

    public void setData(List<Note> mListNote) {
        this.mListNote = mListNote;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NoteViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note,parent,false);
        return new NoteViewHodel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHodel holder, int position) {
        Note note = mListNote.get(position);
        if(note == null){
            return;
        }

    holder.tvTitle.setText(note.getTitle());
    holder.tvContent.setText(note.getContent());

    }

    @Override
    public int getItemCount() {
        if(mListNote != null){
          return  mListNote.size();
        }
        return 0;
    }

    public  class NoteViewHodel extends RecyclerView.ViewHolder{
      TextView tvTitle,tvContent;
        public NoteViewHodel(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvContent = itemView.findViewById(R.id.tv_content);
        }
    }
}
