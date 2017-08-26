'AbstractMemberPullPushTest' @ [35:37] ==> public constructor AbstractMemberPullPushTest() defined in org.jetbrains.kotlin.idea.refactoring.AbstractMemberPullPushTest[ClassConstructorDescriptorImpl]

'findStringWithPrefixes' @ [36:75] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'file' @ [36:98] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.getTargetClassName[ValueParameterDescriptorImpl]

'text' @ [36:103] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'doTest' @ [39:9] ==> protected final fun doTest(path: String, action: (mainFile: PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest[SimpleFunctionDescriptorImpl]

'path' @ [39:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doKotlinTest[ValueParameterDescriptorImpl]

'getTargetClassName' @ [40:35] ==> private final fun getTargetClassName(file: PsiFile): String? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest[SimpleFunctionDescriptorImpl]

'file' @ [40:54] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doKotlinTest.<anonymous>[ValueParameterDescriptorImpl]

'chooseMembers' @ [42:79] ==> internal fun <T : MemberInfoBase<*>> chooseMembers(members: List<KotlinMemberInfo>): List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : MemberInfoBase<*>> -> KotlinMemberInfo

'members' @ [42:93] ==> value-parameter members: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doKotlinTest.<anonymous>.<no name provided>.adjustMembers[ValueParameterDescriptorImpl]

'targetClassName' @ [45:25] ==> val targetClassName: String? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doKotlinTest.<anonymous>[LocalVariableDescriptor]

'superClasses' @ [46:32] ==> value-parameter superClasses: List<PsiNamedElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doKotlinTest.<anonymous>.<no name provided>.chooseSuperClass[ValueParameterDescriptorImpl]

'single' @ [46:45] ==> public inline fun <T> Iterable<PsiNamedElement>.single(predicate: (PsiNamedElement) -> Boolean): PsiNamedElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'it' @ [46:54] ==> value-parameter it: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doKotlinTest.<anonymous>.<no name provided>.chooseSuperClass.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedClassNameForRendering' @ [46:57] ==> public fun PsiNamedElement.qualifiedClassNameForRendering(): String defined in org.jetbrains.kotlin.idea.refactoring.memberInfo[DeserializedSimpleFunctionDescriptor]

'targetClassName' @ [46:93] ==> val targetClassName: String? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doKotlinTest.<anonymous>[LocalVariableDescriptor]

'superClasses' @ [48:28] ==> value-parameter superClasses: List<PsiNamedElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doKotlinTest.<anonymous>.<no name provided>.chooseSuperClass[ValueParameterDescriptorImpl]

'first' @ [48:41] ==> public fun <T> List<PsiNamedElement>.first(): PsiNamedElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'KotlinPullUpHandler' @ [51:13] ==> public constructor KotlinPullUpHandler() defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHandler[DeserializedClassConstructorDescriptor]

'invoke' @ [51:35] ==> public final operator fun invoke(project: Project, editor: Editor, file: PsiFile, dataContext: (((String..String?)) -> Any?)?): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHandler[MyFunctionDescriptor]

'project' @ [51:42] ==> public final val AbstractPullUpTest.project: Project[MyPropertyDescriptor]

'editor' @ [51:51] ==> public final val AbstractPullUpTest.editor: Editor[MyPropertyDescriptor]

'file' @ [51:59] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doKotlinTest.<anonymous>[ValueParameterDescriptorImpl]

'if (it == KotlinPullUpHandler.PULL_UP_TEST_HELPER_KEY) helper else null' @ [52:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: <no name provided>?, elseBranch: <no name provided>?): <no name provided>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> <no name provided>?

'it' @ [52:21] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doKotlinTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'PULL_UP_TEST_HELPER_KEY' @ [52:47] ==> public final val PULL_UP_TEST_HELPER_KEY: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHandler.Companion[DeserializedPropertyDescriptor]

'helper' @ [52:72] ==> val helper: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doKotlinTest.<anonymous>[LocalVariableDescriptor]

'doTest' @ [59:9] ==> protected final fun doTest(path: String, action: (mainFile: PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest[SimpleFunctionDescriptorImpl]

'path' @ [59:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest[ValueParameterDescriptorImpl]

'getFile' @ [60:29] ==> @Override public open fun getFile(): (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest[JavaMethodDescriptor]

'findElementAt' @ [60:39] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'editor' @ [60:53] ==> public final val AbstractPullUpTest.editor: Editor[MyPropertyDescriptor]

'caretModel' @ [60:60] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [60:71] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'!!' @ [61:31] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiClass?): PsiClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiClass

'getParentOfType' @ [61:43] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(PsiClass..PsiClass?)>): PsiClass? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'elementAt' @ [61:59] ==> val elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'java' @ [61:86] ==> public val <T> KClass<PsiClass>.java: Class<PsiClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiClass

'getTargetClassName' @ [63:35] ==> private final fun getTargetClassName(file: PsiFile): String? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest[SimpleFunctionDescriptorImpl]

'file' @ [63:54] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[ValueParameterDescriptorImpl]

'createBasesList' @ [64:57] ==> public open fun createBasesList(p0: (PsiClass..PsiClass?), p1: Boolean, p2: Boolean): (ArrayList<(PsiClass..PsiClass?)>..ArrayList<(PsiClass..PsiClass?)>?) defined in com.intellij.refactoring.util.RefactoringHierarchyUtil[JavaMethodDescriptor]

'sourceClass' @ [64:73] ==> val sourceClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'targetClassName' @ [65:31] ==> val targetClassName: String? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'let' @ [65:48] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> (PsiClass..PsiClass?)): (PsiClass..PsiClass?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'superClasses' @ [65:62] ==> val superClasses: (ArrayList<(PsiClass..PsiClass?)>..ArrayList<(PsiClass..PsiClass?)>?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'first' @ [65:75] ==> public inline fun <T> Iterable<(PsiClass..PsiClass?)>.first(predicate: ((PsiClass..PsiClass?)) -> Boolean): (PsiClass..PsiClass?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'it' @ [65:83] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [65:86] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'name' @ [65:103] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'superClasses' @ [65:115] ==> val superClasses: (ArrayList<(PsiClass..PsiClass?)>..ArrayList<(PsiClass..PsiClass?)>?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'first' @ [65:128] ==> public fun <T> List<(PsiClass..PsiClass?)>.first(): (PsiClass..PsiClass?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'MemberInfoStorage' @ [67:27] ==> public constructor MemberInfoStorage(p0: (PsiClass..PsiClass?), p1: (((PsiMember..PsiMember?)) -> Boolean..(((PsiMember..PsiMember?)) -> Boolean)?)) defined in com.intellij.refactoring.util.classMembers.MemberInfoStorage[SamAdapterClassConstructorDescriptor]

'sourceClass' @ [67:45] ==> val sourceClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'chooseMembers' @ [68:34] ==> internal fun <T : MemberInfoBase<*>> chooseMembers(members: List<(MemberInfo..MemberInfo?)>): List<(MemberInfo..MemberInfo?)> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : MemberInfoBase<*>> -> (com.intellij.refactoring.util.classMembers.MemberInfo..com.intellij.refactoring.util.classMembers.MemberInfo?)

'storage' @ [68:48] ==> val storage: MemberInfoStorage defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'getClassMemberInfos' @ [68:56] ==> public open fun getClassMemberInfos(p0: (PsiClass..PsiClass?)): (MutableList<(MemberInfo..MemberInfo?)>..List<(MemberInfo..MemberInfo?)>?) defined in com.intellij.refactoring.util.classMembers.MemberInfoStorage[JavaMethodDescriptor]

'sourceClass' @ [68:76] ==> val sourceClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'memberInfoList' @ [69:31] ==> val memberInfoList: List<(MemberInfo..MemberInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [69:46] ==> public inline fun <reified T> Collection<(MemberInfo..MemberInfo?)>.toTypedArray(): Array<(MemberInfo..MemberInfo?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (com.intellij.refactoring.util.classMembers.MemberInfo..com.intellij.refactoring.util.classMembers.MemberInfo?)

'targetClass' @ [71:35] ==> val targetClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'containingFile' @ [71:47] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'containingDirectory' @ [71:62] ==> public final val PsiFile.containingDirectory: (PsiDirectory..PsiDirectory?)[MyPropertyDescriptor]

'checkConflicts' @ [72:49] ==> public final fun checkConflicts(p0: (Array<(MemberInfoBase<out (PsiMember..PsiMember?)>..MemberInfoBase<out (PsiMember..PsiMember?)>?)>..Array<out (MemberInfoBase<out (PsiMember..PsiMember?)>..MemberInfoBase<out (PsiMember..PsiMember?)>?)>?), @NotNull p1: PsiClass, @Nullable p2: PsiClass?, @NotNull p3: PsiPackage, @NotNull p4: PsiDirectory, p5: (((PsiMethod..PsiMethod?)) -> Boolean..(((PsiMethod..PsiMethod?)) -> Boolean)?), p6: Boolean): (MultiMap<(PsiElement..PsiElement?), (String..String?)>..MultiMap<(PsiElement..PsiElement?), (String..String?)>?) defined in com.intellij.refactoring.memberPullUp.PullUpConflictsUtil[SamAdapterFunctionDescriptor]

'memberInfos' @ [73:21] ==> val memberInfos: Array<(MemberInfo..MemberInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'sourceClass' @ [74:21] ==> val sourceClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'targetClass' @ [75:21] ==> val targetClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'targetDirectory' @ [76:21] ==> val targetDirectory: (PsiDirectory..PsiDirectory?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'getPackage' @ [76:37] ==> public fun PsiDirectory.getPackage(): PsiPackage? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'targetDirectory' @ [77:21] ==> val targetDirectory: (PsiDirectory..PsiDirectory?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'checkedInterfacesContain' @ [78:64] ==> public open fun checkedInterfacesContain(p0: (MutableCollection<out (MemberInfoBase<out (PsiMember..PsiMember?)>..MemberInfoBase<out (PsiMember..PsiMember?)>?)>..Collection<(MemberInfoBase<out (PsiMember..PsiMember?)>..MemberInfoBase<out (PsiMember..PsiMember?)>?)>?), p1: (PsiMethod..PsiMethod?)): Boolean defined in com.intellij.refactoring.memberPullUp.PullUpProcessor[JavaMethodDescriptor]

'memberInfoList' @ [78:89] ==> val memberInfoList: List<(MemberInfo..MemberInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'psiMethod' @ [78:105] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [81:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'conflicts' @ [81:18] ==> val conflicts: (MultiMap<(PsiElement..PsiElement?), (String..String?)>..MultiMap<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [81:28] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MultiMap<(PsiElement..PsiElement?), (String..String?)>.isEmpty: Boolean[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'ConflictsInTestsException' @ [81:68] ==> public constructor ConflictsInTestsException(@NotNull p0: (MutableCollection<out (String..String?)>..Collection<(String..String?)>)) defined in com.intellij.refactoring.BaseRefactoringProcessor.ConflictsInTestsException[JavaClassConstructorDescriptor]

'conflicts' @ [81:94] ==> val conflicts: (MultiMap<(PsiElement..PsiElement?), (String..String?)>..MultiMap<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'values' @ [81:104] ==> @NotNull public open fun values(): (MutableCollection<out (String..String?)>..Collection<(String..String?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'PullUpProcessor' @ [83:13] ==> public constructor PullUpProcessor(p0: (PsiClass..PsiClass?), p1: (PsiClass..PsiClass?), p2: (Array<(MemberInfo..MemberInfo?)>..Array<out (MemberInfo..MemberInfo?)>?), p3: raw (DocCommentPolicy<(PsiComment..PsiComment?)>..DocCommentPolicy<*>?)) defined in com.intellij.refactoring.memberPullUp.PullUpProcessor[JavaClassConstructorDescriptor]

'sourceClass' @ [83:29] ==> val sourceClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'targetClass' @ [83:42] ==> val targetClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'memberInfos' @ [83:55] ==> val memberInfos: Array<(MemberInfo..MemberInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.AbstractPullUpTest.doJavaTest.<anonymous>[LocalVariableDescriptor]

'DocCommentPolicy' @ [83:68] ==> public constructor DocCommentPolicy<T : (PsiComment..PsiComment?)>(p0: Int) defined in com.intellij.refactoring.util.DocCommentPolicy[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiComment..PsiComment?)> -> PsiComment

'ASIS' @ [83:114] ==> public const final val ASIS: Int defined in com.intellij.refactoring.util.DocCommentPolicy[JavaPropertyDescriptor]

'run' @ [83:121] ==> public final fun run(): Unit defined in com.intellij.refactoring.memberPullUp.PullUpProcessor[JavaMethodDescriptor]

'dispatchAllInvocationEvents' @ [84:20] ==> public open fun dispatchAllInvocationEvents(): Unit defined in com.intellij.util.ui.UIUtil[JavaMethodDescriptor]

