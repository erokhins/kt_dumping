'AbstractMemberPullPushTest' @ [30:39] ==> public constructor AbstractMemberPullPushTest() defined in org.jetbrains.kotlin.idea.refactoring.AbstractMemberPullPushTest[ClassConstructorDescriptorImpl]

'doTest' @ [32:9] ==> protected final fun doTest(path: String, action: (mainFile: PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest[SimpleFunctionDescriptorImpl]

'path' @ [32:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest.doKotlinTest[ValueParameterDescriptorImpl]

'chooseMembers' @ [34:79] ==> internal fun <T : MemberInfoBase<*>> chooseMembers(members: List<KotlinMemberInfo>): List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : MemberInfoBase<*>> -> KotlinMemberInfo

'members' @ [34:93] ==> value-parameter members: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest.doKotlinTest.<anonymous>.<no name provided>.adjustMembers[ValueParameterDescriptorImpl]

'KotlinPushDownHandler' @ [36:13] ==> public constructor KotlinPushDownHandler() defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownHandler[DeserializedClassConstructorDescriptor]

'invoke' @ [36:37] ==> public final operator fun invoke(project: Project, editor: Editor, file: PsiFile, dataContext: (((String..String?)) -> Any?)?): Unit defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownHandler[MyFunctionDescriptor]

'project' @ [36:44] ==> public final val AbstractPushDownTest.project: Project[MyPropertyDescriptor]

'editor' @ [36:53] ==> public final val AbstractPushDownTest.editor: Editor[MyPropertyDescriptor]

'file' @ [36:61] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest.doKotlinTest.<anonymous>[ValueParameterDescriptorImpl]

'if (it == KotlinPushDownHandler.PUSH_DOWN_TEST_HELPER_KEY) helper else null' @ [37:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: <no name provided>?, elseBranch: <no name provided>?): <no name provided>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> <no name provided>?

'it' @ [37:21] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest.doKotlinTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'PUSH_DOWN_TEST_HELPER_KEY' @ [37:49] ==> public final val PUSH_DOWN_TEST_HELPER_KEY: String defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownHandler.Companion[DeserializedPropertyDescriptor]

'helper' @ [37:76] ==> val helper: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest.doKotlinTest.<anonymous>[LocalVariableDescriptor]

'doTest' @ [43:9] ==> protected final fun doTest(path: String, action: (mainFile: PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest[SimpleFunctionDescriptorImpl]

'path' @ [43:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest.doJavaTest[ValueParameterDescriptorImpl]

'file' @ [44:29] ==> public final val AbstractPushDownTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'findElementAt' @ [44:34] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'editor' @ [44:48] ==> public final val AbstractPushDownTest.editor: Editor[MyPropertyDescriptor]

'caretModel' @ [44:55] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [44:66] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'!!' @ [45:31] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiClass?): PsiClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiClass

'getParentOfType' @ [45:43] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(PsiClass..PsiClass?)>): PsiClass? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'elementAt' @ [45:59] ==> val elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'java' @ [45:86] ==> public val <T> KClass<PsiClass>.java: Class<PsiClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiClass

'MemberInfoStorage' @ [46:27] ==> public constructor MemberInfoStorage(p0: (PsiClass..PsiClass?), p1: (((PsiMember..PsiMember?)) -> Boolean..(((PsiMember..PsiMember?)) -> Boolean)?)) defined in com.intellij.refactoring.util.classMembers.MemberInfoStorage[SamAdapterClassConstructorDescriptor]

'sourceClass' @ [46:45] ==> val sourceClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'chooseMembers' @ [47:31] ==> internal fun <T : MemberInfoBase<*>> chooseMembers(members: List<(MemberInfo..MemberInfo?)>): List<(MemberInfo..MemberInfo?)> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : MemberInfoBase<*>> -> (com.intellij.refactoring.util.classMembers.MemberInfo..com.intellij.refactoring.util.classMembers.MemberInfo?)

'storage' @ [47:45] ==> val storage: MemberInfoStorage defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'getClassMemberInfos' @ [47:53] ==> public open fun getClassMemberInfos(p0: (PsiClass..PsiClass?)): (MutableList<(MemberInfo..MemberInfo?)>..List<(MemberInfo..MemberInfo?)>?) defined in com.intellij.refactoring.util.classMembers.MemberInfoStorage[JavaMethodDescriptor]

'sourceClass' @ [47:73] ==> val sourceClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'PushDownProcessor' @ [49:13] ==> public constructor PushDownProcessor<MemberInfo : (MemberInfoBase<(PsiMember..PsiMember?)>..MemberInfoBase<(PsiMember..PsiMember?)>?), Member : (PsiElement..PsiElement?), Klass : (PsiElement..PsiElement?)>(@NotNull p0: PsiClass, @NotNull p1: (MutableList<(MemberInfo..MemberInfo?)>..List<(MemberInfo..MemberInfo?)>), @NotNull p2: raw (DocCommentPolicy<(PsiComment..PsiComment?)>..DocCommentPolicy<*>)) defined in com.intellij.refactoring.memberPushDown.PushDownProcessor[JavaClassConstructorDescriptor]
Inferred types:
    <MemberInfo : (MemberInfoBase<(Member..Member?)>..MemberInfoBase<(Member..Member?)>?)> -> (com.intellij.refactoring.util.classMembers.MemberInfo..com.intellij.refactoring.util.classMembers.MemberInfo?)
    <Member : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiMember..com.intellij.psi.PsiMember?)
    <Klass : (PsiElement..PsiElement?)> -> PsiClass

'sourceClass' @ [49:31] ==> val sourceClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'memberInfos' @ [49:44] ==> val memberInfos: List<(MemberInfo..MemberInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.AbstractPushDownTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'DocCommentPolicy' @ [49:57] ==> public constructor DocCommentPolicy<T : (PsiComment..PsiComment?)>(p0: Int) defined in com.intellij.refactoring.util.DocCommentPolicy[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiComment..PsiComment?)> -> PsiComment

'ASIS' @ [49:103] ==> public const final val ASIS: Int defined in com.intellij.refactoring.util.DocCommentPolicy[JavaPropertyDescriptor]

'run' @ [49:110] ==> public final fun run(): Unit defined in com.intellij.refactoring.memberPushDown.PushDownProcessor[JavaMethodDescriptor]

'dispatchAllInvocationEvents' @ [50:20] ==> public open fun dispatchAllInvocationEvents(): Unit defined in com.intellij.util.ui.UIUtil[JavaMethodDescriptor]

