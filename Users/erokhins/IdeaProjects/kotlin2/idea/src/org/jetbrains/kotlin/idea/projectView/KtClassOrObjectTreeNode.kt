'AbstractPsiBasedNode<KtClassOrObject>' @ [32:7] ==> protected/*protected and package*/ constructor AbstractPsiBasedNode<Value : (Any..Any?)>(p0: (Project..Project?), p1: (KtClassOrObject..KtClassOrObject?), p2: (ViewSettings..ViewSettings?)) defined in com.intellij.ide.projectView.impl.nodes.AbstractPsiBasedNode[JavaClassConstructorDescriptor]
Inferred types:
    <Value : (Any..Any?)> -> KtClassOrObject

'project' @ [32:45] ==> value-parameter project: Project? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.<init>[ValueParameterDescriptorImpl]

'ktClassOrObject' @ [32:54] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.<init>[ValueParameterDescriptorImpl]

'viewSettings' @ [32:71] ==> value-parameter viewSettings: ViewSettings defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.<init>[ValueParameterDescriptorImpl]

'value' @ [34:55] ==> public final var KtClassOrObjectTreeNode.value: (KtClassOrObject..KtClassOrObject?)[MyPropertyDescriptor]

'if (value != null && settings.isShowMembers) {
            value.getStructureDeclarations().map { declaration ->
                if (declaration is KtClassOrObject)
                    KtClassOrObjectTreeNode(project, declaration, settings)
                else
                    KtDeclarationTreeNode(project, declaration, settings)
            }
        }
        else {
            emptyList()
        }' @ [37:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<AbstractTreeNode<*>>?, elseBranch: Collection<AbstractTreeNode<*>>?): Collection<AbstractTreeNode<*>>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<AbstractTreeNode<*>>?

'value' @ [37:20] ==> public final var KtClassOrObjectTreeNode.value: (KtClassOrObject..KtClassOrObject?)[MyPropertyDescriptor]

'settings' @ [37:37] ==> public final val KtClassOrObjectTreeNode.settings: (ViewSettings..ViewSettings?)[MyPropertyDescriptor]

'isShowMembers' @ [37:46] ==> public final val ViewSettings.isShowMembers: Boolean[MyPropertyDescriptor]

'value' @ [38:13] ==> public final var KtClassOrObjectTreeNode.value: (KtClassOrObject..KtClassOrObject?)[MyPropertyDescriptor]

'getStructureDeclarations' @ [38:19] ==> public fun KtClassOrObject.getStructureDeclarations(): List<KtDeclaration> defined in org.jetbrains.kotlin.idea.structureView[DeserializedSimpleFunctionDescriptor]

