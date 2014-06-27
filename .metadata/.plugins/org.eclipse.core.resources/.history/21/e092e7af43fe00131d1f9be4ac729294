package glass.handlers;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

public class ParentListener {
	
	protected int getLastLineNumber() {
		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		ITextEditor editor = (ITextEditor) editorPart.getAdapter(ITextEditor.class);
		IDocumentProvider provider = editor.getDocumentProvider();
		IDocument document = provider.getDocument(editorPart.getEditorInput());
		ITextSelection textSelection = (ITextSelection) editorPart.getSite().getSelectionProvider().getSelection();
		int offset = textSelection.getOffset();
		int lineNumber = -1;
		
		try {
			lineNumber = document.getLineOfOffset(offset) + 1;
		} catch (BadLocationException e) {
			System.out.println("Error");
		}
		//System.out.println("Offset: " + offset);
		return lineNumber;
	}
	
	protected int getLineNumber(StyledText textfield, CaretEvent event) {
		int lineNum = -1;
		if (textfield != null) {
			lineNum = textfield.getLineAtOffset(event.caretOffset) + 1;
		}
		return lineNum;
	}
	
	protected String getActiveProjectName(IWorkbenchPartReference partRef) {
		IFileEditorInput input = (IFileEditorInput) partRef.getPage().getActiveEditor().getEditorInput();    
		IFile file = input.getFile();     
		IProject activeProject = file.getProject();     
		String activeProjectName = activeProject.getName();
		return activeProjectName;
	}
}
