'ArrayList' @ [46:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> AbstractTreeNode<out Any>

'children' @ [48:23] ==> value-parameter children: Collection<AbstractTreeNode<Any>> defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[ValueParameterDescriptorImpl]

'child' @ [49:30] ==> val child: AbstractTreeNode<Any> defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'value' @ [49:36] ==> public final var <T : (Any..Any?)> AbstractTreeNode<Any>.value: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'asKtFile' @ [49:42] ==> private final fun Any.asKtFile(): KtFile? defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider[SimpleFunctionDescriptorImpl]

'if (childValue != null) {
                val declarations = childValue.declarations

                val mainClass = KotlinIconProvider.getMainClass(childValue)
                if (mainClass != null && declarations.size == 1) {
                    result.add(KtClassOrObjectTreeNode(childValue.project, mainClass, settings))
                }
                else {
                    result.add(KtFileTreeNode(childValue.project, childValue, settings))
                }
            }
            else {
                result.add(child)
            }' @ [51:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'childValue' @ [51:17] ==> val childValue: KtFile? defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'childValue' @ [52:36] ==> val childValue: KtFile? defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'declarations' @ [52:47] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'KotlinIconProvider' @ [54:33] ==> public companion object defined in org.jetbrains.kotlin.idea.KotlinIconProvider[FakeCallableDescriptorForObject]

'getMainClass' @ [54:52] ==> public final fun getMainClass(file: KtFile): KtClassOrObject? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion[DeserializedSimpleFunctionDescriptor]

'childValue' @ [54:65] ==> val childValue: KtFile? defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'if (mainClass != null && declarations.size == 1) {
                    result.add(KtClassOrObjectTreeNode(childValue.project, mainClass, settings))
                }
                else {
                    result.add(KtFileTreeNode(childValue.project, childValue, settings))
                }' @ [55:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'mainClass' @ [55:21] ==> val mainClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'declarations' @ [55:42] ==> val declarations: List<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'size' @ [55:55] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'result' @ [56:21] ==> val result: ArrayList<AbstractTreeNode<out Any>> defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'add' @ [56:28] ==> public open fun add(element: AbstractTreeNode<out Any>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'KtClassOrObjectTreeNode' @ [56:32] ==> public constructor KtClassOrObjectTreeNode(project: Project?, ktClassOrObject: KtClassOrObject, viewSettings: ViewSettings) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode[ClassConstructorDescriptorImpl]

'childValue' @ [56:56] ==> val childValue: KtFile? defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'project' @ [56:67] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'mainClass' @ [56:76] ==> val mainClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'settings' @ [56:87] ==> value-parameter settings: ViewSettings defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[ValueParameterDescriptorImpl]

