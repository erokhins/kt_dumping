'element' @ [39:19] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElement[ValueParameterDescriptorImpl]

'project' @ [39:27] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getInstance' @ [40:39] ==> public open fun getInstance(p0: (Project..Project?)): (SmartPointerManager..SmartPointerManager?) defined in com.intellij.psi.SmartPointerManager[JavaMethodDescriptor]

'project' @ [40:51] ==> val project: Project defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElement[LocalVariableDescriptor]

'createSmartPsiElementPointer' @ [40:60] ==> @NotNull public abstract fun <E : (PsiElement..PsiElement?)> createSmartPsiElementPointer(@NotNull p0: PsiElement): SmartPsiElementPointer<(PsiElement..PsiElement?)> defined in com.intellij.psi.SmartPointerManager[JavaMethodDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> PsiElement

'element' @ [40:89] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElement[ValueParameterDescriptorImpl]

'getInstance' @ [42:24] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [42:36] ==> val project: Project defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElement[LocalVariableDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [42:45] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [42:85] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElement[ValueParameterDescriptorImpl]

'document' @ [42:92] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'pointer' @ [44:5] ==> val pointer: SmartPsiElementPointer<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElement[LocalVariableDescriptor]

'element' @ [44:13] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<(PsiElement..PsiElement?)>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'let' @ [44:22] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Boolean

'moveCaretIntoGeneratedElementDocumentUnblocked' @ [44:28] ==> private fun moveCaretIntoGeneratedElementDocumentUnblocked(editor: Editor, element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.core in file generateUtil.kt[SimpleFunctionDescriptorImpl]

'editor' @ [44:75] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElement[ValueParameterDescriptorImpl]

'it' @ [44:83] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElement.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [50:9] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'element' @ [50:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'hasBody' @ [50:53] ==> public abstract fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'element' @ [51:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'bodyExpression' @ [51:34] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'expression' @ [52:13] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'expression' @ [53:26] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'lBrace' @ [53:37] ==> public final val KtBlockExpression.lBrace: PsiElement?[MyPropertyDescriptor]

'expression' @ [54:26] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'rBrace' @ [54:37] ==> public final val KtBlockExpression.rBrace: PsiElement?[MyPropertyDescriptor]

'lBrace' @ [56:17] ==> val lBrace: PsiElement? defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'rBrace' @ [56:35] ==> val rBrace: PsiElement? defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'lBrace' @ [57:36] ==> val lBrace: PsiElement? defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'siblings' @ [57:43] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'first' @ [57:88] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [57:96] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked.<anonymous>[ValueParameterDescriptorImpl]

'rBrace' @ [58:35] ==> val rBrace: PsiElement? defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'siblings' @ [58:42] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'first' @ [58:88] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [58:96] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked.<anonymous>[ValueParameterDescriptorImpl]

'firstInBlock' @ [60:29] ==> val firstInBlock: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'textRange' @ [60:42] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [60:54] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'lastInBlock' @ [61:27] ==> val lastInBlock: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'textRange' @ [61:39] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [61:51] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'editor' @ [63:17] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'moveCaret' @ [63:24] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core in file generateUtil.kt[SimpleFunctionDescriptorImpl]

'min' @ [63:39] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'start' @ [63:43] ==> val start: Int defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'end' @ [63:50] ==> val end: Int defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'start' @ [65:21] ==> val start: Int defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'end' @ [65:29] ==> val end: Int defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'editor' @ [66:21] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'selectionModel' @ [66:28] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'setSelection' @ [66:43] ==> public abstract fun setSelection(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'start' @ [66:56] ==> val start: Int defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'end' @ [66:63] ==> val end: Int defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'element' @ [74:9] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'element' @ [74:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'hasInitializer' @ [74:60] ==> public abstract fun hasInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithInitializer[JavaMethodDescriptor]

'element' @ [75:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'initializer' @ [75:34] ==> public final val KtDeclarationWithInitializer.initializer: KtExpression?[MyPropertyDescriptor]

'AssertionError' @ [75:55] ==> public final fun <init>(): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'expression' @ [77:32] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'textRange' @ [77:43] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'initializerRange' @ [79:22] ==> val initializerRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'startOffset' @ [79:40] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'element' @ [79:55] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'getTextOffset' @ [79:63] ==> @Contract public abstract fun getTextOffset(): Int defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'editor' @ [81:9] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'moveCaret' @ [81:16] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core in file generateUtil.kt[SimpleFunctionDescriptorImpl]

'offset' @ [81:26] ==> val offset: Int defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'initializerRange' @ [83:13] ==> val initializerRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'expression' @ [84:29] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'siblings' @ [84:40] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'lastOrNull' @ [84:85] ==> public fun <T> Sequence<PsiElement>.lastOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'endOffset' @ [84:99] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'initializerRange' @ [84:112] ==> val initializerRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'endOffset' @ [84:129] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'editor' @ [85:13] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'selectionModel' @ [85:20] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'setSelection' @ [85:35] ==> public abstract fun setSelection(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'initializerRange' @ [85:48] ==> val initializerRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'startOffset' @ [85:65] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'endOffset' @ [85:78] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'element' @ [91:9] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'element' @ [92:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'accessors' @ [92:34] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'moveCaretIntoGeneratedElementDocumentUnblocked' @ [93:17] ==> private fun moveCaretIntoGeneratedElementDocumentUnblocked(editor: Editor, element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.core in file generateUtil.kt[SimpleFunctionDescriptorImpl]

'editor' @ [93:64] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[ValueParameterDescriptorImpl]

'accessor' @ [93:72] ==> val accessor: (KtPropertyAccessor..KtPropertyAccessor?) defined in org.jetbrains.kotlin.idea.core.moveCaretIntoGeneratedElementDocumentUnblocked[LocalVariableDescriptor]

'project' @ [103:5] ==> public final val Editor.project: Project?[MyPropertyDescriptor]

'let' @ [103:14] ==> @InlineOnly public inline fun <T, R> Project.let(block: (Project) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Project
    <R> -> Unit

'getInstance' @ [104:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'it' @ [104:40] ==> value-parameter it: Project defined in org.jetbrains.kotlin.idea.core.unblockDocument.<anonymous>[ValueParameterDescriptorImpl]

'doPostponedOperationsAndUnblockDocument' @ [104:44] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [104:84] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'RELATIVE' @ [108:71] ==> enum entry RELATIVE defined in com.intellij.openapi.editor.ScrollType[FakeCallableDescriptorForObject]

'caretModel' @ [109:5] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [109:16] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'offset' @ [109:29] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.core.moveCaret[ValueParameterDescriptorImpl]

'scrollingModel' @ [110:5] ==> public final val Editor.scrollingModel: ScrollingModel[MyPropertyDescriptor]

'scrollToCaret' @ [110:20] ==> public abstract fun scrollToCaret(@NotNull p0: ScrollType): Unit defined in com.intellij.openapi.editor.ScrollingModel[JavaMethodDescriptor]

'scrollType' @ [110:34] ==> value-parameter scrollType: ScrollType = ... defined in org.jetbrains.kotlin.idea.core.moveCaret[ValueParameterDescriptorImpl]

'body' @ [114:23] ==> value-parameter body: KtClassBody defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[ValueParameterDescriptorImpl]

'lBrace' @ [114:28] ==> public final val lBrace: PsiElement? defined in org.jetbrains.kotlin.psi.KtClassBody[DeserializedPropertyDescriptor]

'editor' @ [116:18] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[ValueParameterDescriptorImpl]

'caretModel' @ [116:26] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [116:38] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'body' @ [116:48] ==> value-parameter body: KtClassBody defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[ValueParameterDescriptorImpl]

'startOffset' @ [116:53] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'findFirstParent' @ [117:43] ==> @Nullable public final fun findFirstParent(@Nullable p0: PsiElement?, p1: (((PsiElement..PsiElement?)) -> Boolean..(((PsiElement..PsiElement?)) -> Boolean)?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[SamAdapterFunctionDescriptor]

'body' @ [117:59] ==> value-parameter body: KtClassBody defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[ValueParameterDescriptorImpl]

'containingFile' @ [117:64] ==> public final val KtClassBody.containingFile: PsiFile[MyPropertyDescriptor]

'findElementAt' @ [117:79] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [117:93] ==> val offset: Int defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[LocalVariableDescriptor]

'it' @ [118:9] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [118:12] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'body' @ [118:22] ==> value-parameter body: KtClassBody defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[ValueParameterDescriptorImpl]

'offsetCursorElement' @ [121:9] ==> val offsetCursorElement: PsiElement? defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[LocalVariableDescriptor]

'removeAfterOffset' @ [122:16] ==> private fun removeAfterOffset(offset: Int, whiteSpace: PsiWhiteSpace): PsiElement defined in org.jetbrains.kotlin.idea.core in file generateUtil.kt[SimpleFunctionDescriptorImpl]

'offset' @ [122:34] ==> val offset: Int defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[LocalVariableDescriptor]

'offsetCursorElement' @ [122:42] ==> val offsetCursorElement: PsiElement? defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[LocalVariableDescriptor]

'offsetCursorElement' @ [125:9] ==> val offsetCursorElement: PsiElement? defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[LocalVariableDescriptor]

'offsetCursorElement' @ [125:40] ==> val offsetCursorElement: PsiElement? defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[LocalVariableDescriptor]

'body' @ [125:63] ==> value-parameter body: KtClassBody defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[ValueParameterDescriptorImpl]

'rBrace' @ [125:68] ==> public final val rBrace: PsiElement? defined in org.jetbrains.kotlin.psi.KtClassBody[DeserializedPropertyDescriptor]

'offsetCursorElement' @ [126:16] ==> val offsetCursorElement: PsiElement? defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[LocalVariableDescriptor]

'afterAnchor' @ [129:12] ==> val afterAnchor: PsiElement defined in org.jetbrains.kotlin.idea.core.findInsertAfterAnchor[LocalVariableDescriptor]

'whiteSpace' @ [133:21] ==> value-parameter whiteSpace: PsiWhiteSpace defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[ValueParameterDescriptorImpl]

'node' @ [133:32] ==> public final val PsiWhiteSpace.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'spaceNode' @ [134:9] ==> val spaceNode: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[LocalVariableDescriptor]

'textRange' @ [134:19] ==> public final val ASTNode.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'contains' @ [134:29] ==> public open operator fun contains(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'offset' @ [134:38] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[ValueParameterDescriptorImpl]

'spaceNode' @ [135:36] ==> val spaceNode: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[LocalVariableDescriptor]

'text' @ [135:46] ==> public final val ASTNode.text: String[MyPropertyDescriptor]

'substring' @ [135:51] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'offset' @ [135:64] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[ValueParameterDescriptorImpl]

'spaceNode' @ [135:73] ==> val spaceNode: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[LocalVariableDescriptor]

'startOffset' @ [135:83] ==> public final val ASTNode.startOffset: Int[MyPropertyDescriptor]

'!' @ [136:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containsLineBreak' @ [136:25] ==> @Contract public open fun containsLineBreak(@NotNull p0: CharSequence): Boolean defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'beforeWhiteSpaceText' @ [136:43] ==> var beforeWhiteSpaceText: String defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[LocalVariableDescriptor]

'beforeWhiteSpaceText' @ [138:13] ==> var beforeWhiteSpaceText: String defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[LocalVariableDescriptor]

'KtPsiFactory' @ [141:23] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'whiteSpace' @ [141:36] ==> value-parameter whiteSpace: PsiWhiteSpace defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[ValueParameterDescriptorImpl]

'project' @ [141:47] ==> public final val PsiWhiteSpace.project: Project[MyPropertyDescriptor]

'whiteSpace' @ [143:27] ==> value-parameter whiteSpace: PsiWhiteSpace defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[ValueParameterDescriptorImpl]

'prevSibling' @ [143:38] ==> public final val PsiWhiteSpace.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'whiteSpace' @ [144:9] ==> value-parameter whiteSpace: PsiWhiteSpace defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[ValueParameterDescriptorImpl]

'delete' @ [144:20] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiWhiteSpace[JavaMethodDescriptor]

'factory' @ [146:27] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[LocalVariableDescriptor]

'createWhiteSpace' @ [146:35] ==> public final fun createWhiteSpace(text: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'beforeWhiteSpaceText' @ [146:52] ==> var beforeWhiteSpaceText: String defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[LocalVariableDescriptor]

'insertAfter' @ [147:9] ==> val insertAfter: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[LocalVariableDescriptor]

'parent' @ [147:21] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addAfter' @ [147:28] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'beforeSpace' @ [147:37] ==> val beforeSpace: PsiElement defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[LocalVariableDescriptor]

'insertAfter' @ [147:50] ==> val insertAfter: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[LocalVariableDescriptor]

'insertAfter' @ [149:16] ==> val insertAfter: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[LocalVariableDescriptor]

'nextSibling' @ [149:28] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'whiteSpace' @ [152:12] ==> value-parameter whiteSpace: PsiWhiteSpace defined in org.jetbrains.kotlin.idea.core.removeAfterOffset[ValueParameterDescriptorImpl]

'members' @ [161:5] ==> value-parameter members: Collection<T> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'ifEmpty' @ [161:13] ==> public inline fun <T, C : Collection<T>> Collection<T>.ifEmpty(body: () -> Collection<T>): Collection<T> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <C : Collection<T>> -> Collection<T>

'emptyList' @ [161:30] ==> public fun <T> emptyList(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'runWriteAction' @ [163:12] ==> public fun <T> runWriteAction(action: () -> List<T>): List<T> defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<T>

'SmartList' @ [164:31] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'component1' @ [166:14] ==> public final operator fun component1(): List<T> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [166:26] ==> public final operator fun component2(): List<T> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'members' @ [166:42] ==> value-parameter members: Collection<T> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'partition' @ [166:50] ==> public inline fun <T> Iterable<T>.partition(predicate: (T) -> Boolean): Pair<List<T>, List<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'it' @ [166:62] ==> value-parameter it: T defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [168:9] ==> val parameters: List<T> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'mapNotNullTo' @ [168:20] ==> public inline fun <T, R : Any, C : MutableCollection<in T>> Iterable<T>.mapNotNullTo(destination: SmartList<T>, transform: (T) -> T?): SmartList<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R : Any> -> T
    <C : MutableCollection<in R>> -> SmartList<T>

'insertedMembers' @ [168:33] ==> val insertedMembers: SmartList<T> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'classOrObject' @ [169:17] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'Suppress' @ [171:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'classOrObject' @ [172:14] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'createPrimaryConstructorParameterListIfAbsent' @ [172:28] ==> public fun KtClass.createPrimaryConstructorParameterListIfAbsent(): KtParameterList defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'addParameter' @ [172:76] ==> @NotNull public open fun addParameter(@NotNull p0: KtParameter): KtParameter defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'it' @ [172:89] ==> value-parameter it: T defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'otherMembers' @ [175:13] ==> val otherMembers: List<T> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [175:26] ==> @InlineOnly public inline fun <T> Collection<T>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'classOrObject' @ [176:24] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'getOrCreateBody' @ [176:38] ==> public fun KtClassOrObject.getOrCreateBody(): KtClassBody defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'anchor' @ [178:31] ==> value-parameter anchor: PsiElement? = ... defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'findInsertAfterAnchor' @ [178:41] ==> private fun findInsertAfterAnchor(editor: Editor?, body: KtClassBody): PsiElement? defined in org.jetbrains.kotlin.idea.core in file generateUtil.kt[SimpleFunctionDescriptorImpl]

'editor' @ [178:63] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'body' @ [178:71] ==> val body: KtClassBody defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'emptyList' @ [178:102] ==> public fun <T> emptyList(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'otherMembers' @ [179:13] ==> val otherMembers: List<T> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'mapTo' @ [179:26] ==> public inline fun <T, R, C : MutableCollection<in T>> Iterable<T>.mapTo(destination: SmartList<T>, transform: (T) -> T): SmartList<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> T
    <C : MutableCollection<in R>> -> SmartList<T>

'insertedMembers' @ [179:32] ==> val insertedMembers: SmartList<T> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'classOrObject' @ [180:21] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'classOrObject' @ [180:49] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'isEnum' @ [180:63] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [181:39] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'declarations' @ [181:53] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [181:66] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtEnumEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtEnumEntry

'enumEntries' @ [182:34] ==> val enumEntries: List<KtEnumEntry> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lastOrNull' @ [182:46] ==> public fun <T> List<KtEnumEntry>.lastOrNull(): KtEnumEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtEnumEntry

'classOrObject' @ [182:62] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'allChildren' @ [182:76] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [182:88] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [182:102] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [182:105] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [182:110] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'SEMICOLON' @ [182:134] ==> public final val SEMICOLON: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (it !is KtEnumEntry) {
                        if (bound != null && afterAnchor.startOffset <= bound.startOffset) {
                            afterAnchor = bound
                        }
                    }
                    else if (bound == null && body.declarations.isNotEmpty()) {
                        afterAnchor = body.lBrace!!
                    }
                    else if (bound != null && afterAnchor.startOffset > bound.startOffset) {
                        afterAnchor = bound.prevSibling!!
                    }' @ [183:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'it' @ [183:25] ==> value-parameter it: T defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'bound' @ [184:29] ==> val bound: PsiElement? defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'afterAnchor' @ [184:46] ==> var afterAnchor: PsiElement defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [184:58] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'bound' @ [184:73] ==> val bound: PsiElement? defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [184:79] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'afterAnchor' @ [185:29] ==> var afterAnchor: PsiElement defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'bound' @ [185:43] ==> val bound: PsiElement? defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (bound == null && body.declarations.isNotEmpty()) {
                        afterAnchor = body.lBrace!!
                    }
                    else if (bound != null && afterAnchor.startOffset > bound.startOffset) {
                        afterAnchor = bound.prevSibling!!
                    }' @ [188:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'bound' @ [188:30] ==> val bound: PsiElement? defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'body' @ [188:47] ==> val body: KtClassBody defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'declarations' @ [188:52] ==> public final val KtClassBody.declarations: (MutableList<(KtDeclaration..KtDeclaration?)>..List<(KtDeclaration..KtDeclaration?)>?)[MyPropertyDescriptor]

'isNotEmpty' @ [188:65] ==> @InlineOnly public inline fun <T> Collection<(KtDeclaration..KtDeclaration?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'afterAnchor' @ [189:25] ==> var afterAnchor: PsiElement defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'body' @ [189:39] ==> val body: KtClassBody defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'lBrace' @ [189:44] ==> public final val lBrace: PsiElement? defined in org.jetbrains.kotlin.psi.KtClassBody[DeserializedPropertyDescriptor]

'bound' @ [191:30] ==> val bound: PsiElement? defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'afterAnchor' @ [191:47] ==> var afterAnchor: PsiElement defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [191:59] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'bound' @ [191:73] ==> val bound: PsiElement? defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [191:79] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'afterAnchor' @ [192:25] ==> var afterAnchor: PsiElement defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'bound' @ [192:39] ==> val bound: PsiElement? defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'prevSibling' @ [192:45] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'Suppress' @ [196:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'body' @ [197:18] ==> val body: KtClassBody defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'addAfter' @ [197:23] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]

'it' @ [197:32] ==> value-parameter it: T defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'afterAnchor' @ [197:36] ==> var afterAnchor: PsiElement defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'apply' @ [197:55] ==> @InlineOnly public inline fun <T> T.apply(block: T.() -> Unit): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'afterAnchor' @ [197:63] ==> var afterAnchor: PsiElement defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'this' @ [197:77] ==> <this> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'ShortenReferences' @ [201:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [201:27] ==> @JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[PropertyDescriptorImpl]

'process' @ [201:35] ==> @JvmOverloads public final fun process(elements: Iterable<KtElement>, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): Collection<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences[SimpleFunctionDescriptorImpl]

'insertedMembers' @ [201:43] ==> val insertedMembers: SmartList<T> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'editor' @ [203:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'moveCaretIntoGeneratedElement' @ [204:13] ==> public fun moveCaretIntoGeneratedElement(editor: Editor, element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.core in file generateUtil.kt[SimpleFunctionDescriptorImpl]

'editor' @ [204:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'insertedMembers' @ [204:51] ==> val insertedMembers: SmartList<T> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'first' @ [204:67] ==> public fun <T> List<(T..T?)>.first(): (T..T?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'getInstance' @ [207:49] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'classOrObject' @ [207:61] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.insertMembersAfter[ValueParameterDescriptorImpl]

'project' @ [207:75] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'insertedMembers' @ [208:9] ==> val insertedMembers: SmartList<T> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'forEach' @ [208:25] ==> @HidesMembers public inline fun <T> Iterable<(T..T?)>.forEach(action: ((T..T?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'codeStyleManager' @ [208:35] ==> val codeStyleManager: (CodeStyleManager..CodeStyleManager?) defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'reformat' @ [208:52] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'it' @ [208:61] ==> value-parameter it: (T..T?) defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'insertedMembers' @ [210:9] ==> val insertedMembers: SmartList<T> defined in org.jetbrains.kotlin.idea.core.insertMembersAfter.<anonymous>[LocalVariableDescriptor]

'insertMembersAfter' @ [215:12] ==> public fun <T : KtDeclaration> insertMembersAfter(editor: Editor?, classOrObject: KtClassOrObject, members: Collection<T>, anchor: PsiElement? = ...): List<T> defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : KtDeclaration> -> T

'editor' @ [215:31] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.core.insertMember[ValueParameterDescriptorImpl]

'classOrObject' @ [215:39] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.insertMember[ValueParameterDescriptorImpl]

'listOf' @ [215:54] ==> public fun <T> listOf(element: T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'declaration' @ [215:61] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.idea.core.insertMember[ValueParameterDescriptorImpl]

'anchor' @ [215:75] ==> value-parameter anchor: PsiElement? = ... defined in org.jetbrains.kotlin.idea.core.insertMember[ValueParameterDescriptorImpl]

'single' @ [215:83] ==> public fun <T> List<T>.single(): T defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

