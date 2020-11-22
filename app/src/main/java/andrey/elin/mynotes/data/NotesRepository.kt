package andrey.elin.mynotes.data

interface NotesRepository {
    fun getAllNotes(): List<Note>
}