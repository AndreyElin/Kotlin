package andrey.elin.mynotes.presentation

import andrey.elin.mynotes.data.Note

sealed class ViewState {
    data class Value(val notes: List<Note>) : ViewState()
    object EMPTY : ViewState()
}