'result' @ [59:21] ==> val result: ArrayList<AbstractTreeNode<out Any>> defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'add' @ [59:28] ==> public open fun add(element: AbstractTreeNode<out Any>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'KtFileTreeNode' @ [59:32] ==> public constructor KtFileTreeNode(project: (Project..Project?), value: (KtFile..KtFile?), viewSettings: (ViewSettings..ViewSettings?)) defined in org.jetbrains.kotlin.idea.projectView.KtFileTreeNode[JavaClassConstructorDescriptor]

'childValue' @ [59:47] ==> val childValue: KtFile? defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'project' @ [59:58] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'childValue' @ [59:67] ==> val childValue: KtFile? defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'settings' @ [59:79] ==> value-parameter settings: ViewSettings defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[ValueParameterDescriptorImpl]

'result' @ [63:17] ==> val result: ArrayList<AbstractTreeNode<out Any>> defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'add' @ [63:24] ==> public open fun add(element: AbstractTreeNode<out Any>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'child' @ [63:28] ==> val child: AbstractTreeNode<Any> defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'result' @ [68:16] ==> val result: ArrayList<AbstractTreeNode<out Any>> defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.modify[LocalVariableDescriptor]

'when (this) {
        is KtFile -> this
        is KtLightClassForFacade -> files.singleOrNull()
        is KtLightClass -> kotlinOrigin?.containingFile as? KtFile
        else -> null
    }' @ [71:43] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtFile?, entry1: KtFile?, entry2: KtFile?, entry3: KtFile?): KtFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtFile?

'this' @ [71:49] ==> <this> defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.asKtFile[ReceiverParameterDescriptorImpl]

'this' @ [72:22] ==> <this> defined in org.jetbrains.kotlin.idea.projectView.KotlinExpandNodeProjectViewProvider.asKtFile[ReceiverParameterDescriptorImpl]

'files' @ [73:37] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[DeserializedPropertyDescriptor]

'singleOrNull' @ [73:43] ==> public fun <T> Iterable<KtFile>.singleOrNull(): KtFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'kotlinOrigin' @ [74:28] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'containingFile' @ [74:42] ==> public final val KtClassOrObject.containingFile: PsiFile[MyPropertyDescriptor]

'ArrayList' @ [90:16] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (AbstractTreeNode<Any>..AbstractTreeNode<Any>?)>..Collection<(AbstractTreeNode<Any>..AbstractTreeNode<Any>?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> AbstractTreeNode<Any>

'children' @ [90:26] ==> value-parameter children: Collection<AbstractTreeNode<Any>> defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.modify[ValueParameterDescriptorImpl]

'!' @ [96:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [96:14] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[ValueParameterDescriptorImpl]

'isValid' @ [96:22] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'element' @ [97:20] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[ValueParameterDescriptorImpl]

'containingFile' @ [97:28] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [99:27] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'virtualFile' @ [99:32] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'!' @ [100:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fileInRoots' @ [100:14] ==> private final fun fileInRoots(file: VirtualFile?): Boolean defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider[SimpleFunctionDescriptorImpl]

'virtualFile' @ [100:26] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'file' @ [100:47] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'element' @ [102:23] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [102:31] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [102:47] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [102:63] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement.<anonymous>[ValueParameterDescriptorImpl]

'isSelectable' @ [102:66] ==> private final fun PsiElement.isSelectable(): Boolean defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider[SimpleFunctionDescriptorImpl]

'current' @ [104:13] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'current' @ [105:31] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'declarations' @ [105:39] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'singleOrNull' @ [105:52] ==> public fun <T> List<(KtDeclaration..KtDeclaration?)>.singleOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'virtualFile' @ [106:40] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'nameWithoutExtension' @ [106:53] ==> public final val VirtualFile.nameWithoutExtension: String[MyPropertyDescriptor]

'file' @ [106:77] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'name' @ [106:82] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'declaration' @ [107:17] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'nameWithoutExtension' @ [107:51] ==> val nameWithoutExtension: String defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'declaration' @ [107:75] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'name' @ [107:87] ==> public final val KtClassOrObject.name: String?[MyPropertyDescriptor]

'current' @ [108:17] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'declaration' @ [108:27] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'current' @ [112:16] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'file' @ [112:27] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.getTopLevelElement[LocalVariableDescriptor]

'when (this) {
        is KtFile -> true
        is KtDeclaration ->
            parent is KtFile ||
            ((parent as? KtClassBody)?.parent as? KtClassOrObject)?.isSelectable() ?: false
        else -> false
    }' @ [115:54] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [115:60] ==> <this> defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.isSelectable[ReceiverParameterDescriptorImpl]

'parent' @ [118:13] ==> public final val KtDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'?:' @ [119:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'parent' @ [119:15] ==> public final val KtDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [119:40] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'isSelectable' @ [119:69] ==> private final fun PsiElement.isSelectable(): Boolean defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider[SimpleFunctionDescriptorImpl]

'getInstance' @ [124:40] ==> public open fun getInstance(@NotNull p0: Project): (ProjectRootManager..ProjectRootManager?) defined in com.intellij.openapi.roots.ProjectRootManager[JavaMethodDescriptor]

'project' @ [124:52] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider[PropertyDescriptorImpl]

'fileIndex' @ [124:61] ==> public final val ProjectRootManager.fileIndex: ProjectFileIndex[MyPropertyDescriptor]

'file' @ [125:16] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.fileInRoots[ValueParameterDescriptorImpl]

'index' @ [125:33] ==> val index: ProjectFileIndex defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.fileInRoots[LocalVariableDescriptor]

'isInSourceContent' @ [125:39] ==> public abstract fun isInSourceContent(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [125:57] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.fileInRoots[ValueParameterDescriptorImpl]

'index' @ [125:66] ==> val index: ProjectFileIndex defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.fileInRoots[LocalVariableDescriptor]

'isInLibraryClasses' @ [125:72] ==> public abstract fun isInLibraryClasses(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [125:91] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.fileInRoots[ValueParameterDescriptorImpl]

'index' @ [125:100] ==> val index: ProjectFileIndex defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.fileInRoots[LocalVariableDescriptor]

'isInLibrarySource' @ [125:106] ==> public abstract fun isInLibrarySource(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [125:124] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.projectView.KotlinSelectInProjectViewProvider.fileInRoots[ValueParameterDescriptorImpl]

