package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.entity.User;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;


public interface JournalEntryService {
    void saveEntry(JournalEntry journalEntry, String userName);
    void saveEntry(JournalEntry journalEntry);
    List<JournalEntry> getAll();
    Optional<JournalEntry> findById(ObjectId id);
    void deleteById(ObjectId id, String userName);
    JournalEntry updateById(ObjectId id, JournalEntry journalEntry);

}
