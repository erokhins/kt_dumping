'classOrObject' @ [39:26] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.collectMembersToGenerate[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [39:40] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'emptySet' @ [39:92] ==> public fun <T> emptySet(): Set<OverrideMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OverrideMemberChooserObject

'collectMembersToGenerate' @ [40:16] ==> protected abstract fun collectMembersToGenerate(descriptor: ClassDescriptor, project: Project): Collection<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler[SimpleFunctionDescriptorImpl]

'descriptor' @ [40:41] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.collectMembersToGenerate[LocalVariableDescriptor]

'classOrObject' @ [40:53] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.collectMembersToGenerate[ValueParameterDescriptorImpl]

'project' @ [40:67] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'MemberChooser' @ [46:23] ==> public constructor MemberChooser<T : (ClassMember..ClassMember?)>(p0: (Array<(OverrideMemberChooserObject..OverrideMemberChooserObject?)>..Array<out (OverrideMemberChooserObject..OverrideMemberChooserObject?)>?), p1: Boolean, p2: Boolean, @NotNull p3: Project) defined in com.intellij.ide.util.MemberChooser[JavaClassConstructorDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> OverrideMemberChooserObject

'members' @ [46:37] ==> value-parameter members: Array<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.showOverrideImplementChooser[ValueParameterDescriptorImpl]

'project' @ [46:58] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.showOverrideImplementChooser[ValueParameterDescriptorImpl]

'chooser' @ [47:9] ==> val chooser: MemberChooser<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.showOverrideImplementChooser[LocalVariableDescriptor]

'title' @ [47:17] ==> public final var <T : (ClassMember..ClassMember?)> MemberChooser<OverrideMemberChooserObject>.title: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> OverrideMemberChooserObject

'getChooserTitle' @ [47:25] ==> protected abstract fun getChooserTitle(): String defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler[SimpleFunctionDescriptorImpl]

'chooser' @ [48:9] ==> val chooser: MemberChooser<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.showOverrideImplementChooser[LocalVariableDescriptor]

'show' @ [48:17] ==> public open fun show(): Unit defined in com.intellij.ide.util.MemberChooser[JavaMethodDescriptor]

'chooser' @ [49:13] ==> val chooser: MemberChooser<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.showOverrideImplementChooser[LocalVariableDescriptor]

'exitCode' @ [49:21] ==> public final val <T : (ClassMember..ClassMember?)> MemberChooser<OverrideMemberChooserObject>.exitCode: Int[MyPropertyDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> OverrideMemberChooserObject

'OK_EXIT_CODE' @ [49:47] ==> public const final val OK_EXIT_CODE: Int defined in com.intellij.openapi.ui.DialogWrapper[JavaPropertyDescriptor]

'chooser' @ [50:16] ==> val chooser: MemberChooser<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.showOverrideImplementChooser[LocalVariableDescriptor]

'file' @ [58:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.isValidFor[ValueParameterDescriptorImpl]

'file' @ [59:30] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.isValidFor[ValueParameterDescriptorImpl]

'findElementAt' @ [59:35] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'editor' @ [59:49] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.isValidFor[ValueParameterDescriptorImpl]

'caretModel' @ [59:56] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [59:67] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'elementAtCaret' @ [60:29] ==> val elementAtCaret: PsiElement? defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.isValidFor[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [60:45] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'classOrObject' @ [61:16] ==> val classOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.isValidFor[LocalVariableDescriptor]

'isValidForClass' @ [61:41] ==> protected open fun isValidForClass(classOrObject: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler[SimpleFunctionDescriptorImpl]

'classOrObject' @ [61:57] ==> val classOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.isValidFor[LocalVariableDescriptor]

'file' @ [67:30] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[ValueParameterDescriptorImpl]

'findElementAt' @ [67:35] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'editor' @ [67:49] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [67:56] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [67:67] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'elementAtCaret' @ [68:29] ==> val elementAtCaret: PsiElement? defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [68:45] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'!' @ [70:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [70:38] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'prepareFileForWrite' @ [70:52] ==> public abstract fun prepareFileForWrite(@Nullable p0: PsiFile?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'file' @ [70:72] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[ValueParameterDescriptorImpl]

'collectMembersToGenerate' @ [72:23] ==> public final fun collectMembersToGenerate(classOrObject: KtClassOrObject): Collection<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler[SimpleFunctionDescriptorImpl]

'classOrObject' @ [72:48] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'members' @ [73:13] ==> val members: Collection<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'isEmpty' @ [73:21] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'!' @ [73:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'implementAll' @ [73:35] ==> value-parameter implementAll: Boolean defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[ValueParameterDescriptorImpl]

'getInstance' @ [74:25] ==> public open fun getInstance(): (HintManager..HintManager?) defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'showErrorHint' @ [74:39] ==> public abstract fun showErrorHint(@NotNull p0: Editor, @NotNull p1: String): Unit defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'editor' @ [74:53] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[ValueParameterDescriptorImpl]

'getNoMembersFoundHint' @ [74:61] ==> protected abstract fun getNoMembersFoundHint(): String defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler[SimpleFunctionDescriptorImpl]

'if (implementAll) {
            selectedElements = members
            copyDoc = false
        }
        else {
            val chooser = showOverrideImplementChooser(project, members.toTypedArray()) ?: return
            selectedElements = chooser.selectedElements ?: return
            copyDoc = chooser.isCopyJavadoc
        }' @ [80:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'implementAll' @ [80:13] ==> value-parameter implementAll: Boolean defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[ValueParameterDescriptorImpl]

'selectedElements' @ [81:13] ==> val selectedElements: Collection<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'members' @ [81:32] ==> val members: Collection<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'copyDoc' @ [82:13] ==> val copyDoc: Boolean defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'showOverrideImplementChooser' @ [85:27] ==> private final fun showOverrideImplementChooser(project: Project, members: Array<OverrideMemberChooserObject>): MemberChooser<OverrideMemberChooserObject>? defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler[SimpleFunctionDescriptorImpl]

'project' @ [85:56] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[ValueParameterDescriptorImpl]

'members' @ [85:65] ==> val members: Collection<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'toTypedArray' @ [85:73] ==> public inline fun <reified T> Collection<OverrideMemberChooserObject>.toTypedArray(): Array<OverrideMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> OverrideMemberChooserObject

'selectedElements' @ [86:13] ==> val selectedElements: Collection<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'chooser' @ [86:32] ==> val chooser: MemberChooser<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'selectedElements' @ [86:40] ==> public final val <T : (ClassMember..ClassMember?)> MemberChooser<OverrideMemberChooserObject>.selectedElements: (MutableList<(OverrideMemberChooserObject..OverrideMemberChooserObject?)>?..List<(OverrideMemberChooserObject..OverrideMemberChooserObject?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> OverrideMemberChooserObject

'copyDoc' @ [87:13] ==> val copyDoc: Boolean defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'chooser' @ [87:23] ==> val chooser: MemberChooser<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'isCopyJavadoc' @ [87:31] ==> public final val <T : (ClassMember..ClassMember?)> MemberChooser<OverrideMemberChooserObject>.isCopyJavadoc: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> OverrideMemberChooserObject

'selectedElements' @ [89:13] ==> val selectedElements: Collection<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'isEmpty' @ [89:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [91:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [91:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[ValueParameterDescriptorImpl]

'commitAllDocuments' @ [91:49] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'generateMembers' @ [93:9] ==> public final fun generateMembers(editor: Editor?, classOrObject: KtClassOrObject, selectedElements: Collection<OverrideMemberChooserObject>, copyDoc: Boolean): Unit defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.Companion[SimpleFunctionDescriptorImpl]

'editor' @ [93:25] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[ValueParameterDescriptorImpl]

'classOrObject' @ [93:33] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'selectedElements' @ [93:48] ==> val selectedElements: Collection<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'copyDoc' @ [93:66] ==> val copyDoc: Boolean defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[LocalVariableDescriptor]

'invoke' @ [97:9] ==> public final fun invoke(project: Project, editor: Editor, file: PsiFile, implementAll: Boolean): Unit defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler[SimpleFunctionDescriptorImpl]

'project' @ [97:16] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [97:25] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[ValueParameterDescriptorImpl]

'file' @ [97:33] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.invoke[ValueParameterDescriptorImpl]

'getApplication' @ [97:73] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [97:90] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'classOrObject' @ [109:27] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.Companion.generateMembers[ValueParameterDescriptorImpl]

'project' @ [109:41] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'insertMembersAfter' @ [110:13] ==> public fun <T : KtDeclaration> insertMembersAfter(editor: Editor?, classOrObject: KtClassOrObject, members: Collection<KtCallableDeclaration>, anchor: PsiElement? = ...): List<KtCallableDeclaration> defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : KtDeclaration> -> KtCallableDeclaration

'editor' @ [110:32] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.Companion.generateMembers[ValueParameterDescriptorImpl]

'classOrObject' @ [110:40] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.Companion.generateMembers[ValueParameterDescriptorImpl]

'selectedElements' @ [110:55] ==> value-parameter selectedElements: Collection<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.Companion.generateMembers[ValueParameterDescriptorImpl]

'map' @ [110:72] ==> public inline fun <T, R> Iterable<OverrideMemberChooserObject>.map(transform: (OverrideMemberChooserObject) -> KtCallableDeclaration): List<KtCallableDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OverrideMemberChooserObject
    <R> -> KtCallableDeclaration

'it' @ [110:78] ==> value-parameter it: OverrideMemberChooserObject defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.Companion.generateMembers.<anonymous>[ValueParameterDescriptorImpl]

'generateMember' @ [110:81] ==> public fun OverrideMemberChooserObject.generateMember(project: Project, copyDoc: Boolean): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.core.overrideImplement in file OverrideMemberChooserObject.kt[SimpleFunctionDescriptorImpl]

'project' @ [110:96] ==> val project: Project defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.Companion.generateMembers[LocalVariableDescriptor]

'copyDoc' @ [110:105] ==> value-parameter copyDoc: Boolean defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideImplementMembersHandler.Companion.generateMembers[ValueParameterDescriptorImpl]

