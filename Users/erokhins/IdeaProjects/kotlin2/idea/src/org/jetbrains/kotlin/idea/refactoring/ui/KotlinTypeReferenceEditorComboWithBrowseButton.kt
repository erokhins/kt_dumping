'ComponentWithBrowseButton<EditorComboBox>' @ [36:5] ==> public constructor ComponentWithBrowseButton<Comp : (JComponent..JComponent?)>(p0: (EditorComboBox..EditorComboBox?), @Nullable p1: ActionListener?) defined in com.intellij.openapi.ui.ComponentWithBrowseButton[JavaClassConstructorDescriptor]
Inferred types:
    <Comp : (JComponent..JComponent?)> -> EditorComboBox

'EditorComboBox' @ [37:9] ==> public constructor EditorComboBox(p0: (Document..Document?), p1: (Project..Project?), p2: (FileType..FileType?)) defined in com.intellij.ui.EditorComboBox[JavaClassConstructorDescriptor]

'createDocument' @ [37:24] ==> private final fun createDocument(text: String?, contextElement: PsiElement): Document? defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.Companion[SimpleFunctionDescriptorImpl]

'text' @ [37:39] ==> value-parameter text: String? defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.<init>[ValueParameterDescriptorImpl]

'contextElement' @ [37:45] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.<init>[ValueParameterDescriptorImpl]

'contextElement' @ [37:62] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.<init>[ValueParameterDescriptorImpl]

'project' @ [37:77] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'INSTANCE' @ [37:101] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'browseActionListener' @ [38:9] ==> value-parameter browseActionListener: ActionListener defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.<init>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [42:32] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'contextElement' @ [42:45] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.Companion.createDocument[ValueParameterDescriptorImpl]

'createTypeCodeFragment' @ [42:61] ==> public final fun createTypeCodeFragment(text: String, context: PsiElement?): KtTypeCodeFragment defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'text' @ [42:84] ==> value-parameter text: String? defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.Companion.createDocument[ValueParameterDescriptorImpl]

'contextElement' @ [42:96] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.Companion.createDocument[ValueParameterDescriptorImpl]

'getInstance' @ [43:39] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'contextElement' @ [43:51] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.Companion.createDocument[ValueParameterDescriptorImpl]

'project' @ [43:66] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getDocument' @ [43:75] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'codeFragment' @ [43:87] ==> val codeFragment: KtTypeCodeFragment defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.Companion.createDocument[LocalVariableDescriptor]

'contextElement' @ [47:27] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.<init>[ValueParameterDescriptorImpl]

'project' @ [47:42] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getInstance' @ [50:24] ==> @NotNull public open fun getInstance(@NotNull p0: Project): RecentsManager defined in com.intellij.ui.RecentsManager[JavaMethodDescriptor]

'contextElement' @ [50:36] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.<init>[ValueParameterDescriptorImpl]

'project' @ [50:51] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getRecentEntries' @ [50:60] ==> @Nullable public open fun getRecentEntries(@NotNull p0: String): (MutableList<(String..String?)>?..List<(String..String?)>?) defined in com.intellij.ui.RecentsManager[JavaMethodDescriptor]

'recentsKey' @ [50:77] ==> value-parameter recentsKey: String defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.<init>[ValueParameterDescriptorImpl]

'let' @ [50:90] ==> @InlineOnly public inline fun <T, R> (MutableList<(String..String?)>..List<(String..String?)>).let(block: ((MutableList<(String..String?)>..List<(String..String?)>)) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(kotlin.String..kotlin.String?)>..kotlin.collections.List<(kotlin.String..kotlin.String?)>)
    <R> -> Unit

'childComponent' @ [51:13] ==> public final val KotlinTypeReferenceEditorComboWithBrowseButton.childComponent: (EditorComboBox..EditorComboBox?)[MyPropertyDescriptor]

'setHistory' @ [51:28] ==> public open fun setHistory(p0: (Array<(String..String?)>..Array<out (String..String?)>?)): Unit defined in com.intellij.ui.EditorComboBox[JavaMethodDescriptor]

'toStringArray' @ [51:49] ==> @NotNull @Contract public open fun toStringArray(@Nullable p0: (MutableCollection<(String..String?)>?..Collection<(String..String?)>?)): (Array<(String..String?)>..Array<out (String..String?)>) defined in com.intellij.util.ArrayUtil[JavaMethodDescriptor]

'it' @ [51:63] ==> value-parameter it: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.<init>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [54:13] ==> value-parameter text: String? defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.<init>[ValueParameterDescriptorImpl]

'if (text.isNotEmpty()) {
                childComponent.prependItem(text)
            }
            else {
                childComponent.selectedItem = null
            }' @ [55:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'text' @ [55:17] ==> value-parameter text: String? defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.<init>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [55:22] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'childComponent' @ [56:17] ==> public final val KotlinTypeReferenceEditorComboWithBrowseButton.childComponent: (EditorComboBox..EditorComboBox?)[MyPropertyDescriptor]

'prependItem' @ [56:32] ==> public open fun prependItem(p0: (String..String?)): Unit defined in com.intellij.ui.EditorComboBox[JavaMethodDescriptor]

'text' @ [56:44] ==> value-parameter text: String? defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.<init>[ValueParameterDescriptorImpl]

'childComponent' @ [59:17] ==> public final val KotlinTypeReferenceEditorComboWithBrowseButton.childComponent: (EditorComboBox..EditorComboBox?)[MyPropertyDescriptor]

'selectedItem' @ [59:32] ==> public final var EditorComboBox.selectedItem: (Any..Any?)[MyPropertyDescriptor]

'childComponent' @ [64:30] ==> public final val KotlinTypeReferenceEditorComboWithBrowseButton.childComponent: (EditorComboBox..EditorComboBox?)[MyPropertyDescriptor]

'text' @ [64:45] ==> public final var EditorComboBox.text: (String..String?)[MyPropertyDescriptor]

'trim' @ [64:50] ==> public inline fun String.trim(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [64:57] ==> value-parameter it: Char defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.getText.<anonymous>[ValueParameterDescriptorImpl]

'childComponent' @ [67:9] ==> public final val KotlinTypeReferenceEditorComboWithBrowseButton.childComponent: (EditorComboBox..EditorComboBox?)[MyPropertyDescriptor]

'text' @ [67:24] ==> public final var EditorComboBox.text: (String..String?)[MyPropertyDescriptor]

'text' @ [67:31] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton.setText[ValueParameterDescriptorImpl]

'getInstance' @ [71:36] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [71:48] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinTypeReferenceEditorComboWithBrowseButton[PropertyDescriptorImpl]

'getPsiFile' @ [71:57] ==> @Nullable public abstract fun getPsiFile(@NotNull p0: Document): PsiFile? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'childComponent' @ [71:68] ==> public final val KotlinTypeReferenceEditorComboWithBrowseButton.childComponent: (EditorComboBox..EditorComboBox?)[MyPropertyDescriptor]

'document' @ [71:83] ==> public final var EditorComboBox.document: (Document..Document?)[MyPropertyDescriptor]

