'ChangeSignatureProcessorBase' @ [43:5] ==> protected/*protected and package*/ constructor ChangeSignatureProcessorBase(p0: (Project..Project?), p1: (ChangeInfo..ChangeInfo?)) defined in com.intellij.refactoring.changeSignature.ChangeSignatureProcessorBase[JavaClassConstructorDescriptor]

'project' @ [43:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.<init>[ValueParameterDescriptorImpl]

'KotlinChangeInfoWrapper' @ [43:43] ==> public constructor KotlinChangeInfoWrapper(delegate: KotlinChangeInfo) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfoWrapper[ClassConstructorDescriptorImpl]

'changeInfo' @ [43:67] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.<init>[ValueParameterDescriptorImpl]

'changeInfo' @ [45:17] ==> public final val KotlinChangeSignatureProcessor.changeInfo: KotlinChangeInfoWrapper[MyPropertyDescriptor]

'delegate' @ [45:28] ==> public final var delegate: KotlinChangeInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfoWrapper[PropertyDescriptorImpl]

'if (ktChangeInfo.kind.isConstructor) "constructor" else "function"' @ [48:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'ktChangeInfo' @ [48:27] ==> public final val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[PropertyDescriptorImpl]

'kind' @ [48:40] ==> public val KotlinChangeInfo.kind: KotlinMethodDescriptor.Kind defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeInfo.kt[PropertyDescriptorImpl]

'isConstructor' @ [48:45] ==> public final val isConstructor: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[PropertyDescriptorImpl]

'KotlinUsagesViewDescriptor' @ [49:16] ==> public constructor KotlinUsagesViewDescriptor(element: PsiElement, elementsHeader: String) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinUsagesViewDescriptor[ClassConstructorDescriptorImpl]

'myChangeInfo' @ [49:43] ==> protected/*protected and package*/ final val myChangeInfo: (ChangeInfo..ChangeInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[JavaPropertyDescriptor]

'method' @ [49:56] ==> public final val ChangeInfo.method: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'message' @ [49:82] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'subject' @ [49:115] ==> val subject: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.createUsageViewDescriptor[LocalVariableDescriptor]

'super' @ [52:36] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[LazyClassReceiverParameterDescriptor]

'getChangeInfo' @ [52:42] ==> public open fun getChangeInfo(): (ChangeInfo..ChangeInfo?) defined in com.intellij.refactoring.changeSignature.ChangeSignatureProcessorBase[JavaMethodDescriptor]

'ArrayList' @ [55:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'ktChangeInfo' @ [56:9] ==> public final val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[PropertyDescriptorImpl]

'getOrCreateJavaChangeInfos' @ [56:22] ==> public final fun getOrCreateJavaChangeInfos(): List<JavaChangeInfo>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'let' @ [56:52] ==> @InlineOnly public inline fun <T, R> List<JavaChangeInfo>.let(block: (List<JavaChangeInfo>) -> ArrayList<UsageInfo>): ArrayList<UsageInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<JavaChangeInfo>
    <R> -> ArrayList<UsageInfo>

'JavaChangeSignatureUsageProcessor' @ [57:33] ==> public constructor JavaChangeSignatureUsageProcessor() defined in com.intellij.refactoring.changeSignature.JavaChangeSignatureUsageProcessor[JavaClassConstructorDescriptor]

'javaChangeInfos' @ [58:13] ==> value-parameter javaChangeInfos: List<JavaChangeInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'mapTo' @ [58:29] ==> public inline fun <T, R, C : MutableCollection<in KotlinWrapperForJavaUsageInfos>> Iterable<JavaChangeInfo>.mapTo(destination: ArrayList<UsageInfo>, transform: (JavaChangeInfo) -> KotlinWrapperForJavaUsageInfos): ArrayList<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaChangeInfo
    <R> -> KotlinWrapperForJavaUsageInfos
    <C : MutableCollection<in R>> -> ArrayList<UsageInfo>

'allUsages' @ [58:35] ==> val allUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.findUsages[LocalVariableDescriptor]

'KotlinWrapperForJavaUsageInfos' @ [59:17] ==> public constructor KotlinWrapperForJavaUsageInfos(javaChangeInfo: JavaChangeInfo, javaUsageInfos: Array<UsageInfo>, primaryMethod: PsiElement) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinWrapperForJavaUsageInfos[ClassConstructorDescriptorImpl]

'it' @ [59:48] ==> value-parameter it: JavaChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.findUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javaProcessor' @ [59:52] ==> val javaProcessor: JavaChangeSignatureUsageProcessor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.findUsages.<anonymous>[LocalVariableDescriptor]

'findUsages' @ [59:66] ==> public open fun findUsages(p0: (ChangeInfo..ChangeInfo?)): (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?) defined in com.intellij.refactoring.changeSignature.JavaChangeSignatureUsageProcessor[JavaMethodDescriptor]

'it' @ [59:77] ==> value-parameter it: JavaChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.findUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'changeInfo' @ [59:82] ==> public final val KotlinChangeSignatureProcessor.changeInfo: KotlinChangeInfoWrapper[MyPropertyDescriptor]

'method' @ [59:93] ==> public final val KotlinChangeInfoWrapper.method: PsiElement[MyPropertyDescriptor]

'super' @ [62:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[LazyClassReceiverParameterDescriptor]

'findUsages' @ [62:15] ==> @NotNull protected/*protected and package*/ open fun findUsages(): (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>) defined in com.intellij.refactoring.changeSignature.ChangeSignatureProcessorBase[JavaMethodDescriptor]

'filterTo' @ [62:28] ==> public inline fun <T, C : MutableCollection<in (UsageInfo..UsageInfo?)>> Array<out (UsageInfo..UsageInfo?)>.filterTo(destination: ArrayList<UsageInfo>, predicate: ((UsageInfo..UsageInfo?)) -> Boolean): ArrayList<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.usageView.UsageInfo..com.intellij.usageView.UsageInfo?)
    <C : MutableCollection<in T>> -> ArrayList<UsageInfo>

'allUsages' @ [62:37] ==> val allUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.findUsages[LocalVariableDescriptor]

'it' @ [62:50] ==> value-parameter it: (UsageInfo..UsageInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [62:78] ==> value-parameter it: (UsageInfo..UsageInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'allUsages' @ [64:16] ==> val allUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.findUsages[LocalVariableDescriptor]

'toTypedArray' @ [64:26] ==> public inline fun <reified T> Collection<UsageInfo>.toTypedArray(): Array<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UsageInfo

'EP_NAME' @ [68:61] ==> public final val EP_NAME: (ExtensionPointName<(ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>..ExtensionPointName<(ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>?) defined in com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor[JavaPropertyDescriptor]

'extensions' @ [68:69] ==> public final val <T : (Any..Any?)> ExtensionPointName<(ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>.extensions: (Array<(ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>..Array<out (ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor..com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor?)

'!' @ [70:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'usageProcessors' @ [70:14] ==> val usageProcessors: (Array<(ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>..Array<out (ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'all' @ [70:30] ==> public inline fun <T> Array<out (ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>.all(predicate: ((ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor..com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor?)

'it' @ [70:36] ==> value-parameter it: (ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

'setupDefaultValues' @ [70:39] ==> public abstract fun setupDefaultValues(p0: (ChangeInfo..ChangeInfo?), p1: (Ref<(Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?)>..Ref<(Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?)>?), p2: (Project..Project?)): Boolean defined in com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor[JavaMethodDescriptor]

'myChangeInfo' @ [70:58] ==> protected/*protected and package*/ final val myChangeInfo: (ChangeInfo..ChangeInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[JavaPropertyDescriptor]

'refUsages' @ [70:72] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[ValueParameterDescriptorImpl]

'myProject' @ [70:83] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[JavaPropertyDescriptor]

'MultiMap<PsiElement, String>' @ [72:44] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'LinkedHashSet' @ [73:47] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'usageProcessors' @ [75:9] ==> val usageProcessors: (Array<(ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>..Array<out (ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'forEach' @ [75:25] ==> public inline fun <T> Array<out (ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)>.forEach(action: ((ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor..com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor?)

'conflictDescriptions' @ [75:35] ==> val conflictDescriptions: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'putAllValues' @ [75:56] ==> public open fun <Kk : (PsiElement..PsiElement?), Vv : (String..String?)> putAllValues(@NotNull p0: MultiMap<(PsiElement..PsiElement?), (String..String?)>): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <Kk : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <Vv : (String..String?)> -> (kotlin.String..kotlin.String?)

'it' @ [75:69] ==> value-parameter it: (ChangeSignatureUsageProcessor..ChangeSignatureUsageProcessor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

'findConflicts' @ [75:72] ==> public abstract fun findConflicts(p0: (ChangeInfo..ChangeInfo?), p1: (Ref<(Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?)>..Ref<(Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?)>?)): (MultiMap<(PsiElement..PsiElement?), (String..String?)>..MultiMap<(PsiElement..PsiElement?), (String..String?)>?) defined in com.intellij.refactoring.changeSignature.ChangeSignatureUsageProcessor[JavaMethodDescriptor]

'myChangeInfo' @ [75:86] ==> protected/*protected and package*/ final val myChangeInfo: (ChangeInfo..ChangeInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[JavaPropertyDescriptor]

'refUsages' @ [75:100] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[ValueParameterDescriptorImpl]

'refUsages' @ [77:22] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[ValueParameterDescriptorImpl]

'get' @ [77:32] ==> public final fun get(): (Array<UsageInfo>..Array<UsageInfo>?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'usages' @ [78:25] ==> val usages: (Array<UsageInfo>..Array<UsageInfo>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'toHashSet' @ [78:32] ==> public fun <T> Array<out UsageInfo>.toHashSet(): HashSet<UsageInfo> /* = HashSet<UsageInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'addConflictDescriptions' @ [80:20] ==> public open fun addConflictDescriptions(p0: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?), p1: (MultiMap<(PsiElement..PsiElement?), (String..String?)>..MultiMap<(PsiElement..PsiElement?), (String..String?)>?)): Unit defined in com.intellij.refactoring.rename.RenameUtil[JavaMethodDescriptor]

'usages' @ [80:44] ==> val usages: (Array<UsageInfo>..Array<UsageInfo>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'conflictDescriptions' @ [80:52] ==> val conflictDescriptions: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'removeConflictUsages' @ [81:20] ==> @Nullable public open fun removeConflictUsages(p0: (MutableSet<(UsageInfo..UsageInfo?)>..Set<(UsageInfo..UsageInfo?)>?)): (MutableList<(UnresolvableCollisionUsageInfo..UnresolvableCollisionUsageInfo?)>?..List<(UnresolvableCollisionUsageInfo..UnresolvableCollisionUsageInfo?)>?) defined in com.intellij.refactoring.rename.RenameUtil[JavaMethodDescriptor]

'usagesSet' @ [81:41] ==> val usagesSet: HashSet<UsageInfo> /* = HashSet<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'!' @ [82:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'conflictDescriptions' @ [82:14] ==> val conflictDescriptions: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'isEmpty' @ [82:35] ==> public final val <no name provided>.isEmpty: Boolean[MyPropertyDescriptor]

'getApplication' @ [83:36] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [83:53] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'ConflictsInTestsException' @ [84:48] ==> public constructor ConflictsInTestsException(@NotNull p0: (MutableCollection<out (String..String?)>..Collection<(String..String?)>)) defined in com.intellij.refactoring.BaseRefactoringProcessor.ConflictsInTestsException[JavaClassConstructorDescriptor]

'conflictDescriptions' @ [84:74] ==> val conflictDescriptions: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'values' @ [84:95] ==> @NotNull public open fun values(): (MutableCollection<out (String..String?)>..Collection<(String..String?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<no name provided>[JavaMethodDescriptor]

'prepareConflictsDialog' @ [87:26] ==> @NotNull protected/*protected and package*/ open fun prepareConflictsDialog(@NotNull p0: MultiMap<(PsiElement..PsiElement?), (String..String?)>, @Nullable p1: (Array<(UsageInfo..UsageInfo?)>?..Array<out (UsageInfo..UsageInfo?)>?)): ConflictsDialog defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[JavaMethodDescriptor]

'conflictDescriptions' @ [87:49] ==> val conflictDescriptions: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'usages' @ [87:71] ==> val usages: (Array<UsageInfo>..Array<UsageInfo>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'dialog' @ [88:13] ==> val dialog: ConflictsDialog defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'show' @ [88:20] ==> public open fun show(): Unit defined in com.intellij.refactoring.ui.ConflictsDialog[JavaMethodDescriptor]

'!' @ [89:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dialog' @ [89:18] ==> val dialog: ConflictsDialog defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'isOK' @ [89:25] ==> public final val ConflictsDialog.isOK: Boolean[MyPropertyDescriptor]

'dialog' @ [90:21] ==> val dialog: ConflictsDialog defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'isShowConflicts' @ [90:28] ==> public final val ConflictsDialog.isShowConflicts: Boolean[MyPropertyDescriptor]

'prepareSuccessful' @ [90:45] ==> protected/*protected and package*/ open fun prepareSuccessful(): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[JavaMethodDescriptor]

'usagesSet' @ [95:26] ==> val usagesSet: HashSet<UsageInfo> /* = HashSet<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'toTypedArray' @ [95:36] ==> public inline fun <reified T> Collection<UsageInfo>.toTypedArray(): Array<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UsageInfo

'sort' @ [96:16] ==> public final fun <T : (Any..Any?)> sort(p0: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?), p1: (((UsageInfo..UsageInfo?), (UsageInfo..UsageInfo?)) -> Int..(((UsageInfo..UsageInfo?), (UsageInfo..UsageInfo?)) -> Int)?)): Unit defined in java.util.Arrays[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.usageView.UsageInfo..com.intellij.usageView.UsageInfo?)

'usageArray' @ [96:21] ==> val usageArray: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'u1' @ [97:17] ==> value-parameter u1: (UsageInfo..UsageInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

'u2' @ [97:54] ==> value-parameter u2: (UsageInfo..UsageInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

'-' @ [97:97] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'u2' @ [98:17] ==> value-parameter u2: (UsageInfo..UsageInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

'u1' @ [98:54] ==> value-parameter u1: (UsageInfo..UsageInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

'u1' @ [99:28] ==> value-parameter u1: (UsageInfo..UsageInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [99:31] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'u2' @ [100:28] ==> value-parameter u2: (UsageInfo..UsageInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [100:31] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'element1' @ [101:25] ==> val element1: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<anonymous>[LocalVariableDescriptor]

'textOffset' @ [101:35] ==> public final val PsiElement.textOffset: Int[MyPropertyDescriptor]

'-' @ [101:49] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'element2' @ [102:25] ==> val element2: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<anonymous>[LocalVariableDescriptor]

'textOffset' @ [102:35] ==> public final val PsiElement.textOffset: Int[MyPropertyDescriptor]

'-' @ [102:49] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'rank2' @ [103:13] ==> val rank2: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<anonymous>[LocalVariableDescriptor]

'rank1' @ [103:21] ==> val rank1: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages.<anonymous>[LocalVariableDescriptor]

'refUsages' @ [105:9] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[ValueParameterDescriptorImpl]

'set' @ [105:19] ==> public final fun set(@Nullable p0: Array<UsageInfo>?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'usageArray' @ [105:23] ==> val usageArray: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.preprocessUsages[LocalVariableDescriptor]

'prepareSuccessful' @ [107:9] ==> protected/*protected and package*/ open fun prepareSuccessful(): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[JavaMethodDescriptor]

'isPreviewUsages' @ [112:75] ==> protected/*protected and package*/ for synthetic extension final var KotlinChangeSignatureProcessor.isPreviewUsages: Boolean[MyPropertyDescriptor]

'commandName' @ [114:37] ==> private final val commandName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[PropertyDescriptorImpl]

'super' @ [118:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[LazyClassReceiverParameterDescriptor]

'performRefactoring' @ [118:19] ==> protected/*protected and package*/ open fun performRefactoring(@NotNull p0: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>)): Unit defined in com.intellij.refactoring.changeSignature.ChangeSignatureProcessorBase[JavaMethodDescriptor]

'usages' @ [118:38] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor.performRefactoring[ValueParameterDescriptorImpl]

'changeInfo' @ [121:13] ==> public final val KotlinChangeSignatureProcessor.changeInfo: KotlinChangeInfoWrapper[MyPropertyDescriptor]

'invalidate' @ [121:24] ==> public final fun invalidate(): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfoWrapper[SimpleFunctionDescriptorImpl]