'map' @ [38:46] ==> public inline fun <T, R> Iterable<KtDeclaration>.map(transform: (KtDeclaration) -> AbstractPsiBasedNode<out (KtDeclaration..KtDeclaration?)>): List<AbstractPsiBasedNode<out (KtDeclaration..KtDeclaration?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> AbstractPsiBasedNode<out (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)>

'if (declaration is KtClassOrObject)
                    KtClassOrObjectTreeNode(project, declaration, settings)
                else
                    KtDeclarationTreeNode(project, declaration, settings)' @ [39:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AbstractPsiBasedNode<out (KtDeclaration..KtDeclaration?)>, elseBranch: AbstractPsiBasedNode<out (KtDeclaration..KtDeclaration?)>): AbstractPsiBasedNode<out (KtDeclaration..KtDeclaration?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AbstractPsiBasedNode<out (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)>

'declaration' @ [39:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.getChildrenImpl.<anonymous>[ValueParameterDescriptorImpl]

'KtClassOrObjectTreeNode' @ [40:21] ==> public constructor KtClassOrObjectTreeNode(project: Project?, ktClassOrObject: KtClassOrObject, viewSettings: ViewSettings) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode[ClassConstructorDescriptorImpl]

'project' @ [40:45] ==> public final val KtClassOrObjectTreeNode.project: Project?[MyPropertyDescriptor]

'declaration' @ [40:54] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.getChildrenImpl.<anonymous>[ValueParameterDescriptorImpl]

'settings' @ [40:67] ==> public final val KtClassOrObjectTreeNode.settings: (ViewSettings..ViewSettings?)[MyPropertyDescriptor]

'KtDeclarationTreeNode' @ [42:21] ==> protected/*protected and package*/ constructor KtDeclarationTreeNode(project: (Project..Project?), ktDeclaration: (KtDeclaration..KtDeclaration?), viewSettings: (ViewSettings..ViewSettings?)) defined in org.jetbrains.kotlin.idea.projectView.KtDeclarationTreeNode[JavaClassConstructorDescriptor]

'project' @ [42:43] ==> public final val KtClassOrObjectTreeNode.project: Project?[MyPropertyDescriptor]

'declaration' @ [42:52] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.getChildrenImpl.<anonymous>[ValueParameterDescriptorImpl]

'settings' @ [42:65] ==> public final val KtClassOrObjectTreeNode.settings: (ViewSettings..ViewSettings?)[MyPropertyDescriptor]

'emptyList' @ [46:13] ==> public fun <T> emptyList(): List<AbstractTreeNode<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractTreeNode<*>

'project' @ [51:23] ==> public final val KtClassOrObjectTreeNode.project: Project?[MyPropertyDescriptor]

'project' @ [52:13] ==> val project: Project? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.update[LocalVariableDescriptor]

'getInstance' @ [53:25] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectView..ProjectView?) defined in com.intellij.ide.projectView.ProjectView[JavaMethodDescriptor]

'project' @ [53:37] ==> val project: Project? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.update[LocalVariableDescriptor]

'currentProjectViewPane' @ [53:46] ==> public final val ProjectView.currentProjectViewPane: (AbstractProjectViewPane..AbstractProjectViewPane?)[MyPropertyDescriptor]

'treeBuilder' @ [53:70] ==> public final var AbstractProjectViewPane.treeBuilder: (AbstractTreeBuilder..AbstractTreeBuilder?)[MyPropertyDescriptor]

'addSubtreeToUpdateByElement' @ [53:83] ==> public final fun addSubtreeToUpdateByElement(p0: (Any..Any?)): Boolean defined in com.intellij.ide.util.treeView.AbstractTreeBuilder[JavaMethodDescriptor]

'node' @ [53:111] ==> value-parameter node: AbstractTreeNode<*> defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.update[ValueParameterDescriptorImpl]

'value' @ [58:29] ==> public final var KtClassOrObjectTreeNode.value: (KtClassOrObject..KtClassOrObject?)[MyPropertyDescriptor]

'classOrObject' @ [59:13] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.updateImpl[LocalVariableDescriptor]

'data' @ [60:13] ==> value-parameter data: PresentationData defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.updateImpl[ValueParameterDescriptorImpl]

'presentableText' @ [60:18] ==> public final var PresentationData.presentableText: String?[MyPropertyDescriptor]

'classOrObject' @ [60:36] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.updateImpl[LocalVariableDescriptor]

'name' @ [60:50] ==> public final val KtClassOrObject.name: String?[MyPropertyDescriptor]

'parent' @ [62:26] ==> public final var KtClassOrObjectTreeNode.parent: raw (AbstractTreeNode<(Any..Any?)>..AbstractTreeNode<*>?)[MyPropertyDescriptor]

'if (KotlinIconProvider.getMainClass(classOrObject.containingKtFile) != null) {
                if (parent is KtFileTreeNode) {
                    update(parent.getParent())
                }
            }
            else {
                if (parent !is KtClassOrObjectTreeNode && parent !is KtFileTreeNode) {
                    update(parent)
                }
            }' @ [63:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'KotlinIconProvider' @ [63:17] ==> public companion object defined in org.jetbrains.kotlin.idea.KotlinIconProvider[FakeCallableDescriptorForObject]

'getMainClass' @ [63:36] ==> public final fun getMainClass(file: KtFile): KtClassOrObject? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [63:49] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.updateImpl[LocalVariableDescriptor]

'containingKtFile' @ [63:63] ==> public final val KtClassOrObject.containingKtFile: KtFile[MyPropertyDescriptor]

