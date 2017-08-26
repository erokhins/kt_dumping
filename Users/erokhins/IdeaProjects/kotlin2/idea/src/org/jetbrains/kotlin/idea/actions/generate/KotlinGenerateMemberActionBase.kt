'KotlinGenerateActionBase' @ [30:61] ==> public constructor KotlinGenerateActionBase() defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateActionBase[ClassConstructorDescriptorImpl]

'!' @ [36:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'prepareEditorForWrite' @ [36:34] ==> @Deprecated public open fun prepareEditorForWrite(@NotNull p0: Editor): Boolean defined in com.intellij.codeInsight.CodeInsightUtilBase[JavaMethodDescriptor]

'editor' @ [36:56] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.invoke[ValueParameterDescriptorImpl]

'!' @ [37:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [37:34] ==> @NotNull public open fun getInstance(): FileDocumentManager defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'requestWriting' @ [37:48] ==> public abstract fun requestWriting(@NotNull p0: Document, @Nullable p1: Project?): Boolean defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'editor' @ [37:63] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.invoke[ValueParameterDescriptorImpl]

'document' @ [37:70] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'project' @ [37:80] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.invoke[ValueParameterDescriptorImpl]

'getTargetClass' @ [38:27] ==> protected open fun getTargetClass(editor: Editor, file: PsiFile): KtClassOrObject? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase[SimpleFunctionDescriptorImpl]

'editor' @ [38:42] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.invoke[ValueParameterDescriptorImpl]

'file' @ [38:50] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.invoke[ValueParameterDescriptorImpl]

'doInvoke' @ [39:9] ==> public final fun doInvoke(project: Project, editor: Editor?, targetClass: KtClassOrObject): Unit defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase[SimpleFunctionDescriptorImpl]

'project' @ [39:18] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.invoke[ValueParameterDescriptorImpl]

'editor' @ [39:27] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.invoke[ValueParameterDescriptorImpl]

'targetClass' @ [39:35] ==> val targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.invoke[LocalVariableDescriptor]

'prepareMembersInfo' @ [43:27] ==> protected abstract fun prepareMembersInfo(klass: KtClassOrObject, project: Project, editor: Editor?): Info? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase[SimpleFunctionDescriptorImpl]

'targetClass' @ [43:46] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke[ValueParameterDescriptorImpl]

'project' @ [43:59] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke[ValueParameterDescriptorImpl]

'editor' @ [43:68] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke[ValueParameterDescriptorImpl]

'project' @ [45:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [45:17] ==> public fun <T> Project.executeWriteCommand(name: String, groupId: Any? = ..., command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'commandName' @ [45:37] ==> protected/*protected and package*/ for synthetic extension final val <Info : Any> KotlinGenerateMemberActionBase<Info>.commandName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <Info : Any> -> Info

'this' @ [45:50] ==> <this> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase[LazyClassReceiverParameterDescriptor]

'generateMembers' @ [46:30] ==> protected abstract fun generateMembers(project: Project, editor: Editor?, info: Info): List<KtDeclaration> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase[SimpleFunctionDescriptorImpl]

'project' @ [46:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke[ValueParameterDescriptorImpl]

'editor' @ [46:55] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke[ValueParameterDescriptorImpl]

'membersInfo' @ [46:63] ==> val membersInfo: Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke[LocalVariableDescriptor]

'cleanupElements' @ [47:41] ==> public open fun cleanupElements(@NotNull p0: Project, @Nullable p1: Runnable?, @NotNull vararg p2: (PsiElement..PsiElement?)): Unit defined in com.intellij.codeInspection.ex.GlobalInspectionContextBase[JavaMethodDescriptor]

'project' @ [47:57] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke[ValueParameterDescriptorImpl]

'newMembers' @ [47:73] ==> val newMembers: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [47:84] ==> public inline fun <reified T> Collection<KtDeclaration>.toTypedArray(): Array<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtDeclaration

'editor' @ [48:17] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke[ValueParameterDescriptorImpl]

'newMembers' @ [49:17] ==> val newMembers: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke.<anonymous>[LocalVariableDescriptor]

'firstOrNull' @ [49:28] ==> public fun <T> List<KtDeclaration>.firstOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'let' @ [49:43] ==> @InlineOnly public inline fun <T, R> KtDeclaration.let(block: (KtDeclaration) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> Unit

'positionCaret' @ [49:69] ==> public open fun positionCaret(@NotNull p0: Editor, @NotNull p1: PsiElement, p2: Boolean): Unit defined in com.intellij.codeInsight.generation.GenerateMembersUtil[JavaMethodDescriptor]

'editor' @ [49:83] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke[ValueParameterDescriptorImpl]

'it' @ [49:91] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase.doInvoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

