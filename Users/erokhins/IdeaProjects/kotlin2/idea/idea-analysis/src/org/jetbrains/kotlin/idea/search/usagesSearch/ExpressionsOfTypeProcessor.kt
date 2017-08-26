'TestOnly' @ [76:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'TestOnly' @ [84:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'if (ApplicationManager.getApplication().isUnitTestMode) Mode.ALWAYS_SMART else Mode.PLAIN_WHEN_NEEDED' @ [85:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExpressionsOfTypeProcessor.Mode, elseBranch: ExpressionsOfTypeProcessor.Mode): ExpressionsOfTypeProcessor.Mode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Mode

'getApplication' @ [85:43] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [85:60] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'ALWAYS_SMART' @ [85:81] ==> enum entry ALWAYS_SMART defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'PLAIN_WHEN_NEEDED' @ [85:104] ==> enum entry PLAIN_WHEN_NEEDED defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'TestOnly' @ [86:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'testLog' @ [90:13] ==> @TestOnly public final var testLog: MutableList<String>? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[PropertyDescriptorImpl]

'add' @ [90:22] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'invoke' @ [90:26] ==> public abstract operator fun invoke(): String defined in kotlin.Function0[FunctionInvokeDescriptor]

'getInstance' @ [93:26] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'ExpressionsOfTypeProcessor' @ [93:38] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'java' @ [93:72] ==> public val <T> KClass<ExpressionsOfTypeProcessor>.java: Class<ExpressionsOfTypeProcessor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ExpressionsOfTypeProcessor

'runReadAction' @ [96:20] ==> public fun <T> runReadAction(action: () -> String?): String? defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String?

'element' @ [97:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation[ValueParameterDescriptorImpl]

'element' @ [97:50] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation[ValueParameterDescriptorImpl]

'element' @ [97:94] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation[ValueParameterDescriptorImpl]

'text' @ [97:102] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'element' @ [98:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation[ValueParameterDescriptorImpl]

'getKotlinFqName' @ [98:38] ==> public fun PsiElement.getKotlinFqName(): FqName? defined in org.jetbrains.kotlin.idea.refactoring.fqName in file fqNameUtil.kt[SimpleFunctionDescriptorImpl]

'asString' @ [98:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'element' @ [99:34] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation[ValueParameterDescriptorImpl]

'name' @ [99:67] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'when (element) {
                    is PsiMethod -> fqName + element.parameterList.text
                    is KtFunction -> fqName + element.valueParameterList!!.text
                    is KtParameter -> {
                        val owner = element.ownerFunction?.let { logPresentation(it) } ?: element.parent.toString()
                        "parameter ${element.name} of $owner"
                    }
                    is KtDestructuringDeclaration -> element.entries.joinToString(", ", prefix = "(", postfix = ")") { it.text }
                    else -> fqName
                }' @ [100:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?, entry3: String?, entry4: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'element' @ [100:23] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation[ValueParameterDescriptorImpl]

'fqName' @ [101:37] ==> val fqName: String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation.<anonymous>[LocalVariableDescriptor]

'element' @ [101:46] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation[ValueParameterDescriptorImpl]

'parameterList' @ [101:54] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'text' @ [101:68] ==> public final val PsiParameterList.text: (String..String?)[MyPropertyDescriptor]

'fqName' @ [102:38] ==> val fqName: String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation.<anonymous>[LocalVariableDescriptor]

'element' @ [102:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation[ValueParameterDescriptorImpl]

'valueParameterList' @ [102:55] ==> public final val KtFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'text' @ [102:76] ==> public final val KtParameterList.text: (String..String?)[MyPropertyDescriptor]

'element' @ [104:37] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation[ValueParameterDescriptorImpl]

'ownerFunction' @ [104:45] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'let' @ [104:60] ==> @InlineOnly public inline fun <T, R> KtDeclarationWithBody.let(block: (KtDeclarationWithBody) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclarationWithBody
    <R> -> String?

'logPresentation' @ [104:66] ==> public final fun logPresentation(element: PsiElement): String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'it' @ [104:82] ==> value-parameter it: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [104:91] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation[ValueParameterDescriptorImpl]

'parent' @ [104:99] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'toString' @ [104:106] ==> public open fun toString(): String defined in com.intellij.psi.PsiElement[DeserializedSimpleFunctionDescriptor]

'element' @ [105:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation[ValueParameterDescriptorImpl]

'name' @ [105:46] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'owner' @ [105:56] ==> val owner: String defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation.<anonymous>[LocalVariableDescriptor]

'element' @ [107:54] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation[ValueParameterDescriptorImpl]

'entries' @ [107:62] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'joinToString' @ [107:70] ==> public fun <T> Iterable<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)

'it' @ [107:120] ==> value-parameter it: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [107:123] ==> public final val KtDestructuringDeclarationEntry.text: (String..String?)[MyPropertyDescriptor]

'fqName' @ [108:29] ==> val fqName: String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.logPresentation.<anonymous>[LocalVariableDescriptor]

'hasModifierProperty' @ [113:56] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiModifierListOwner[JavaMethodDescriptor]

'PRIVATE' @ [113:88] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'parents' @ [115:54] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'any' @ [115:62] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [115:68] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion.isLocal.<anonymous>[ValueParameterDescriptorImpl]

'ArrayDeque' @ [123:25] ==> public constructor ArrayDeque<E : (Any..Any?)>() defined in java.util.ArrayDeque[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Task

'HashSet' @ [124:27] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Task

'LinkedHashMap' @ [126:42] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtFile
    <V : (Any..Any?)> -> ArrayList<PsiElement>

'when (ExpressionsOfTypeProcessor.mode) {
            ExpressionsOfTypeProcessor.Mode.ALWAYS_SMART -> false
            ExpressionsOfTypeProcessor.Mode.ALWAYS_PLAIN -> true
            ExpressionsOfTypeProcessor.Mode.PLAIN_WHEN_NEEDED -> searchScope is LocalSearchScope // for local scope it's faster to use plain search
        }' @ [129:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'ExpressionsOfTypeProcessor' @ [129:36] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'mode' @ [129:63] ==> @TestOnly public final var mode: ExpressionsOfTypeProcessor.Mode defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[PropertyDescriptorImpl]

'ExpressionsOfTypeProcessor' @ [130:13] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'ALWAYS_SMART' @ [130:45] ==> enum entry ALWAYS_SMART defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'ExpressionsOfTypeProcessor' @ [131:13] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'ALWAYS_PLAIN' @ [131:45] ==> enum entry ALWAYS_PLAIN defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'ExpressionsOfTypeProcessor' @ [132:13] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'PLAIN_WHEN_NEEDED' @ [132:45] ==> enum entry PLAIN_WHEN_NEEDED defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'searchScope' @ [132:66] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'usePlainSearch' @ [134:13] ==> val usePlainSearch: Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.run[LocalVariableDescriptor]

'classToSearch' @ [134:31] ==> private final val classToSearch: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'invoke' @ [135:13] ==> public abstract operator fun invoke(p1: SearchScope): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'searchScope' @ [135:43] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'runReadAction' @ [140:13] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'searchScope' @ [140:29] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'!' @ [140:65] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containsFileOfType' @ [140:80] ==> public open fun containsFileOfType(@NotNull p0: FileType, @NotNull p1: GlobalSearchScope): Boolean defined in com.intellij.psi.search.FileTypeIndex[JavaMethodDescriptor]

'INSTANCE' @ [140:114] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'searchScope' @ [140:124] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'!' @ [143:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'runReadAction' @ [143:14] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'classToSearch' @ [143:30] ==> private final val classToSearch: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'isValid' @ [143:44] ==> public final val PsiClass.isValid: Boolean[MyPropertyDescriptor]

'ProjectRootsUtil' @ [143:55] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[FakeCallableDescriptorForObject]

'isInProjectSource' @ [143:72] ==> @JvmStatic public final fun isInProjectSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'classToSearch' @ [143:90] ==> private final val classToSearch: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'invoke' @ [144:13] ==> public abstract operator fun invoke(p1: SearchScope): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'searchScope' @ [144:43] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'addClassToProcess' @ [148:9] ==> private final fun addClassToProcess(classToSearch: PsiClass): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'classToSearch' @ [148:27] ==> private final val classToSearch: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'processTasks' @ [150:9] ==> private final fun processTasks(): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'runReadAction' @ [152:9] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'scopesToUsePlainSearch' @ [153:33] ==> private final val scopesToUsePlainSearch: LinkedHashMap<KtFile, ArrayList<PsiElement>> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'values' @ [153:56] ==> public open val values: MutableCollection<ArrayList<PsiElement>> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'flatMap' @ [154:22] ==> public inline fun <T, R> Iterable<ArrayList<PsiElement>>.flatMap(transform: (ArrayList<PsiElement>) -> Iterable<PsiElement>): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<PsiElement>
    <R> -> PsiElement

'it' @ [154:32] ==> value-parameter it: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.run.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [155:22] ==> public inline fun <T> Iterable<PsiElement>.filter(predicate: (PsiElement) -> Boolean): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [155:31] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.run.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [155:34] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'toTypedArray' @ [156:22] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'scopeElements' @ [157:17] ==> val scopeElements: Array<PsiElement> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.run.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [157:31] ==> @InlineOnly public inline fun <T> Array<out PsiElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'invoke' @ [158:17] ==> public abstract operator fun invoke(p1: SearchScope): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'LocalSearchScope' @ [158:47] ==> public constructor LocalSearchScope(@NotNull p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'scopeElements' @ [158:64] ==> val scopeElements: Array<PsiElement> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.run.<anonymous>[LocalVariableDescriptor]

'taskSet' @ [164:13] ==> private final val taskSet: HashSet<ExpressionsOfTypeProcessor.Task> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'add' @ [164:21] ==> public open fun add(element: ExpressionsOfTypeProcessor.Task): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'task' @ [164:25] ==> value-parameter task: ExpressionsOfTypeProcessor.Task defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addTask[ValueParameterDescriptorImpl]

'tasks' @ [165:13] ==> private final val tasks: ArrayDeque<ExpressionsOfTypeProcessor.Task> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'push' @ [165:19] ==> public open fun push(p0: (ExpressionsOfTypeProcessor.Task..ExpressionsOfTypeProcessor.Task?)): Unit defined in java.util.ArrayDeque[JavaMethodDescriptor]

'task' @ [165:24] ==> value-parameter task: ExpressionsOfTypeProcessor.Task defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addTask[ValueParameterDescriptorImpl]

'tasks' @ [171:16] ==> private final val tasks: ArrayDeque<ExpressionsOfTypeProcessor.Task> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'isNotEmpty' @ [171:22] ==> @InlineOnly public inline fun <T> Collection<(ExpressionsOfTypeProcessor.Task..ExpressionsOfTypeProcessor.Task?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Task..org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Task?)

'tasks' @ [172:13] ==> private final val tasks: ArrayDeque<ExpressionsOfTypeProcessor.Task> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'pop' @ [172:19] ==> public open fun pop(): (ExpressionsOfTypeProcessor.Task..ExpressionsOfTypeProcessor.Task?) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'perform' @ [172:25] ==> public abstract fun perform(): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Task[SimpleFunctionDescriptorImpl]

'getFallbackDiagnosticsMessage' @ [177:23] ==> private final fun getFallbackDiagnosticsMessage(reference: PsiReference): String defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'reference' @ [177:53] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.downShiftToPlainSearch[ValueParameterDescriptorImpl]

'LOG' @ [178:9] ==> public final val LOG: Logger defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[PropertyDescriptorImpl]

'info' @ [178:13] ==> public abstract fun info(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [178:18] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'message' @ [178:51] ==> val message: String defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.downShiftToPlainSearch[LocalVariableDescriptor]

'testLog' @ [179:9] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'message' @ [179:53] ==> val message: String defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.downShiftToPlainSearch[LocalVariableDescriptor]

'tasks' @ [181:9] ==> private final val tasks: ArrayDeque<ExpressionsOfTypeProcessor.Task> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'clear' @ [181:15] ==> public open fun clear(): Unit defined in java.util.ArrayDeque[JavaMethodDescriptor]

'scopesToUsePlainSearch' @ [182:9] ==> private final val scopesToUsePlainSearch: LinkedHashMap<KtFile, ArrayList<PsiElement>> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'clear' @ [182:32] ==> public open fun clear(): Unit defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'invoke' @ [183:9] ==> public abstract operator fun invoke(p1: SearchScope): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'searchScope' @ [183:39] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'psiClass' @ [188:13] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.checkPsiClass[ValueParameterDescriptorImpl]

'isLocal' @ [188:22] ==> private final fun PsiModifierListOwner.isLocal(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'runReadAction' @ [192:29] ==> public fun <T> runReadAction(action: () -> String?): String? defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String?

'psiClass' @ [192:45] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.checkPsiClass[ValueParameterDescriptorImpl]

'qualifiedName' @ [192:54] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'qualifiedName' @ [193:13] ==> val qualifiedName: String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.checkPsiClass[LocalVariableDescriptor]

'qualifiedName' @ [193:38] ==> val qualifiedName: String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.checkPsiClass[LocalVariableDescriptor]

'isEmpty' @ [193:52] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [201:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkPsiClass' @ [201:14] ==> private final fun checkPsiClass(psiClass: PsiClass): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'classToSearch' @ [201:28] ==> value-parameter classToSearch: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addNonKotlinClassToProcess[ValueParameterDescriptorImpl]

'addClassToProcess' @ [205:9] ==> private final fun addClassToProcess(classToSearch: PsiClass): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'classToSearch' @ [205:27] ==> value-parameter classToSearch: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addNonKotlinClassToProcess[ValueParameterDescriptorImpl]

'testLog' @ [211:17] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'logPresentation' @ [211:53] ==> public final fun logPresentation(element: PsiElement): String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'classToSearch' @ [211:69] ==> value-parameter classToSearch: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess[ValueParameterDescriptorImpl]

'allScope' @ [212:47] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [212:56] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'excludeFileTypes' @ [212:65] ==> public fun SearchScope.excludeFileTypes(vararg fileTypes: FileType): SearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'INSTANCE' @ [212:94] ==> public final val INSTANCE: (XmlFileType..XmlFileType?) defined in com.intellij.ide.highlighter.XmlFileType[JavaPropertyDescriptor]

'searchReferences' @ [213:17] ==> private final fun searchReferences(element: PsiElement, scope: SearchScope, processor: (PsiReference) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'classToSearch' @ [213:34] ==> value-parameter classToSearch: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess[ValueParameterDescriptorImpl]

'scope' @ [213:49] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask.perform[LocalVariableDescriptor]

'reference' @ [214:35] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [214:45] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (element.language) {
                        KotlinLanguage.INSTANCE -> processClassUsageInKotlin(element)
                        JavaLanguage.INSTANCE -> processClassUsageInJava(element)
                        else -> {
                            when (element.language.displayName) {
                                "Groovy" -> {
                                    processClassUsageInLanguageWithPsiClass(element)
                                    true
                                }
                                "Scala" -> false
                                "Clojure" -> false
                                else -> {
                                    // If there's no PsiClass - consider processed
                                    element.getParentOfType<PsiClass>(true) == null
                                }
                            }
                        }
                    }' @ [215:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [215:46] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask.perform.<anonymous>[LocalVariableDescriptor]

'language' @ [215:54] ==> public final val PsiElement.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [216:40] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'processClassUsageInKotlin' @ [216:52] ==> private final fun processClassUsageInKotlin(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'element' @ [216:78] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask.perform.<anonymous>[LocalVariableDescriptor]

'INSTANCE' @ [217:38] ==> @NotNull public final val INSTANCE: JavaLanguage defined in com.intellij.lang.java.JavaLanguage[JavaPropertyDescriptor]

'processClassUsageInJava' @ [217:50] ==> private final fun processClassUsageInJava(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'element' @ [217:74] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask.perform.<anonymous>[LocalVariableDescriptor]

'when (element.language.displayName) {
                                "Groovy" -> {
                                    processClassUsageInLanguageWithPsiClass(element)
                                    true
                                }
                                "Scala" -> false
                                "Clojure" -> false
                                else -> {
                                    // If there's no PsiClass - consider processed
                                    element.getParentOfType<PsiClass>(true) == null
                                }
                            }' @ [219:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [219:35] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask.perform.<anonymous>[LocalVariableDescriptor]

'language' @ [219:43] ==> public final val PsiElement.language: Language[MyPropertyDescriptor]

'displayName' @ [219:52] ==> public final val Language.displayName: String[MyPropertyDescriptor]

'processClassUsageInLanguageWithPsiClass' @ [221:37] ==> private final fun processClassUsageInLanguageWithPsiClass(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'element' @ [221:77] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask.perform.<anonymous>[LocalVariableDescriptor]

'element' @ [228:37] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask.perform.<anonymous>[LocalVariableDescriptor]

'getParentOfType' @ [228:45] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): PsiClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiClass

'wasProcessed' @ [234:25] ==> val wasProcessed: Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask.perform.<anonymous>[LocalVariableDescriptor]

'mode' @ [236:25] ==> @TestOnly public final var mode: ExpressionsOfTypeProcessor.Mode defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[PropertyDescriptorImpl]

'ALWAYS_SMART' @ [236:38] ==> enum entry ALWAYS_SMART defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'downShiftToPlainSearch' @ [237:25] ==> private final fun downShiftToPlainSearch(reference: PsiReference): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'reference' @ [237:48] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'error' @ [241:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'getFallbackDiagnosticsMessage' @ [241:27] ==> private final fun getFallbackDiagnosticsMessage(reference: PsiReference): String defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'reference' @ [241:57] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'classToSearch' @ [245:18] ==> value-parameter classToSearch: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [245:51] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'let' @ [245:65] ==> @InlineOnly public inline fun <T, R> KtClassOrObject.let(block: (KtClassOrObject) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R> -> Unit

'usePlainSearch' @ [245:71] ==> private final fun usePlainSearch(scope: KtElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'it' @ [245:86] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'addTask' @ [248:9] ==> private final fun addTask(task: ExpressionsOfTypeProcessor.Task): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'ProcessClassUsagesTask' @ [248:17] ==> public constructor ProcessClassUsagesTask(classToSearch: PsiClass) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess.ProcessClassUsagesTask[ClassConstructorDescriptorImpl]

'classToSearch' @ [248:40] ==> value-parameter classToSearch: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addClassToProcess[ValueParameterDescriptorImpl]

'reference' @ [252:23] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.getFallbackDiagnosticsMessage[ValueParameterDescriptorImpl]

'element' @ [252:33] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getInstance' @ [253:43] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [253:55] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'getDocument' @ [253:64] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'element' @ [253:76] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.getFallbackDiagnosticsMessage[LocalVariableDescriptor]

'containingFile' @ [253:84] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'offsetToLineAndColumn' @ [254:42] ==> @NotNull public open fun offsetToLineAndColumn(@Nullable p0: Document?, p1: Int): DiagnosticUtils.LineAndColumn defined in org.jetbrains.kotlin.diagnostics.DiagnosticUtils[JavaMethodDescriptor]

'document' @ [254:64] ==> val document: Document? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.getFallbackDiagnosticsMessage[LocalVariableDescriptor]

'element' @ [254:74] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.getFallbackDiagnosticsMessage[LocalVariableDescriptor]

'startOffset' @ [254:82] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [255:43] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.getFallbackDiagnosticsMessage[LocalVariableDescriptor]

'text' @ [255:51] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'element' @ [255:63] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.getFallbackDiagnosticsMessage[LocalVariableDescriptor]

'containingFile' @ [255:71] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'name' @ [255:86] ==> public final var PsiFile.name: String[MyPropertyDescriptor]

'lineAndCol' @ [255:99] ==> val lineAndCol: DiagnosticUtils.LineAndColumn defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.getFallbackDiagnosticsMessage[LocalVariableDescriptor]

'line' @ [255:110] ==> public final val DiagnosticUtils.LineAndColumn.line: Int[MyPropertyDescriptor]

'lineAndCol' @ [255:125] ==> val lineAndCol: DiagnosticUtils.LineAndColumn defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.getFallbackDiagnosticsMessage[LocalVariableDescriptor]

'column' @ [255:136] ==> public final val DiagnosticUtils.LineAndColumn.column: Int[MyPropertyDescriptor]

'' @ [259:26] ==> private constructor ReferenceProcessor(handler: (ExpressionsOfTypeProcessor, PsiReference) -> Boolean) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.ReferenceProcessor[ClassConstructorDescriptorImpl]

'ExpressionsOfTypeProcessor' @ [259:27] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'processReferenceToCallableOfOurType' @ [259:55] ==> private final fun processReferenceToCallableOfOurType(reference: PsiReference): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'' @ [261:30] ==> private constructor ReferenceProcessor(handler: (ExpressionsOfTypeProcessor, PsiReference) -> Boolean) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.ReferenceProcessor[ClassConstructorDescriptorImpl]

'reference' @ [262:36] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.ReferenceProcessor.ProcessLambdasInCalls.<init>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [262:46] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [262:82] ==> @InlineOnly public inline fun <T, R> KtReferenceExpression.let(block: (KtReferenceExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReferenceExpression
    <R> -> Unit

'processor' @ [262:88] ==> value-parameter processor: ExpressionsOfTypeProcessor defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.ReferenceProcessor.ProcessLambdasInCalls.<init>.<anonymous>[ValueParameterDescriptorImpl]

'processLambdasForCallableReference' @ [262:98] ==> private final fun processLambdasForCallableReference(expression: KtReferenceExpression): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'it' @ [262:133] ==> value-parameter it: KtReferenceExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.ReferenceProcessor.ProcessLambdasInCalls.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'RequestResultProcessor' @ [267:107] ==> protected/*protected and package*/ constructor RequestResultProcessor(@NotNull vararg p0: (Any..Any?)) defined in com.intellij.psi.search.RequestResultProcessor[JavaClassConstructorDescriptor]

'psiMember' @ [267:130] ==> value-parameter psiMember: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.<init>[ValueParameterDescriptorImpl]

'runReadAction' @ [268:49] ==> public fun <T> runReadAction(action: () -> HashSet<String>): HashSet<String> defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> HashSet<String>

'classes' @ [268:65] ==> value-parameter classes: List<PsiClass> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.<init>[ValueParameterDescriptorImpl]

'map' @ [268:73] ==> public inline fun <T, R> Iterable<PsiClass>.map(transform: (PsiClass) -> String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> String?

'it' @ [268:79] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.possibleClassesNames.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [268:82] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'filterNotNullTo' @ [268:98] ==> public fun <C : MutableCollection<in String>, T : Any> Iterable<String?>.filterNotNullTo(destination: HashSet<String>): HashSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : MutableCollection<in T>> -> HashSet<String>
    <T : Any> -> String

'HashSet' @ [268:114] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'when (element) {
                is KtQualifiedExpression -> {
                    val selectorExpression = element.selectorExpression ?: return true
                    val selectorReference = element.findReferenceAt(selectorExpression.startOffsetInParent)

                    val references = when (selectorReference) {
                        is PsiMultiReference -> selectorReference.references.toList()
                        else -> listOf(selectorReference)
                    }.filterNotNull()

                    for (ref in references) {
                        ProgressManager.checkCanceled()

                        if (ref.isReferenceTo(psiMember)) {
                            consumer.process(ref)
                        }
                    }
                }

                is KtImportDirective -> {
                    if (element.isAllUnder) {
                        val fqName = element.importedFqName?.asString()
                        if (fqName != null && fqName in possibleClassesNames) {
                            val ref = element.importedReference
                                    ?.getQualifiedElementSelector()
                                    ?.references
                                    ?.firstOrNull()
                            if (ref != null) {
                                consumer.process(ref)
                            }
                        }
                    }
                }
            }' @ [271:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [271:19] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'element' @ [273:46] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'selectorExpression' @ [273:54] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [274:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'findReferenceAt' @ [274:53] ==> @Nullable @Contract public abstract fun findReferenceAt(p0: Int): PsiReference? defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'selectorExpression' @ [274:69] ==> val selectorExpression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[LocalVariableDescriptor]

'startOffsetInParent' @ [274:88] ==> public final val KtExpression.startOffsetInParent: Int[MyPropertyDescriptor]

'when (selectorReference) {
                        is PsiMultiReference -> selectorReference.references.toList()
                        else -> listOf(selectorReference)
                    }' @ [276:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<(PsiReference..PsiReference?)>, entry1: List<(PsiReference..PsiReference?)>): List<(PsiReference..PsiReference?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<(com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)>

'selectorReference' @ [276:44] ==> val selectorReference: PsiReference? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[LocalVariableDescriptor]

'selectorReference' @ [277:49] ==> val selectorReference: PsiReference? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[LocalVariableDescriptor]

'references' @ [277:67] ==> public final val PsiMultiReference.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'toList' @ [277:78] ==> public fun <T> Array<out (PsiReference..PsiReference?)>.toList(): List<(PsiReference..PsiReference?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'listOf' @ [278:33] ==> public fun <T> listOf(element: PsiReference?): List<PsiReference?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference?

'selectorReference' @ [278:40] ==> val selectorReference: PsiReference? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[LocalVariableDescriptor]

'filterNotNull' @ [279:23] ==> public fun <T : Any> Iterable<PsiReference?>.filterNotNull(): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiReference

'references' @ [281:33] ==> val references: List<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[LocalVariableDescriptor]

'checkCanceled' @ [282:41] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'ref' @ [284:29] ==> val ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[LocalVariableDescriptor]

'isReferenceTo' @ [284:33] ==> public abstract fun isReferenceTo(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'psiMember' @ [284:47] ==> public final val psiMember: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor[PropertyDescriptorImpl]

'consumer' @ [285:29] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'process' @ [285:38] ==> public abstract fun process(p0: (PsiReference..PsiReference?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'ref' @ [285:46] ==> val ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[LocalVariableDescriptor]

'element' @ [291:25] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'isAllUnder' @ [291:33] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'element' @ [292:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'importedFqName' @ [292:46] ==> public final val KtImportDirective.importedFqName: FqName?[MyPropertyDescriptor]

'asString' @ [292:62] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'fqName' @ [293:29] ==> val fqName: String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[LocalVariableDescriptor]

'fqName' @ [293:47] ==> val fqName: String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[LocalVariableDescriptor]

'possibleClassesNames' @ [293:57] ==> public final val possibleClassesNames: Set<String> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor[PropertyDescriptorImpl]

'element' @ [294:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'importedReference' @ [294:47] ==> public final val KtImportDirective.importedReference: KtExpression?[MyPropertyDescriptor]

'getQualifiedElementSelector' @ [295:39] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'references' @ [296:39] ==> public final val KtElement.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstOrNull' @ [297:39] ==> public fun <T> Array<out (PsiReference..PsiReference?)>.firstOrNull(): PsiReference? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'ref' @ [298:33] ==> val ref: PsiReference? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[LocalVariableDescriptor]

'consumer' @ [299:33] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'process' @ [299:42] ==> public abstract fun process(p0: (PsiReference..PsiReference?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'ref' @ [299:50] ==> val ref: PsiReference? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor.processTextOccurrence[LocalVariableDescriptor]

'runReadAction' @ [310:53] ==> public fun <T> runReadAction(action: () -> SearchScope): SearchScope defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SearchScope

'!' @ [311:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'psiClass' @ [311:14] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.classUseScope[ValueParameterDescriptorImpl]

'isValid' @ [311:23] ==> public final val PsiClass.isValid: Boolean[MyPropertyDescriptor]

'ProcessCanceledException' @ [312:19] ==> public constructor ProcessCanceledException() defined in com.intellij.openapi.progress.ProcessCanceledException[JavaClassConstructorDescriptor]

'psiClass' @ [315:20] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.classUseScope[ValueParameterDescriptorImpl]

'containingFile' @ [315:29] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [316:10] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.classUseScope.<anonymous>[LocalVariableDescriptor]

'psiClass' @ [316:18] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.classUseScope[ValueParameterDescriptorImpl]

'cast' @ [316:28] ==> public inline fun <reified T : Any> Any?.cast(): PsiElement defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PsiElement

'useScope' @ [316:47] ==> public final val PsiElement.useScope: SearchScope[MyPropertyDescriptor]

'runReadAction' @ [320:32] ==> public fun <T> runReadAction(action: () -> PsiClass?): PsiClass? defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PsiClass?

'psiMember' @ [320:48] ==> value-parameter psiMember: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess[ValueParameterDescriptorImpl]

'containingClass' @ [320:58] ==> public final val PsiMember.containingClass: PsiClass?[MyPropertyDescriptor]

'runReadAction' @ [321:31] ==> public fun <T> runReadAction(action: () -> String?): String? defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String?

'psiMember' @ [321:47] ==> value-parameter psiMember: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess[ValueParameterDescriptorImpl]

'name' @ [321:57] ==> public final val PsiMember.name: String?[MyPropertyDescriptor]

'declarationName' @ [322:13] ==> val declarationName: String defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess[LocalVariableDescriptor]

'isEmpty' @ [322:29] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'search' @ [327:64] ==> @NotNull public open fun search(@NotNull p0: PsiClass, @NotNull p1: SearchScope, p2: Boolean, p3: Boolean, p4: Boolean): Query<(PsiClass..PsiClass?)> defined in com.intellij.psi.search.searches.ClassInheritorsSearch[JavaMethodDescriptor]

'declarationClass' @ [328:25] ==> val declarationClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess[LocalVariableDescriptor]

'classUseScope' @ [329:25] ==> private final fun classUseScope(psiClass: PsiClass): SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'declarationClass' @ [329:39] ==> val declarationClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess[LocalVariableDescriptor]

'findAll' @ [330:44] ==> @NotNull public abstract fun findAll(): (MutableCollection<(PsiClass..PsiClass?)>..Collection<(PsiClass..PsiClass?)>) defined in com.intellij.util.Query[JavaMethodDescriptor]

'inheritanceClasses' @ [332:32] ==> val inheritanceClasses: (MutableCollection<(PsiClass..PsiClass?)>..Collection<(PsiClass..PsiClass?)>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'declarationClass' @ [332:53] ==> val declarationClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess[LocalVariableDescriptor]

'filter' @ [332:71] ==> public inline fun <T> Iterable<(PsiClass..PsiClass?)>.filter(predicate: ((PsiClass..PsiClass?)) -> Boolean): List<(PsiClass..PsiClass?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'it' @ [333:21] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'SearchRequestCollector' @ [336:46] ==> public constructor SearchRequestCollector(@NotNull p0: SearchSession) defined in com.intellij.psi.search.SearchRequestCollector[JavaClassConstructorDescriptor]

'SearchSession' @ [336:69] ==> public constructor SearchSession() defined in com.intellij.psi.search.SearchSession[JavaClassConstructorDescriptor]

'StaticMemberRequestResultProcessor' @ [337:39] ==> public constructor StaticMemberRequestResultProcessor(psiMember: PsiMember, classes: List<PsiClass>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor[ClassConstructorDescriptorImpl]

'member' @ [337:74] ==> public final val member: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask[PropertyDescriptorImpl]

'classes' @ [337:82] ==> val classes: List<(PsiClass..PsiClass?)> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'classes' @ [339:31] ==> val classes: List<(PsiClass..PsiClass?)> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'klass' @ [340:35] ==> val klass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'name' @ [340:41] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'declarationName' @ [340:54] ==> val declarationName: String defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess[LocalVariableDescriptor]

'testLog' @ [342:21] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'member' @ [342:64] ==> public final val member: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask[PropertyDescriptorImpl]

'name' @ [342:71] ==> public final val PsiMember.name: String?[MyPropertyDescriptor]

'request' @ [342:107] ==> val request: String defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'searchRequestCollector' @ [343:21] ==> val searchRequestCollector: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'searchWord' @ [343:44] ==> public open fun searchWord(@NotNull p0: String, @NotNull p1: SearchScope, p2: Short, p3: Boolean, @NotNull p4: PsiElement, @NotNull p5: RequestResultProcessor): Unit defined in com.intellij.psi.search.SearchRequestCollector[JavaMethodDescriptor]

'request' @ [344:29] ==> val request: String defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'classUseScope' @ [345:29] ==> private final fun classUseScope(psiClass: PsiClass): SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'klass' @ [345:43] ==> val klass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'intersectWith' @ [345:50] ==> @NotNull public abstract fun intersectWith(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.SearchScope[JavaMethodDescriptor]

'memberScope' @ [345:64] ==> public final val memberScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask[PropertyDescriptorImpl]

'IN_CODE' @ [345:97] ==> public const final val IN_CODE: Short defined in com.intellij.psi.search.UsageSearchContext[JavaPropertyDescriptor]

'member' @ [345:112] ==> public final val member: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask[PropertyDescriptorImpl]

'resultProcessor' @ [345:120] ==> val resultProcessor: ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'runReadAction' @ [347:41] ==> public fun <T> runReadAction(action: () -> String?): String? defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String?

'klass' @ [347:57] ==> val klass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'qualifiedName' @ [347:63] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'qualifiedName' @ [348:25] ==> val qualifiedName: String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'qualifiedName' @ [349:53] ==> val qualifiedName: String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'testLog' @ [351:25] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'member' @ [351:68] ==> public final val member: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask[PropertyDescriptorImpl]

'name' @ [351:75] ==> public final val PsiMember.name: String?[MyPropertyDescriptor]

'importAllUnderRequest' @ [351:111] ==> val importAllUnderRequest: String defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'searchRequestCollector' @ [352:25] ==> val searchRequestCollector: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'searchWord' @ [352:48] ==> public open fun searchWord(@NotNull p0: String, @NotNull p1: SearchScope, p2: Short, p3: Boolean, @NotNull p4: PsiElement, @NotNull p5: RequestResultProcessor): Unit defined in com.intellij.psi.search.SearchRequestCollector[JavaMethodDescriptor]

'importAllUnderRequest' @ [353:33] ==> val importAllUnderRequest: String defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'classUseScope' @ [354:33] ==> private final fun classUseScope(psiClass: PsiClass): SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'klass' @ [354:47] ==> val klass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'intersectWith' @ [354:54] ==> @NotNull public abstract fun intersectWith(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.SearchScope[JavaMethodDescriptor]

'memberScope' @ [354:68] ==> public final val memberScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask[PropertyDescriptorImpl]

'IN_CODE' @ [354:101] ==> public const final val IN_CODE: Short defined in com.intellij.psi.search.UsageSearchContext[JavaPropertyDescriptor]

'member' @ [354:116] ==> public final val member: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask[PropertyDescriptorImpl]

'resultProcessor' @ [354:124] ==> val resultProcessor: ExpressionsOfTypeProcessor.StaticMemberRequestResultProcessor defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'getInstance' @ [358:41] ==> public open fun getInstance(@NotNull p0: Project): (PsiSearchHelper..PsiSearchHelper?) defined in com.intellij.psi.search.PsiSearchHelper.SERVICE[JavaMethodDescriptor]

'project' @ [358:53] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'processRequests' @ [358:62] ==> public final fun processRequests(@NotNull p0: SearchRequestCollector, @NotNull p1: ((PsiReference..PsiReference?)) -> Boolean): Boolean defined in com.intellij.psi.search.PsiSearchHelper[MyFunctionDescriptor]

'searchRequestCollector' @ [358:78] ==> val searchRequestCollector: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform[LocalVariableDescriptor]

'if (reference.element.parents.any { it is KtImportDirective }) {
                        // Found declaration in import - process all file with an ordinal reference search
                        val containingFile = reference.element.containingFile
                        addCallableDeclarationToProcess(member, LocalSearchScope(containingFile), taskProcessor)

                        true
                    }
                    else {
                        val processed = taskProcessor.handler(this@ExpressionsOfTypeProcessor, reference)
                        if (!processed) { // we don't know how to handle this reference and down-shift to plain search
                            downShiftToPlainSearch(reference)
                        }

                        true
                    }' @ [359:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'reference' @ [359:25] ==> value-parameter reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [359:35] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parents' @ [359:43] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'any' @ [359:51] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [359:57] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'reference' @ [361:46] ==> value-parameter reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [361:56] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'containingFile' @ [361:64] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'addCallableDeclarationToProcess' @ [362:25] ==> private final fun addCallableDeclarationToProcess(declaration: PsiElement, scope: SearchScope, processor: ExpressionsOfTypeProcessor.ReferenceProcessor): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'member' @ [362:57] ==> public final val member: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask[PropertyDescriptorImpl]

'LocalSearchScope' @ [362:65] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'containingFile' @ [362:82] ==> val containingFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform.<anonymous>[LocalVariableDescriptor]

'taskProcessor' @ [362:99] ==> public final val taskProcessor: ExpressionsOfTypeProcessor.ReferenceProcessor defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask[PropertyDescriptorImpl]

'taskProcessor' @ [367:41] ==> public final val taskProcessor: ExpressionsOfTypeProcessor.ReferenceProcessor defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask[PropertyDescriptorImpl]

'invoke' @ [367:55] ==> public abstract operator fun invoke(p1: ExpressionsOfTypeProcessor, p2: PsiReference): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'this@ExpressionsOfTypeProcessor' @ [367:63] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[LazyClassReceiverParameterDescriptor]

'reference' @ [367:96] ==> value-parameter reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [368:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'processed' @ [368:30] ==> val processed: Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform.<anonymous>[LocalVariableDescriptor]

'downShiftToPlainSearch' @ [369:29] ==> private final fun downShiftToPlainSearch(reference: PsiReference): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'reference' @ [369:52] ==> value-parameter reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'addTask' @ [378:9] ==> private final fun addTask(task: ExpressionsOfTypeProcessor.Task): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'ProcessStaticCallableUsagesTask' @ [378:17] ==> public constructor ProcessStaticCallableUsagesTask(member: PsiMember, memberScope: SearchScope, taskProcessor: ExpressionsOfTypeProcessor.ReferenceProcessor) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess.ProcessStaticCallableUsagesTask[ClassConstructorDescriptorImpl]

'psiMember' @ [378:49] ==> value-parameter psiMember: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess[ValueParameterDescriptorImpl]

'scope' @ [378:60] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess[ValueParameterDescriptorImpl]

'processor' @ [378:67] ==> value-parameter processor: ExpressionsOfTypeProcessor.ReferenceProcessor defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addStaticMemberToProcess[ValueParameterDescriptorImpl]

'scope' @ [383:13] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'declaration' @ [383:43] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'declaration' @ [383:72] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'modifierList' @ [383:84] ==> public final val PsiMember.modifierList: PsiModifierList?[MyPropertyDescriptor]

'hasModifierProperty' @ [383:98] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String): Boolean defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'STATIC' @ [383:130] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'addStaticMemberToProcess' @ [384:13] ==> private final fun addStaticMemberToProcess(psiMember: PsiMember, scope: SearchScope, processor: ExpressionsOfTypeProcessor.ReferenceProcessor): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'declaration' @ [384:38] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'scope' @ [384:51] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'processor' @ [384:58] ==> value-parameter processor: ExpressionsOfTypeProcessor.ReferenceProcessor defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'Suppress' @ [388:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (scope is LocalSearchScope) {
                    testLog { "Searched imported static member $declaration in ${scope.scope.toList()}" }
                }
                else {
                    testLog { "Searched references to ${logPresentation(declaration)} in non-Java files" }
                }' @ [394:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'scope' @ [394:21] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'testLog' @ [395:21] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [395:65] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'scope' @ [395:82] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'scope' @ [395:88] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'toList' @ [395:94] ==> public fun <T> Array<out (PsiElement..PsiElement?)>.toList(): List<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'testLog' @ [398:21] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'logPresentation' @ [398:57] ==> public final fun logPresentation(element: PsiElement): String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [398:73] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'KotlinReferencesSearchParameters' @ [401:40] ==> public constructor KotlinReferencesSearchParameters(elementToSearch: PsiElement, scope: SearchScope = ..., ignoreAccessScope: Boolean = ..., optimizer: SearchRequestCollector? = ..., kotlinOptions: KotlinReferencesSearchOptions = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchParameters[ClassConstructorDescriptorImpl]

'declaration' @ [402:25] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'scope' @ [402:38] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'KotlinReferencesSearchOptions' @ [402:61] ==> public constructor KotlinReferencesSearchOptions(acceptCallableOverrides: Boolean = ..., acceptOverloads: Boolean = ..., acceptExtensionsOfDeclarationClass: Boolean = ..., acceptCompanionObjectMembers: Boolean = ..., searchForComponentConventions: Boolean = ..., searchForOperatorConventions: Boolean = ..., searchNamedArguments: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[ClassConstructorDescriptorImpl]

'searchReferences' @ [403:17] ==> private final fun searchReferences(parameters: ReferencesSearch.SearchParameters, processor: (PsiReference) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'searchParameters' @ [403:34] ==> val searchParameters: KotlinReferencesSearchParameters defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess.ProcessCallableUsagesTask.perform[LocalVariableDescriptor]

'processor' @ [404:37] ==> value-parameter processor: ExpressionsOfTypeProcessor.ReferenceProcessor defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'invoke' @ [404:47] ==> public abstract operator fun invoke(p1: ExpressionsOfTypeProcessor, p2: PsiReference): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'this@ExpressionsOfTypeProcessor' @ [404:55] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[LazyClassReceiverParameterDescriptor]

'reference' @ [404:88] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess.ProcessCallableUsagesTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [405:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'processed' @ [405:26] ==> val processed: Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess.ProcessCallableUsagesTask.perform.<anonymous>[LocalVariableDescriptor]

'downShiftToPlainSearch' @ [406:25] ==> private final fun downShiftToPlainSearch(reference: PsiReference): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'reference' @ [406:48] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess.ProcessCallableUsagesTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'processed' @ [408:21] ==> val processed: Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess.ProcessCallableUsagesTask.perform.<anonymous>[LocalVariableDescriptor]

'addTask' @ [412:9] ==> private final fun addTask(task: ExpressionsOfTypeProcessor.Task): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'ProcessCallableUsagesTask' @ [412:17] ==> public constructor ProcessCallableUsagesTask(declaration: PsiElement, processor: ExpressionsOfTypeProcessor.ReferenceProcessor, scope: SearchScope) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess.ProcessCallableUsagesTask[ClassConstructorDescriptorImpl]

'declaration' @ [412:43] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'processor' @ [412:56] ==> value-parameter processor: ExpressionsOfTypeProcessor.ReferenceProcessor defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'scope' @ [412:67] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcess[ValueParameterDescriptorImpl]

'!' @ [416:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [416:14] ==> value-parameter member: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addPsiMemberTask[ValueParameterDescriptorImpl]

'isPrivate' @ [416:21] ==> private final fun PsiModifierListOwner.isPrivate(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'!' @ [416:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [416:37] ==> value-parameter member: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addPsiMemberTask[ValueParameterDescriptorImpl]

'isLocal' @ [416:44] ==> private final fun PsiModifierListOwner.isLocal(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'addCallableDeclarationOfOurType' @ [417:13] ==> private final fun addCallableDeclarationOfOurType(declaration: PsiElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'member' @ [417:45] ==> value-parameter member: PsiMember defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addPsiMemberTask[ValueParameterDescriptorImpl]

'addCallableDeclarationToProcess' @ [422:9] ==> private final fun addCallableDeclarationToProcess(declaration: PsiElement, scope: SearchScope, processor: ExpressionsOfTypeProcessor.ReferenceProcessor): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'declaration' @ [422:41] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationOfOurType[ValueParameterDescriptorImpl]

'searchScope' @ [422:54] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'restrictToKotlinSources' @ [422:66] ==> public fun SearchScope.restrictToKotlinSources(): SearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'CallableOfOurType' @ [422:112] ==> enum entry CallableOfOurType defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.ReferenceProcessor[FakeCallableDescriptorForObject]

'projectScope' @ [430:39] ==> @NotNull public open fun projectScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [430:52] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'excludeFileTypes' @ [430:61] ==> public fun SearchScope.excludeFileTypes(vararg fileTypes: FileType): SearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'INSTANCE' @ [430:91] ==> public final val INSTANCE: (JavaFileType..JavaFileType?) defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'INSTANCE' @ [430:113] ==> public final val INSTANCE: (XmlFileType..XmlFileType?) defined in com.intellij.ide.highlighter.XmlFileType[JavaPropertyDescriptor]

'addCallableDeclarationToProcess' @ [431:9] ==> private final fun addCallableDeclarationToProcess(declaration: PsiElement, scope: SearchScope, processor: ExpressionsOfTypeProcessor.ReferenceProcessor): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'declaration' @ [431:41] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcessLambdasInCalls[ValueParameterDescriptorImpl]

'scope' @ [431:54] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addCallableDeclarationToProcessLambdasInCalls[LocalVariableDescriptor]

'ProcessLambdasInCalls' @ [431:80] ==> enum entry ProcessLambdasInCalls defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.ReferenceProcessor[FakeCallableDescriptorForObject]

'when (reference.element.language) {
        KotlinLanguage.INSTANCE -> {
            if (reference is KtDestructuringDeclarationReference) {
                // declaration usage in form of destructuring declaration entry
                addCallableDeclarationOfOurType(reference.element)
            }
            else {
                (reference.element as? KtReferenceExpression)?.let { processSuspiciousExpression(it) }
            }
            true
        }

        else -> false // reference in unknown language - we don't know how to handle it
    }' @ [437:80] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'reference' @ [437:86] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processReferenceToCallableOfOurType[ValueParameterDescriptorImpl]

'element' @ [437:96] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'language' @ [437:104] ==> public final val PsiElement.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [438:24] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'if (reference is KtDestructuringDeclarationReference) {
                // declaration usage in form of destructuring declaration entry
                addCallableDeclarationOfOurType(reference.element)
            }
            else {
                (reference.element as? KtReferenceExpression)?.let { processSuspiciousExpression(it) }
            }' @ [439:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'reference' @ [439:17] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processReferenceToCallableOfOurType[ValueParameterDescriptorImpl]

'addCallableDeclarationOfOurType' @ [441:17] ==> private final fun addCallableDeclarationOfOurType(declaration: PsiElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'reference' @ [441:49] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processReferenceToCallableOfOurType[ValueParameterDescriptorImpl]

'element' @ [441:59] ==> public final val KtDestructuringDeclarationReference.element: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)[MyPropertyDescriptor]

'reference' @ [444:18] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processReferenceToCallableOfOurType[ValueParameterDescriptorImpl]

'element' @ [444:28] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [444:64] ==> @InlineOnly public inline fun <T, R> KtReferenceExpression.let(block: (KtReferenceExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReferenceExpression
    <R> -> Unit

'processSuspiciousExpression' @ [444:70] ==> private final fun processSuspiciousExpression(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'it' @ [444:98] ==> value-parameter it: KtReferenceExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processReferenceToCallableOfOurType.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [453:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkPsiClass' @ [453:14] ==> private final fun checkPsiClass(psiClass: PsiClass): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'psiClass' @ [453:28] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addSamInterfaceToProcess[ValueParameterDescriptorImpl]

'projectScope' @ [459:47] ==> @NotNull public open fun projectScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [459:60] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'excludeFileTypes' @ [459:69] ==> public fun SearchScope.excludeFileTypes(vararg fileTypes: FileType): SearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'INSTANCE' @ [459:101] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'INSTANCE' @ [459:123] ==> public final val INSTANCE: (XmlFileType..XmlFileType?) defined in com.intellij.ide.highlighter.XmlFileType[JavaPropertyDescriptor]

'testLog' @ [460:17] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'logPresentation' @ [460:53] ==> public final fun logPresentation(element: PsiElement): String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'psiClass' @ [460:69] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addSamInterfaceToProcess[ValueParameterDescriptorImpl]

'searchReferences' @ [461:17] ==> private final fun searchReferences(element: PsiElement, scope: SearchScope, processor: (PsiReference) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'psiClass' @ [461:34] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addSamInterfaceToProcess[ValueParameterDescriptorImpl]

'scope' @ [461:44] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addSamInterfaceToProcess.ProcessSamInterfaceTask.perform[LocalVariableDescriptor]

'reference' @ [462:25] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addSamInterfaceToProcess.ProcessSamInterfaceTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [462:35] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'language' @ [462:43] ==> public final val PsiElement.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [462:68] ==> @NotNull public final val INSTANCE: JavaLanguage defined in com.intellij.lang.java.JavaLanguage[JavaPropertyDescriptor]

'downShiftToPlainSearch' @ [463:25] ==> private final fun downShiftToPlainSearch(reference: PsiReference): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'reference' @ [463:48] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addSamInterfaceToProcess.ProcessSamInterfaceTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'reference' @ [468:39] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addSamInterfaceToProcess.ProcessSamInterfaceTask.perform.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [468:83] ==> public final val PsiJavaCodeReferenceElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [468:111] ==> public final val PsiTypeElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parameter' @ [469:34] ==> val parameter: PsiParameter? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addSamInterfaceToProcess.ProcessSamInterfaceTask.perform.<anonymous>[LocalVariableDescriptor]

'declarationScope' @ [469:45] ==> public final val PsiParameter.declarationScope: PsiElement[MyPropertyDescriptor]

'method' @ [470:25] ==> val method: PsiMethod? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addSamInterfaceToProcess.ProcessSamInterfaceTask.perform.<anonymous>[LocalVariableDescriptor]

'addCallableDeclarationToProcessLambdasInCalls' @ [471:25] ==> private final fun addCallableDeclarationToProcessLambdasInCalls(declaration: PsiElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'method' @ [471:71] ==> val method: PsiMethod? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addSamInterfaceToProcess.ProcessSamInterfaceTask.perform.<anonymous>[LocalVariableDescriptor]

'addTask' @ [477:9] ==> private final fun addTask(task: ExpressionsOfTypeProcessor.Task): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'ProcessSamInterfaceTask' @ [477:17] ==> public constructor ProcessSamInterfaceTask(psiClass: PsiClass) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addSamInterfaceToProcess.ProcessSamInterfaceTask[ClassConstructorDescriptorImpl]

'psiClass' @ [477:41] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.addSamInterfaceToProcess[ValueParameterDescriptorImpl]

'when (element) {
            is KtReferenceExpression -> {
                val parent = element.parent
                when (parent) {
                    is KtUserType -> { // usage in type
                        return processClassUsageInUserType(parent)
                    }

                    is KtCallExpression -> {
                        if (element == parent.calleeExpression) {  // constructor invocation
                            processSuspiciousExpression(parent)
                            return true
                        }
                    }

                    is KtContainerNode -> {
                        if (parent.node.elementType == KtNodeTypes.LABEL_QUALIFIER) {
                            return true // this@ClassName - it will be handled anyway because members and extensions are processed with plain search
                        }
                    }

                    is KtQualifiedExpression -> {
                        // <class name>.memberName or some.<class name>.memberName
                        if (element == parent.receiverExpression || parent.parent is KtQualifiedExpression) {
                            return true // companion object member or static member access - ignore it
                        }
                    }

                    is KtCallableReferenceExpression -> {
                        when (element) {
                            parent.receiverExpression -> { // usage in receiver of callable reference (before "::") - ignore it
                                return true
                            }

                            parent.callableReference -> { // usage after "::" in callable reference - should be reference to constructor of our class
                                processSuspiciousExpression(element)
                                return true
                            }
                        }
                    }

                    is KtClassLiteralExpression -> {
                        if (element == parent.receiverExpression) { // <class name>::class
                            processSuspiciousExpression(element)
                            return true
                        }
                    }
                }

                if (element.getStrictParentOfType<KtImportDirective>() != null) return true // ignore usage in import

                val bindingContext = element.analyze(BodyResolveMode.PARTIAL)
                val hasType = bindingContext.getType(element) != null
                if (hasType) { // access to object or companion object
                    processSuspiciousExpression(element)
                    return true
                }
            }

            is KDocName -> return true // ignore usage in doc-comment
        }' @ [483:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [483:15] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[ValueParameterDescriptorImpl]

'element' @ [485:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[ValueParameterDescriptorImpl]

'parent' @ [485:38] ==> public final val KtReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                    is KtUserType -> { // usage in type
                        return processClassUsageInUserType(parent)
                    }

                    is KtCallExpression -> {
                        if (element == parent.calleeExpression) {  // constructor invocation
                            processSuspiciousExpression(parent)
                            return true
                        }
                    }

                    is KtContainerNode -> {
                        if (parent.node.elementType == KtNodeTypes.LABEL_QUALIFIER) {
                            return true // this@ClassName - it will be handled anyway because members and extensions are processed with plain search
                        }
                    }

                    is KtQualifiedExpression -> {
                        // <class name>.memberName or some.<class name>.memberName
                        if (element == parent.receiverExpression || parent.parent is KtQualifiedExpression) {
                            return true // companion object member or static member access - ignore it
                        }
                    }

                    is KtCallableReferenceExpression -> {
                        when (element) {
                            parent.receiverExpression -> { // usage in receiver of callable reference (before "::") - ignore it
                                return true
                            }

                            parent.callableReference -> { // usage after "::" in callable reference - should be reference to constructor of our class
                                processSuspiciousExpression(element)
                                return true
                            }
                        }
                    }

                    is KtClassLiteralExpression -> {
                        if (element == parent.receiverExpression) { // <class name>::class
                            processSuspiciousExpression(element)
                            return true
                        }
                    }
                }' @ [486:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [486:23] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[LocalVariableDescriptor]

'processClassUsageInUserType' @ [488:32] ==> private final fun processClassUsageInUserType(userType: KtUserType): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'parent' @ [488:60] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[LocalVariableDescriptor]

'element' @ [492:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[ValueParameterDescriptorImpl]

'parent' @ [492:40] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[LocalVariableDescriptor]

'calleeExpression' @ [492:47] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'processSuspiciousExpression' @ [493:29] ==> private final fun processSuspiciousExpression(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'parent' @ [493:57] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[LocalVariableDescriptor]

'parent' @ [499:29] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[LocalVariableDescriptor]

'node' @ [499:36] ==> public final val KtContainerNode.node: ASTNode[MyPropertyDescriptor]

'elementType' @ [499:41] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'LABEL_QUALIFIER' @ [499:68] ==> public final val LABEL_QUALIFIER: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'element' @ [506:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[ValueParameterDescriptorImpl]

'parent' @ [506:40] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[LocalVariableDescriptor]

'receiverExpression' @ [506:47] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'parent' @ [506:69] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[LocalVariableDescriptor]

'parent' @ [506:76] ==> public final val KtQualifiedExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (element) {
                            parent.receiverExpression -> { // usage in receiver of callable reference (before "::") - ignore it
                                return true
                            }

                            parent.callableReference -> { // usage after "::" in callable reference - should be reference to constructor of our class
                                processSuspiciousExpression(element)
                                return true
                            }
                        }' @ [512:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'element' @ [512:31] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[ValueParameterDescriptorImpl]

'parent' @ [513:29] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[LocalVariableDescriptor]

'receiverExpression' @ [513:36] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[DeserializedPropertyDescriptor]

'parent' @ [517:29] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[LocalVariableDescriptor]

'callableReference' @ [517:36] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'processSuspiciousExpression' @ [518:33] ==> private final fun processSuspiciousExpression(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'element' @ [518:61] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[ValueParameterDescriptorImpl]

'element' @ [525:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[ValueParameterDescriptorImpl]

'parent' @ [525:40] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[LocalVariableDescriptor]

'receiverExpression' @ [525:47] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtClassLiteralExpression[DeserializedPropertyDescriptor]

'processSuspiciousExpression' @ [526:29] ==> private final fun processSuspiciousExpression(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'element' @ [526:57] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[ValueParameterDescriptorImpl]

'element' @ [532:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [532:29] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'element' @ [534:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[ValueParameterDescriptorImpl]

'analyze' @ [534:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [534:70] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'bindingContext' @ [535:31] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[LocalVariableDescriptor]

'getType' @ [535:46] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'element' @ [535:54] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[ValueParameterDescriptorImpl]

'hasType' @ [536:21] ==> val hasType: Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[LocalVariableDescriptor]

'processSuspiciousExpression' @ [537:21] ==> private final fun processSuspiciousExpression(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'element' @ [537:49] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInKotlin[ValueParameterDescriptorImpl]

'userType' @ [549:23] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[ValueParameterDescriptorImpl]

'parents' @ [549:32] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'lastOrNull' @ [549:40] ==> public inline fun <T> Sequence<PsiElement>.lastOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [549:53] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType.<anonymous>[ValueParameterDescriptorImpl]

'typeRef' @ [550:29] ==> val typeRef: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'parent' @ [550:38] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (typeRefParent) {
            is KtCallableDeclaration -> {
                when (typeRef) {
                    typeRefParent.typeReference -> { // usage in type of callable declaration
                        addCallableDeclarationOfOurType(typeRefParent)

                        if (typeRefParent is KtParameter) { //TODO: what if functional type is declared with "FunctionN<...>"?
                            val usedInsideFunctionalType = userType.parents.takeWhile { it != typeRef }.any { it is KtFunctionType }
                            if (usedInsideFunctionalType) {
                                val function = (typeRefParent.parent as? KtParameterList)?.parent as? KtFunction
                                if (function != null) {
                                    addCallableDeclarationOfOurType(function)
                                }
                            }
                        }

                        return true
                    }

                    typeRefParent.receiverTypeReference -> { // usage in receiver type of callable declaration
                        // we must use plain search inside extensions because implicit 'this' can happen anywhere
                        usePlainSearch(typeRefParent)
                        return true
                    }
                }
            }

            is KtTypeProjection -> { // usage in type arguments of a call
                val callExpression = (typeRefParent.parent as? KtTypeArgumentList)?.parent as? KtCallExpression
                if (callExpression != null) {
                    processSuspiciousExpression(callExpression)
                    return true
                }
            }

            is KtConstructorCalleeExpression -> { // super-class name in the list of bases
                val parent = typeRefParent.parent
                if (parent is KtSuperTypeCallEntry) {
                    val classOrObject = (parent.parent as KtSuperTypeList).parent as KtClassOrObject
                    val psiClass = classOrObject.toLightClass()
                    psiClass?.let { addClassToProcess(it) }
                    return true
                }
            }

            is KtSuperTypeListEntry -> { // super-interface name in the list of bases
                if (typeRef == typeRefParent.typeReference) {
                    val classOrObject = (typeRefParent.parent as KtSuperTypeList).parent as KtClassOrObject
                    val psiClass = classOrObject.toLightClass()
                    psiClass?.let { addClassToProcess(it) }
                    return true
                }
            }

            is KtIsExpression -> { // <expr> is <class name>
                val scopeOfPossibleSmartCast = typeRefParent.getParentOfType<KtDeclarationWithBody>(true)
                scopeOfPossibleSmartCast?.let { usePlainSearch(it) }
                return true
            }

            is KtWhenConditionIsPattern -> { // "is <class name>" or "!is <class name>" in when
                val whenEntry = typeRefParent.parent as KtWhenEntry
                if (typeRefParent.isNegated) {
                    val whenExpression = whenEntry.parent as KtWhenExpression
                    val entriesAfter = whenExpression.entries.dropWhile { it != whenEntry }.drop(1)
                    entriesAfter.forEach { usePlainSearch(it) }
                }
                else {
                    usePlainSearch(whenEntry)
                }
                return true
            }

            is KtBinaryExpressionWithTypeRHS -> { // <expr> as <class name>
                processSuspiciousExpression(typeRefParent)
                return true
            }
        }' @ [551:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit, entry6: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'typeRefParent' @ [551:15] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'when (typeRef) {
                    typeRefParent.typeReference -> { // usage in type of callable declaration
                        addCallableDeclarationOfOurType(typeRefParent)

                        if (typeRefParent is KtParameter) { //TODO: what if functional type is declared with "FunctionN<...>"?
                            val usedInsideFunctionalType = userType.parents.takeWhile { it != typeRef }.any { it is KtFunctionType }
                            if (usedInsideFunctionalType) {
                                val function = (typeRefParent.parent as? KtParameterList)?.parent as? KtFunction
                                if (function != null) {
                                    addCallableDeclarationOfOurType(function)
                                }
                            }
                        }

                        return true
                    }

                    typeRefParent.receiverTypeReference -> { // usage in receiver type of callable declaration
                        // we must use plain search inside extensions because implicit 'this' can happen anywhere
                        usePlainSearch(typeRefParent)
                        return true
                    }
                }' @ [553:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'typeRef' @ [553:23] ==> val typeRef: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'typeRefParent' @ [554:21] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'typeReference' @ [554:35] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'addCallableDeclarationOfOurType' @ [555:25] ==> private final fun addCallableDeclarationOfOurType(declaration: PsiElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'typeRefParent' @ [555:57] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'typeRefParent' @ [557:29] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'userType' @ [558:60] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[ValueParameterDescriptorImpl]

'parents' @ [558:69] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [558:77] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [558:89] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType.<anonymous>[ValueParameterDescriptorImpl]

'typeRef' @ [558:95] ==> val typeRef: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'any' @ [558:105] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [558:111] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType.<anonymous>[ValueParameterDescriptorImpl]

'usedInsideFunctionalType' @ [559:33] ==> val usedInsideFunctionalType: Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'typeRefParent' @ [560:49] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'parent' @ [560:63] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [560:92] ==> public final val KtParameterList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'function' @ [561:37] ==> val function: KtFunction? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'addCallableDeclarationOfOurType' @ [562:37] ==> private final fun addCallableDeclarationOfOurType(declaration: PsiElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'function' @ [562:69] ==> val function: KtFunction? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'typeRefParent' @ [570:21] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'receiverTypeReference' @ [570:35] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'usePlainSearch' @ [572:25] ==> private final fun usePlainSearch(scope: KtElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'typeRefParent' @ [572:40] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'typeRefParent' @ [579:39] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'parent' @ [579:53] ==> public final val KtTypeProjection.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [579:85] ==> public final val KtTypeArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpression' @ [580:21] ==> val callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'processSuspiciousExpression' @ [581:21] ==> private final fun processSuspiciousExpression(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'callExpression' @ [581:49] ==> val callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'typeRefParent' @ [587:30] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'parent' @ [587:44] ==> public final val KtConstructorCalleeExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [588:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'parent' @ [589:42] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'parent' @ [589:49] ==> public final val KtSuperTypeCallEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [589:76] ==> public final val KtSuperTypeList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'classOrObject' @ [590:36] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'toLightClass' @ [590:50] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'psiClass' @ [591:21] ==> val psiClass: KtLightClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'let' @ [591:31] ==> @InlineOnly public inline fun <T, R> KtLightClass.let(block: (KtLightClass) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass
    <R> -> Unit

'addClassToProcess' @ [591:37] ==> private final fun addClassToProcess(classToSearch: PsiClass): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'it' @ [591:55] ==> value-parameter it: KtLightClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType.<anonymous>[ValueParameterDescriptorImpl]

'typeRef' @ [597:21] ==> val typeRef: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'typeRefParent' @ [597:32] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'typeReference' @ [597:46] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeRefParent' @ [598:42] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'parent' @ [598:56] ==> public final val KtSuperTypeListEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [598:83] ==> public final val KtSuperTypeList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'classOrObject' @ [599:36] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'toLightClass' @ [599:50] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'psiClass' @ [600:21] ==> val psiClass: KtLightClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'let' @ [600:31] ==> @InlineOnly public inline fun <T, R> KtLightClass.let(block: (KtLightClass) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass
    <R> -> Unit

'addClassToProcess' @ [600:37] ==> private final fun addClassToProcess(classToSearch: PsiClass): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'it' @ [600:55] ==> value-parameter it: KtLightClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType.<anonymous>[ValueParameterDescriptorImpl]

'typeRefParent' @ [606:48] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'getParentOfType' @ [606:62] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtDeclarationWithBody? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclarationWithBody

'scopeOfPossibleSmartCast' @ [607:17] ==> val scopeOfPossibleSmartCast: KtDeclarationWithBody? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'let' @ [607:43] ==> @InlineOnly public inline fun <T, R> KtDeclarationWithBody.let(block: (KtDeclarationWithBody) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclarationWithBody
    <R> -> Unit

'usePlainSearch' @ [607:49] ==> private final fun usePlainSearch(scope: KtElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'it' @ [607:64] ==> value-parameter it: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType.<anonymous>[ValueParameterDescriptorImpl]

'typeRefParent' @ [612:33] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'parent' @ [612:47] ==> public final val KtWhenConditionIsPattern.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (typeRefParent.isNegated) {
                    val whenExpression = whenEntry.parent as KtWhenExpression
                    val entriesAfter = whenExpression.entries.dropWhile { it != whenEntry }.drop(1)
                    entriesAfter.forEach { usePlainSearch(it) }
                }
                else {
                    usePlainSearch(whenEntry)
                }' @ [613:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'typeRefParent' @ [613:21] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'isNegated' @ [613:35] ==> public final val KtWhenConditionIsPattern.isNegated: Boolean[MyPropertyDescriptor]

'whenEntry' @ [614:42] ==> val whenEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'parent' @ [614:52] ==> public final val KtWhenEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'whenExpression' @ [615:40] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'entries' @ [615:55] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'dropWhile' @ [615:63] ==> public inline fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.dropWhile(predicate: ((KtWhenEntry..KtWhenEntry?)) -> Boolean): List<(KtWhenEntry..KtWhenEntry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'it' @ [615:75] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType.<anonymous>[ValueParameterDescriptorImpl]

'whenEntry' @ [615:81] ==> val whenEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'drop' @ [615:93] ==> public fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.drop(n: Int): List<(KtWhenEntry..KtWhenEntry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'entriesAfter' @ [616:21] ==> val entriesAfter: List<(KtWhenEntry..KtWhenEntry?)> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'forEach' @ [616:34] ==> @HidesMembers public inline fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.forEach(action: ((KtWhenEntry..KtWhenEntry?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'usePlainSearch' @ [616:44] ==> private final fun usePlainSearch(scope: KtElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'it' @ [616:59] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType.<anonymous>[ValueParameterDescriptorImpl]

'usePlainSearch' @ [619:21] ==> private final fun usePlainSearch(scope: KtElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'whenEntry' @ [619:36] ==> val whenEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'processSuspiciousExpression' @ [625:17] ==> private final fun processSuspiciousExpression(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'typeRefParent' @ [625:45] ==> val typeRefParent: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInUserType[LocalVariableDescriptor]

'element' @ [634:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[ValueParameterDescriptorImpl]

'element' @ [636:20] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[ValueParameterDescriptorImpl]

'element' @ [638:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[ValueParameterDescriptorImpl]

'parents' @ [638:32] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'when (parent) {
                is PsiCodeBlock,
                is PsiExpression ->
                    break@ParentsLoop // ignore local usages

                is PsiMethod -> {
                    if (prev == parent.returnTypeElement) { // usage in return type of a method
                        addPsiMemberTask(parent)
                    }
                    break@ParentsLoop
                }

                is PsiField -> {
                    if (prev == parent.typeElement) { // usage in type of a field
                        addPsiMemberTask(parent)
                    }
                    break@ParentsLoop
                }

                is PsiReferenceList -> { // usage in extends/implements list
                    if (parent.role == PsiReferenceList.Role.EXTENDS_LIST || parent.role == PsiReferenceList.Role.IMPLEMENTS_LIST) {
                        val psiClass = parent.parent as PsiClass
                        addNonKotlinClassToProcess(psiClass)
                    }
                    break@ParentsLoop
                }

            //TODO: if Java parameter has Kotlin functional type then we should process method usages
                is PsiParameter -> {
                    if (prev == parent.typeElement) { // usage in parameter type - check if the method is in SAM interface
                        processParameterInSamClass(parent)
                    }
                    break@ParentsLoop
                }
            }' @ [639:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing, entry4: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'parent' @ [639:19] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'prev' @ [645:25] ==> var prev: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'parent' @ [645:33] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'returnTypeElement' @ [645:40] ==> public final val PsiMethod.returnTypeElement: PsiTypeElement?[MyPropertyDescriptor]

'addPsiMemberTask' @ [646:25] ==> private final fun addPsiMemberTask(member: PsiMember): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'parent' @ [646:42] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'prev' @ [652:25] ==> var prev: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'parent' @ [652:33] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'typeElement' @ [652:40] ==> public final val PsiField.typeElement: PsiTypeElement?[MyPropertyDescriptor]

'addPsiMemberTask' @ [653:25] ==> private final fun addPsiMemberTask(member: PsiMember): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'parent' @ [653:42] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'parent' @ [659:25] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'role' @ [659:32] ==> public final val PsiReferenceList.role: (PsiReferenceList.Role..PsiReferenceList.Role?)[MyPropertyDescriptor]

'EXTENDS_LIST' @ [659:62] ==> enum entry EXTENDS_LIST defined in com.intellij.psi.PsiReferenceList.Role[FakeCallableDescriptorForObject]

'parent' @ [659:78] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'role' @ [659:85] ==> public final val PsiReferenceList.role: (PsiReferenceList.Role..PsiReferenceList.Role?)[MyPropertyDescriptor]

'IMPLEMENTS_LIST' @ [659:115] ==> enum entry IMPLEMENTS_LIST defined in com.intellij.psi.PsiReferenceList.Role[FakeCallableDescriptorForObject]

'parent' @ [660:40] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'parent' @ [660:47] ==> public final val PsiReferenceList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addNonKotlinClassToProcess' @ [661:25] ==> private final fun addNonKotlinClassToProcess(classToSearch: PsiClass): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'psiClass' @ [661:52] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'prev' @ [668:25] ==> var prev: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'parent' @ [668:33] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'typeElement' @ [668:40] ==> public final val PsiParameter.typeElement: PsiTypeElement?[MyPropertyDescriptor]

'processParameterInSamClass' @ [669:25] ==> private final fun processParameterInSamClass(psiParameter: PsiParameter): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'parent' @ [669:52] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'prev' @ [675:13] ==> var prev: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'parent' @ [675:20] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInJava[LocalVariableDescriptor]

'typeElement' @ [683:33] ==> value-parameter typeElement: PsiTypeElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.checkReferenceInTypeElement[ValueParameterDescriptorImpl]

'textRange' @ [683:46] ==> public final val PsiTypeElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'typeTextRange' @ [684:21] ==> val typeTextRange: TextRange? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.checkReferenceInTypeElement[LocalVariableDescriptor]

'element' @ [684:46] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.checkReferenceInTypeElement[ValueParameterDescriptorImpl]

'textRange' @ [684:54] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'typeTextRange' @ [684:67] ==> val typeTextRange: TextRange? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.checkReferenceInTypeElement[LocalVariableDescriptor]

'checkReferenceInTypeElement' @ [688:17] ==> local final fun checkReferenceInTypeElement(typeElement: PsiTypeElement?, element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[SimpleFunctionDescriptorImpl]

'parameter' @ [688:45] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processParameter[ValueParameterDescriptorImpl]

'typeElement' @ [688:55] ==> public final val PsiParameter.typeElement: PsiTypeElement?[MyPropertyDescriptor]

'element' @ [688:68] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[ValueParameterDescriptorImpl]

'processParameterInSamClass' @ [689:17] ==> private final fun processParameterInSamClass(psiParameter: PsiParameter): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'parameter' @ [689:44] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processParameter[ValueParameterDescriptorImpl]

'checkReferenceInTypeElement' @ [697:17] ==> local final fun checkReferenceInTypeElement(typeElement: PsiTypeElement?, element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[SimpleFunctionDescriptorImpl]

'method' @ [697:45] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processMethod[ValueParameterDescriptorImpl]

'returnTypeElement' @ [697:52] ==> public final val PsiMethod.returnTypeElement: PsiTypeElement?[MyPropertyDescriptor]

'element' @ [697:71] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[ValueParameterDescriptorImpl]

'addPsiMemberTask' @ [698:17] ==> private final fun addPsiMemberTask(member: PsiMember): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'method' @ [698:34] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processMethod[ValueParameterDescriptorImpl]

'method' @ [702:30] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processMethod[ValueParameterDescriptorImpl]

'parameterList' @ [702:37] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [702:51] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'parameters' @ [703:31] ==> val parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processMethod[LocalVariableDescriptor]

'processParameter' @ [704:21] ==> local final fun processParameter(parameter: PsiParameter): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[SimpleFunctionDescriptorImpl]

'parameter' @ [704:38] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processMethod[LocalVariableDescriptor]

'checkReferenceInTypeElement' @ [713:17] ==> local final fun checkReferenceInTypeElement(typeElement: PsiTypeElement?, element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[SimpleFunctionDescriptorImpl]

'field' @ [713:45] ==> value-parameter field: PsiField defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processField[ValueParameterDescriptorImpl]

'typeElement' @ [713:51] ==> public final val PsiField.typeElement: PsiTypeElement?[MyPropertyDescriptor]

'element' @ [713:64] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[ValueParameterDescriptorImpl]

'addPsiMemberTask' @ [714:17] ==> private final fun addPsiMemberTask(member: PsiMember): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'field' @ [714:34] ==> value-parameter field: PsiField defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processField[ValueParameterDescriptorImpl]

'!' @ [722:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkPsiClass' @ [722:18] ==> private final fun checkPsiClass(psiClass: PsiClass): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'psiClass' @ [722:32] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass[ValueParameterDescriptorImpl]

'element' @ [726:48] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[ValueParameterDescriptorImpl]

'textRange' @ [726:56] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'elementTextRange' @ [727:17] ==> val elementTextRange: TextRange? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass[LocalVariableDescriptor]

'listOf' @ [728:33] ==> public fun <T> listOf(vararg elements: PsiReferenceList?): List<PsiReferenceList?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReferenceList?

'psiClass' @ [728:40] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass[ValueParameterDescriptorImpl]

'extendsList' @ [728:49] ==> public final val PsiClass.extendsList: PsiReferenceList?[MyPropertyDescriptor]

'psiClass' @ [728:62] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass[ValueParameterDescriptorImpl]

'implementsList' @ [728:71] ==> public final val PsiClass.implementsList: PsiReferenceList?[MyPropertyDescriptor]

'superList' @ [729:42] ==> val superList: List<PsiReferenceList?> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass[LocalVariableDescriptor]

'psiReferenceList' @ [730:54] ==> val psiReferenceList: PsiReferenceList? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass[LocalVariableDescriptor]

'textRange' @ [730:72] ==> public final val PsiReferenceList.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'superListRange' @ [731:25] ==> val superListRange: TextRange? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass[LocalVariableDescriptor]

'elementTextRange' @ [731:51] ==> val elementTextRange: TextRange? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass[LocalVariableDescriptor]

'superListRange' @ [731:71] ==> val superListRange: TextRange? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass[LocalVariableDescriptor]

'addNonKotlinClassToProcess' @ [732:25] ==> private final fun addNonKotlinClassToProcess(classToSearch: PsiClass): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'psiClass' @ [732:52] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass[ValueParameterDescriptorImpl]

'psiClass' @ [738:17] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass[ValueParameterDescriptorImpl]

'fields' @ [738:26] ==> public final val PsiClass.fields: (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>)[MyPropertyDescriptor]

'any' @ [738:33] ==> public inline fun <T> Array<out (PsiField..PsiField?)>.any(predicate: ((PsiField..PsiField?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)

'processField' @ [738:39] ==> local final fun processField(field: PsiField): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[SimpleFunctionDescriptorImpl]

'it' @ [738:52] ==> value-parameter it: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass.<anonymous>[ValueParameterDescriptorImpl]

'psiClass' @ [742:17] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass[ValueParameterDescriptorImpl]

'methods' @ [742:26] ==> public final val PsiClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'any' @ [742:34] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.any(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'processMethod' @ [742:40] ==> local final fun processMethod(method: PsiMethod): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[SimpleFunctionDescriptorImpl]

'it' @ [742:54] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass.processClass.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [749:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[ValueParameterDescriptorImpl]

'getParentOfType' @ [749:32] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): PsiClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiClass

'psiClass' @ [750:13] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[LocalVariableDescriptor]

'processClass' @ [751:13] ==> local final fun processClass(psiClass: PsiClass): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[SimpleFunctionDescriptorImpl]

'psiClass' @ [751:26] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processClassUsageInLanguageWithPsiClass[LocalVariableDescriptor]

'psiParameter' @ [756:22] ==> value-parameter psiParameter: PsiParameter defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processParameterInSamClass[ValueParameterDescriptorImpl]

'declarationScope' @ [756:35] ==> public final val PsiParameter.declarationScope: PsiElement[MyPropertyDescriptor]

'method' @ [758:13] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processParameterInSamClass[LocalVariableDescriptor]

'hasModifierProperty' @ [758:20] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'ABSTRACT' @ [758:52] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'method' @ [759:28] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processParameterInSamClass[LocalVariableDescriptor]

'containingClass' @ [759:35] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'psiClass' @ [760:17] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processParameterInSamClass[LocalVariableDescriptor]

'testLog' @ [761:17] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'psiClass' @ [761:65] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processParameterInSamClass[LocalVariableDescriptor]

'qualifiedName' @ [761:74] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'KotlinCacheService' @ [763:40] ==> public companion object defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[FakeCallableDescriptorForObject]

'getInstance' @ [763:59] ==> public final fun getInstance(project: Project): KotlinCacheService defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [763:71] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'getResolutionFacadeByFile' @ [763:80] ==> public abstract fun getResolutionFacadeByFile(file: PsiFile, platform: TargetPlatform): ResolutionFacade defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[DeserializedSimpleFunctionDescriptor]

'psiClass' @ [763:106] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processParameterInSamClass[LocalVariableDescriptor]

'containingFile' @ [763:115] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'JvmPlatform' @ [763:131] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'psiClass' @ [764:39] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processParameterInSamClass[LocalVariableDescriptor]

'resolveToDescriptor' @ [764:48] ==> public fun PsiClass.resolveToDescriptor(resolutionFacade: ResolutionFacade, declarationTranslator: (KtClassOrObject) -> KtClassOrObject? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve in file JavaResolveExtension.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [764:68] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processParameterInSamClass[LocalVariableDescriptor]

'classDescriptor' @ [765:21] ==> val classDescriptor: JavaClassDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processParameterInSamClass[LocalVariableDescriptor]

'!=' @ [765:48] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[DeserializedSimpleFunctionDescriptor]

'getSingleAbstractMethodOrNull' @ [765:74] ==> @Nullable public open fun getSingleAbstractMethodOrNull(@NotNull p0: JavaClassDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'classDescriptor' @ [765:104] ==> val classDescriptor: JavaClassDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processParameterInSamClass[LocalVariableDescriptor]

'addSamInterfaceToProcess' @ [766:21] ==> private final fun addSamInterfaceToProcess(psiClass: PsiClass): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'psiClass' @ [766:46] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processParameterInSamClass[LocalVariableDescriptor]

'expression' @ [779:23] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[ValueParameterDescriptorImpl]

'searchScope' @ [779:37] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'expression' @ [780:41] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[ValueParameterDescriptorImpl]

'expression' @ [782:25] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [782:36] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'affectedScope' @ [783:13] ==> var affectedScope: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'element' @ [783:29] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'element' @ [784:17] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'searchScope' @ [786:17] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'inScope' @ [787:17] ==> var inScope: Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'inScope' @ [787:27] ==> var inScope: Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'element' @ [787:38] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'searchScope' @ [787:49] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'inScope' @ [789:17] ==> var inScope: Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'invoke' @ [790:17] ==> public abstract operator fun invoke(p1: KtExpression): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [790:38] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'element' @ [793:26] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'parent' @ [793:34] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                is KtDestructuringDeclaration -> { // "val (x, y) = <expr>"
                    processSuspiciousDeclaration(parent)
                    break@ParentsLoop
                }

                is KtDeclarationWithInitializer -> { // "val x = <expr>" or "fun f() = <expr>"
                    if (element == parent.initializer) {
                        processSuspiciousDeclaration(parent)
                    }
                    break@ParentsLoop
                }

                is KtContainerNode -> {
                    if (parent.node.elementType == KtNodeTypes.LOOP_RANGE) { // "for (x in <expr>) ..."
                        val forExpression = parent.parent as KtForExpression
                        (forExpression.destructuringDeclaration ?: forExpression.loopParameter as KtDeclaration?)?.let {
                            processSuspiciousDeclaration(it)
                        }
                        break@ParentsLoop
                    }
                }
            }' @ [794:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [794:19] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'processSuspiciousDeclaration' @ [796:21] ==> private final fun processSuspiciousDeclaration(declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'parent' @ [796:50] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'element' @ [801:25] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'parent' @ [801:36] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'initializer' @ [801:43] ==> public final val KtDeclarationWithInitializer.initializer: KtExpression?[MyPropertyDescriptor]

'processSuspiciousDeclaration' @ [802:25] ==> private final fun processSuspiciousDeclaration(declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'parent' @ [802:54] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'parent' @ [808:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'node' @ [808:32] ==> public final val KtContainerNode.node: ASTNode[MyPropertyDescriptor]

'elementType' @ [808:37] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'LOOP_RANGE' @ [808:64] ==> public final val LOOP_RANGE: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'parent' @ [809:45] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'parent' @ [809:52] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'forExpression' @ [810:26] ==> val forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'destructuringDeclaration' @ [810:40] ==> public final val KtForExpression.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'forExpression' @ [810:68] ==> val forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'loopParameter' @ [810:82] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'let' @ [810:116] ==> @InlineOnly public inline fun <T, R> KtDeclaration.let(block: (KtDeclaration) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> Unit

'processSuspiciousDeclaration' @ [811:29] ==> private final fun processSuspiciousDeclaration(declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'it' @ [811:58] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [818:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [818:18] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'mayTypeAffectAncestors' @ [818:26] ==> private final fun KtExpression.mayTypeAffectAncestors(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'usePlainSearchInLambdas' @ [822:9] ==> private final fun usePlainSearchInLambdas(scope: PsiElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'affectedScope' @ [822:33] ==> var affectedScope: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousExpression[LocalVariableDescriptor]

'usePlainSearchInLambdas' @ [827:9] ==> private final fun usePlainSearchInLambdas(scope: PsiElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'expression' @ [827:33] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processLambdasForCallableReference[ValueParameterDescriptorImpl]

'parent' @ [827:44] ==> public final val KtReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (declaration is KtDestructuringDeclaration) {
            declaration.entries.forEach { processSuspiciousDeclaration(it) }
        }
        else {
            if (!isImplicitlyTyped(declaration)) return

            testLog { "Checked type of ${logPresentation(declaration)}" }

            val descriptor = declaration.resolveToDescriptorIfAny() as? CallableDescriptor ?: return
            val type = descriptor.returnType
            if (type != null && type.containsTypeOrDerivedInside(typeToSearch)) {
                addCallableDeclarationOfOurType(declaration)
            }
        }' @ [834:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [834:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [835:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousDeclaration[ValueParameterDescriptorImpl]

'entries' @ [835:25] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'forEach' @ [835:33] ==> @HidesMembers public inline fun <T> Iterable<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>.forEach(action: ((KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)

'processSuspiciousDeclaration' @ [835:43] ==> private final fun processSuspiciousDeclaration(declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'it' @ [835:72] ==> value-parameter it: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [838:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isImplicitlyTyped' @ [838:18] ==> private final fun isImplicitlyTyped(declaration: KtDeclaration): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'declaration' @ [838:36] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousDeclaration[ValueParameterDescriptorImpl]

'testLog' @ [840:13] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'logPresentation' @ [840:42] ==> public final fun logPresentation(element: PsiElement): String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [840:58] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [842:30] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousDeclaration[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [842:42] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [843:24] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousDeclaration[LocalVariableDescriptor]

'returnType' @ [843:35] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'type' @ [844:17] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousDeclaration[LocalVariableDescriptor]

'type' @ [844:33] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousDeclaration[LocalVariableDescriptor]

'containsTypeOrDerivedInside' @ [844:38] ==> private final fun KotlinType.containsTypeOrDerivedInside(type: FuzzyType): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'typeToSearch' @ [844:66] ==> private final val typeToSearch: FuzzyType defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'addCallableDeclarationOfOurType' @ [845:17] ==> private final fun addCallableDeclarationOfOurType(declaration: PsiElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'declaration' @ [845:49] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.processSuspiciousDeclaration[ValueParameterDescriptorImpl]

'scope' @ [851:9] ==> value-parameter scope: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearchInLambdas[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [851:15] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtFunction) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFunction

'it' @ [852:17] ==> value-parameter it: KtFunction defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearchInLambdas.<anonymous>[ValueParameterDescriptorImpl]

'nameIdentifier' @ [852:20] ==> public final val KtFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'usePlainSearch' @ [853:17] ==> private final fun usePlainSearch(scope: KtElement): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'it' @ [853:32] ==> value-parameter it: KtFunction defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearchInLambdas.<anonymous>[ValueParameterDescriptorImpl]

'runReadAction' @ [859:9] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'!' @ [860:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'scope' @ [860:18] ==> value-parameter scope: KtElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch[ValueParameterDescriptorImpl]

'isValid' @ [860:24] ==> public final val KtElement.isValid: Boolean[MyPropertyDescriptor]

'scope' @ [862:24] ==> value-parameter scope: KtElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch[ValueParameterDescriptorImpl]

'containingKtFile' @ [862:30] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'LocalSearchScope' @ [863:30] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'scope' @ [863:47] ==> value-parameter scope: KtElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch[ValueParameterDescriptorImpl]

'intersectWith' @ [863:54] ==> @NotNull public open fun intersectWith(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.LocalSearchScope[JavaMethodDescriptor]

'searchScope' @ [863:68] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'if (restricted is LocalSearchScope) {
                ScopeLoop@
                for (element in restricted.scope) {
                    val prevElements = scopesToUsePlainSearch.getOrPut(file) { ArrayList() }
                    for ((index, prevElement) in prevElements.withIndex()) {
                        if (!prevElement.isValid) continue@ScopeLoop
                        if (prevElement.isAncestor(element, strict = false)) continue@ScopeLoop
                        if (element.isAncestor(prevElement)) {
                            prevElements[index] = element
                            continue@ScopeLoop
                        }
                    }
                    prevElements.add(element)
                }
            }
            else {
                assert(restricted == GlobalSearchScope.EMPTY_SCOPE)
            }' @ [864:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'restricted' @ [864:17] ==> val restricted: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'restricted' @ [866:33] ==> val restricted: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'scope' @ [866:44] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'scopesToUsePlainSearch' @ [867:40] ==> private final val scopesToUsePlainSearch: LinkedHashMap<KtFile, ArrayList<PsiElement>> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[PropertyDescriptorImpl]

'getOrPut' @ [867:63] ==> public inline fun <K, V> MutableMap<KtFile, ArrayList<PsiElement>>.getOrPut(key: KtFile, defaultValue: () -> ArrayList<PsiElement>): ArrayList<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtFile
    <V> -> ArrayList<PsiElement>

'file' @ [867:72] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'ArrayList' @ [867:80] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'component1' @ [868:27] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [868:34] ==> public final operator fun component2(): PsiElement defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'prevElements' @ [868:50] ==> val prevElements: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'withIndex' @ [868:63] ==> public fun <T> Iterable<PsiElement>.withIndex(): Iterable<IndexedValue<PsiElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'!' @ [869:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'prevElement' @ [869:30] ==> val prevElement: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'isValid' @ [869:42] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'prevElement' @ [870:29] ==> val prevElement: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'isAncestor' @ [870:41] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [870:52] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'element' @ [871:29] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'isAncestor' @ [871:37] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'prevElement' @ [871:48] ==> val prevElement: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'prevElements' @ [872:29] ==> val prevElements: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'index' @ [872:42] ==> val index: Int defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'element' @ [872:51] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'prevElements' @ [876:21] ==> val prevElements: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'add' @ [876:34] ==> public open fun add(element: PsiElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [876:38] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'assert' @ [880:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'restricted' @ [880:24] ==> val restricted: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.usePlainSearch.<anonymous>[LocalVariableDescriptor]

'EMPTY_SCOPE' @ [880:56] ==> public final val EMPTY_SCOPE: (GlobalSearchScope..GlobalSearchScope?) defined in com.intellij.psi.search.GlobalSearchScope[JavaPropertyDescriptor]

'this' @ [888:22] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.mayTypeAffectAncestors[ReceiverParameterDescriptorImpl]

'parent' @ [888:27] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtBlockExpression -> {
                return this == parent.statements.last() && parent.mayTypeAffectAncestors()
            }

            is KtDeclarationWithBody -> {
                if (this == parent.bodyExpression) {
                    return !parent.hasBlockBody() && !parent.hasDeclaredReturnType()
                }
            }

            is KtContainerNode -> {
                val grandParent = parent.parent
                return when (parent.node.elementType) {
                    KtNodeTypes.CONDITION, KtNodeTypes.BODY -> false
                    KtNodeTypes.THEN, KtNodeTypes.ELSE -> (grandParent as KtExpression).mayTypeAffectAncestors()
                    KtNodeTypes.LOOP_RANGE, KtNodeTypes.INDICES -> true
                    else -> true // something else unknown
                }
            }
        }' @ [889:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [889:15] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.mayTypeAffectAncestors[LocalVariableDescriptor]

'this' @ [891:24] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.mayTypeAffectAncestors[ReceiverParameterDescriptorImpl]

'parent' @ [891:32] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.mayTypeAffectAncestors[LocalVariableDescriptor]

'statements' @ [891:39] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'last' @ [891:50] ==> public fun <T> List<(KtExpression..KtExpression?)>.last(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'parent' @ [891:60] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.mayTypeAffectAncestors[LocalVariableDescriptor]

'mayTypeAffectAncestors' @ [891:67] ==> private final fun KtExpression.mayTypeAffectAncestors(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'this' @ [895:21] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.mayTypeAffectAncestors[ReceiverParameterDescriptorImpl]

'parent' @ [895:29] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.mayTypeAffectAncestors[LocalVariableDescriptor]

'bodyExpression' @ [895:36] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [896:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [896:29] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.mayTypeAffectAncestors[LocalVariableDescriptor]

'hasBlockBody' @ [896:36] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'!' @ [896:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [896:55] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.mayTypeAffectAncestors[LocalVariableDescriptor]

'hasDeclaredReturnType' @ [896:62] ==> public abstract fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'parent' @ [901:35] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.mayTypeAffectAncestors[LocalVariableDescriptor]

'parent' @ [901:42] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent.node.elementType) {
                    KtNodeTypes.CONDITION, KtNodeTypes.BODY -> false
                    KtNodeTypes.THEN, KtNodeTypes.ELSE -> (grandParent as KtExpression).mayTypeAffectAncestors()
                    KtNodeTypes.LOOP_RANGE, KtNodeTypes.INDICES -> true
                    else -> true // something else unknown
                }' @ [902:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'parent' @ [902:30] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.mayTypeAffectAncestors[LocalVariableDescriptor]

'node' @ [902:37] ==> public final val KtContainerNode.node: ASTNode[MyPropertyDescriptor]

'elementType' @ [902:42] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'CONDITION' @ [903:33] ==> public final val CONDITION: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'BODY' @ [903:56] ==> public final val BODY: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'THEN' @ [904:33] ==> public final val THEN: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'ELSE' @ [904:51] ==> public final val ELSE: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'grandParent' @ [904:60] ==> val grandParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.mayTypeAffectAncestors[LocalVariableDescriptor]

'mayTypeAffectAncestors' @ [904:89] ==> private final fun KtExpression.mayTypeAffectAncestors(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'LOOP_RANGE' @ [905:33] ==> public final val LOOP_RANGE: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'INDICES' @ [905:57] ==> public final val INDICES: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'type' @ [914:16] ==> value-parameter type: FuzzyType defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.containsTypeOrDerivedInside[ValueParameterDescriptorImpl]

'checkIsSuperTypeOf' @ [914:21] ==> public final fun checkIsSuperTypeOf(otherType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedSimpleFunctionDescriptor]

'this' @ [914:40] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.containsTypeOrDerivedInside[ReceiverParameterDescriptorImpl]

'arguments' @ [914:57] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'any' @ [914:67] ==> public inline fun <T> Iterable<TypeProjection>.any(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'!' @ [914:73] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [914:74] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.containsTypeOrDerivedInside.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [914:77] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'it' @ [914:97] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.containsTypeOrDerivedInside.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [914:100] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'containsTypeOrDerivedInside' @ [914:105] ==> private final fun KotlinType.containsTypeOrDerivedInside(type: FuzzyType): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'type' @ [914:133] ==> value-parameter type: FuzzyType defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.containsTypeOrDerivedInside[ValueParameterDescriptorImpl]

'when (declaration) {
            is KtFunction -> !declaration.hasDeclaredReturnType()
            is KtVariableDeclaration -> declaration.typeReference == null
            is KtParameter -> declaration.typeReference == null
            else -> false
        }' @ [918:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'declaration' @ [918:22] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.isImplicitlyTyped[ValueParameterDescriptorImpl]

'!' @ [919:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [919:31] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.isImplicitlyTyped[ValueParameterDescriptorImpl]

'hasDeclaredReturnType' @ [919:43] ==> public abstract fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'declaration' @ [920:41] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.isImplicitlyTyped[ValueParameterDescriptorImpl]

'typeReference' @ [920:53] ==> public final var KtVariableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'declaration' @ [921:31] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.isImplicitlyTyped[ValueParameterDescriptorImpl]

'typeReference' @ [921:43] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'SearchParameters' @ [927:43] ==> public constructor SearchParameters(@NotNull p0: PsiElement, @NotNull p1: SearchScope, p2: Boolean) defined in com.intellij.psi.search.searches.ReferencesSearch.SearchParameters[JavaClassConstructorDescriptor]

'element' @ [927:60] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.searchReferences[ValueParameterDescriptorImpl]

'scope' @ [927:69] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.searchReferences[ValueParameterDescriptorImpl]

'searchReferences' @ [928:9] ==> private final fun searchReferences(parameters: ReferencesSearch.SearchParameters, processor: (PsiReference) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'parameters' @ [928:26] ==> val parameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.searchReferences[LocalVariableDescriptor]

'processor' @ [928:38] ==> value-parameter processor: (PsiReference) -> Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.searchReferences[ValueParameterDescriptorImpl]

'search' @ [932:26] ==> @NotNull public open fun search(@NotNull p0: ReferencesSearch.SearchParameters): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'parameters' @ [932:33] ==> value-parameter parameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.searchReferences[ValueParameterDescriptorImpl]

'forEach' @ [932:45] ==> public abstract fun forEach(@NotNull p0: Processor<(PsiReference..PsiReference?)>): Boolean defined in com.intellij.util.Query[JavaMethodDescriptor]

'Processor' @ [932:53] ==> public fun <T : (Any..Any?)> Processor(function: ((PsiReference..PsiReference?)) -> Boolean): Processor<(PsiReference..PsiReference?)> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'runReadAction' @ [933:13] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'if (ref.element.isValid) {
                    processor(ref)
                }
                else {
                    true
                }' @ [934:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'ref' @ [934:21] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.searchReferences.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [934:25] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'isValid' @ [934:33] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'invoke' @ [935:21] ==> public abstract operator fun invoke(p1: PsiReference): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'ref' @ [935:31] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.searchReferences.<anonymous>[ValueParameterDescriptorImpl]