'parent' @ [64:21] ==> val parent: raw (AbstractTreeNode<(Any..Any?)>..AbstractTreeNode<*>?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.updateImpl[LocalVariableDescriptor]

'update' @ [65:21] ==> private final fun update(node: AbstractTreeNode<*>): Unit defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode[SimpleFunctionDescriptorImpl]

'parent' @ [65:28] ==> val parent: raw (AbstractTreeNode<(Any..Any?)>..AbstractTreeNode<*>?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.updateImpl[LocalVariableDescriptor]

'getParent' @ [65:35] ==> public final fun getParent(): raw (AbstractTreeNode<(Any..Any?)>..AbstractTreeNode<*>?) defined in com.intellij.ide.util.treeView.AbstractTreeNode[JavaMethodDescriptor]

'parent' @ [69:21] ==> val parent: raw (AbstractTreeNode<(Any..Any?)>..AbstractTreeNode<*>?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.updateImpl[LocalVariableDescriptor]

'parent' @ [69:59] ==> val parent: raw (AbstractTreeNode<(Any..Any?)>..AbstractTreeNode<*>?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.updateImpl[LocalVariableDescriptor]

'update' @ [70:21] ==> private final fun update(node: AbstractTreeNode<*>): Unit defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode[SimpleFunctionDescriptorImpl]

'parent' @ [70:28] ==> val parent: raw (AbstractTreeNode<(Any..Any?)>..AbstractTreeNode<*>?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.updateImpl[LocalVariableDescriptor]

'isDeprecated' @ [76:45] ==> public open fun isDeprecated(@NotNull p0: KtModifierListOwner): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'value' @ [76:58] ==> public final var KtClassOrObjectTreeNode.value: (KtClassOrObject..KtClassOrObject?)[MyPropertyDescriptor]

'!' @ [79:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValid' @ [79:14] ==> public final val KtClassOrObjectTreeNode.isValid: Boolean[MyPropertyDescriptor]

'super' @ [83:16] ==> <this> defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode[LazyClassReceiverParameterDescriptor]

'canRepresent' @ [83:22] ==> public open fun canRepresent(p0: (Any..Any?)): Boolean defined in com.intellij.ide.projectView.impl.nodes.AbstractPsiBasedNode[JavaMethodDescriptor]

'element' @ [83:35] ==> value-parameter element: Any? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresent[ValueParameterDescriptorImpl]

'canRepresentPsiElement' @ [83:47] ==> private final fun canRepresentPsiElement(value: PsiElement?, element: Any?, settings: ViewSettings): Boolean defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode[SimpleFunctionDescriptorImpl]

'value' @ [83:70] ==> public final var KtClassOrObjectTreeNode.value: (KtClassOrObject..KtClassOrObject?)[MyPropertyDescriptor]

'element' @ [83:77] ==> value-parameter element: Any? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresent[ValueParameterDescriptorImpl]

'settings' @ [83:86] ==> public final val KtClassOrObjectTreeNode.settings: (ViewSettings..ViewSettings?)[MyPropertyDescriptor]

'value' @ [87:13] ==> value-parameter value: PsiElement? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[ValueParameterDescriptorImpl]

'!' @ [87:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'value' @ [87:31] ==> value-parameter value: PsiElement? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[ValueParameterDescriptorImpl]

'isValid' @ [87:37] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'value' @ [91:20] ==> value-parameter value: PsiElement? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[ValueParameterDescriptorImpl]

'containingFile' @ [91:26] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [92:13] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[LocalVariableDescriptor]

'file' @ [92:30] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[LocalVariableDescriptor]

'element' @ [92:39] ==> value-parameter element: Any? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[ValueParameterDescriptorImpl]

'file' @ [92:50] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[LocalVariableDescriptor]

'virtualFile' @ [92:55] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'element' @ [92:71] ==> value-parameter element: Any? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[ValueParameterDescriptorImpl]

'value' @ [96:13] ==> value-parameter value: PsiElement? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[ValueParameterDescriptorImpl]

'element' @ [96:23] ==> value-parameter element: Any? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[ValueParameterDescriptorImpl]

'!' @ [100:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'settings' @ [100:14] ==> value-parameter settings: ViewSettings defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[ValueParameterDescriptorImpl]

'isShowMembers' @ [100:23] ==> public final val ViewSettings.isShowMembers: Boolean[MyPropertyDescriptor]

'element' @ [101:17] ==> value-parameter element: Any? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[ValueParameterDescriptorImpl]

'element' @ [101:42] ==> value-parameter element: Any? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[ValueParameterDescriptorImpl]

'containingFile' @ [101:50] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'element' @ [102:35] ==> value-parameter element: Any? defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[ValueParameterDescriptorImpl]

'containingFile' @ [102:43] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'elementFile' @ [103:21] ==> val elementFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[LocalVariableDescriptor]

'file' @ [103:44] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[LocalVariableDescriptor]

'elementFile' @ [104:28] ==> val elementFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[LocalVariableDescriptor]

'file' @ [104:43] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.projectView.KtClassOrObjectTreeNode.canRepresentPsiElement[LocalVariableDescriptor]

