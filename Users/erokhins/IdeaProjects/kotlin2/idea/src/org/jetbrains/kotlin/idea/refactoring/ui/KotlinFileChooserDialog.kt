'AbstractTreeClassChooserDialog<KtFile>' @ [34:5] ==> public constructor AbstractTreeClassChooserDialog<T : (PsiNamedElement..PsiNamedElement?)>(p0: (String..String?), @NotNull p1: Project, p2: (GlobalSearchScope..GlobalSearchScope?), @NotNull p3: Class<(KtFile..KtFile?)>, @Nullable p4: TreeChooser.Filter<(KtFile..KtFile?)>?, @Nullable p5: KtFile?, @Nullable p6: KtFile?, p7: Boolean, p8: Boolean) defined in com.intellij.ide.util.AbstractTreeClassChooserDialog[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiNamedElement..PsiNamedElement?)> -> KtFile

'title' @ [35:9] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinFileChooserDialog.<init>[ValueParameterDescriptorImpl]

'project' @ [36:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinFileChooserDialog.<init>[ValueParameterDescriptorImpl]

'project' @ [37:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinFileChooserDialog.<init>[ValueParameterDescriptorImpl]

'projectScope' @ [37:17] ==> public fun Project.projectScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'restrictToKotlinSources' @ [37:32] ==> public fun GlobalSearchScope.restrictToKotlinSources(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'KtFile' @ [38:9] ==> public constructor KtFile(p0: (FileViewProvider..FileViewProvider?), p1: Boolean) defined in org.jetbrains.kotlin.psi.KtFile[JavaClassConstructorDescriptor]

'java' @ [38:23] ==> public val <T> KClass<KtFile>.java: Class<KtFile> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFile

'node' @ [46:26] ==> value-parameter node: DefaultMutableTreeNode defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinFileChooserDialog.getSelectedFromTreeUserObject[ValueParameterDescriptorImpl]

'userObject' @ [46:31] ==> public final var DefaultMutableTreeNode.userObject: (Any..Any?)[MyPropertyDescriptor]

'when (userObject) {
            is KtFileTreeNode -> userObject.ktFile
            is KtClassOrObjectTreeNode -> {
                val containingFile = userObject.value.containingKtFile
                if (containingFile.declarations.size == 1) containingFile else null
            }
            else -> null
        }' @ [47:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtFile?, entry1: KtFile?, entry2: KtFile?): KtFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtFile?

'userObject' @ [47:22] ==> val userObject: (Any..Any?) defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinFileChooserDialog.getSelectedFromTreeUserObject[LocalVariableDescriptor]

'userObject' @ [48:34] ==> val userObject: (Any..Any?) defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinFileChooserDialog.getSelectedFromTreeUserObject[LocalVariableDescriptor]

'ktFile' @ [48:45] ==> public final val KtFileTreeNode.ktFile: (KtFile..KtFile?)[MyPropertyDescriptor]

'userObject' @ [50:38] ==> val userObject: (Any..Any?) defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinFileChooserDialog.getSelectedFromTreeUserObject[LocalVariableDescriptor]

'value' @ [50:49] ==> public final var KtClassOrObjectTreeNode.value: (KtClassOrObject..KtClassOrObject?)[MyPropertyDescriptor]

'containingKtFile' @ [50:55] ==> public final val KtClassOrObject.containingKtFile: KtFile[MyPropertyDescriptor]

'if (containingFile.declarations.size == 1) containingFile else null' @ [51:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtFile?, elseBranch: KtFile?): KtFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtFile?

'containingFile' @ [51:21] ==> val containingFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinFileChooserDialog.getSelectedFromTreeUserObject[LocalVariableDescriptor]

'declarations' @ [51:36] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'size' @ [51:49] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'containingFile' @ [51:60] ==> val containingFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinFileChooserDialog.getSelectedFromTreeUserObject[LocalVariableDescriptor]

'getFilesByName' @ [58:30] ==> @NotNull public open fun getFilesByName(p0: (Project..Project?), p1: (String..String?), p2: (GlobalSearchScope..GlobalSearchScope?)): (Array<(PsiFile..PsiFile?)>..Array<out (PsiFile..PsiFile?)>) defined in com.intellij.psi.search.FilenameIndex[JavaMethodDescriptor]

'project' @ [58:45] ==> protected/*protected and package*/ for synthetic extension final val KotlinFileChooserDialog.project: Project[MyPropertyDescriptor]

'name' @ [58:54] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinFileChooserDialog.getClassesByName[ValueParameterDescriptorImpl]

'searchScope' @ [58:60] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinFileChooserDialog.getClassesByName[ValueParameterDescriptorImpl]

'filterIsInstance' @ [58:73] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtFile

'GotoFileModel' @ [61:46] ==> public constructor GotoFileModel(@NotNull p0: Project) defined in com.intellij.ide.util.gotoByName.GotoFileModel[JavaClassConstructorDescriptor]

'this' @ [61:60] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.ui.KotlinFileChooserDialog[LazyClassReceiverParameterDescriptor]

'project' @ [61:65] ==> protected/*protected and package*/ for synthetic extension final val KotlinFileChooserDialog.project: Project[MyPropertyDescriptor]

