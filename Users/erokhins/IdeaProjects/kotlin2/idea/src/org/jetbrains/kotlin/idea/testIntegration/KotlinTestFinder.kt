'JavaTestFinder' @ [43:26] ==> public constructor JavaTestFinder() defined in com.intellij.testIntegration.JavaTestFinder[JavaClassConstructorDescriptor]

'super' @ [45:9] ==> <this> defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder[LazyClassReceiverParameterDescriptor]

'findSourceElement' @ [45:15] ==> public open fun findSourceElement(@NotNull p0: PsiElement): PsiClass? defined in com.intellij.testIntegration.JavaTestFinder[JavaMethodDescriptor]

'from' @ [45:33] ==> value-parameter from: PsiElement defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findSourceElement[ValueParameterDescriptorImpl]

'let' @ [45:40] ==> @InlineOnly public inline fun <T, R> PsiClass.let(block: (PsiClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> Nothing

'it' @ [45:53] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findSourceElement.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [47:9] ==> value-parameter from: PsiElement defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findSourceElement[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [47:14] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filterIsInstance' @ [47:30] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtClassOrObject> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassOrObject

'firstOrNull' @ [47:66] ==> public inline fun <T> Sequence<KtClassOrObject>.firstOrNull(predicate: (KtClassOrObject) -> Boolean): KtClassOrObject? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'!' @ [47:80] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [47:81] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findSourceElement.<anonymous>[ValueParameterDescriptorImpl]

'isLocal' @ [47:84] ==> public final val KtClassOrObject.isLocal: Boolean[MyPropertyDescriptor]

'let' @ [47:95] ==> @InlineOnly public inline fun <T, R> KtClassOrObject.let(block: (KtClassOrObject) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R> -> Nothing

'if (it.resolveToDescriptorIfAny() == null) null else it.toLightClass()' @ [48:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiClass?, elseBranch: PsiClass?): PsiClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiClass?

'it' @ [48:24] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findSourceElement.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [48:27] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'it' @ [48:73] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findSourceElement.<anonymous>[ValueParameterDescriptorImpl]

'toLightClass' @ [48:76] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'from' @ [51:17] ==> value-parameter from: PsiElement defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findSourceElement[ValueParameterDescriptorImpl]

'containingFile' @ [51:22] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'findFacadeClass' @ [51:50] ==> public fun KtFile.findFacadeClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'findSourceElement' @ [55:29] ==> public open fun findSourceElement(from: PsiElement): PsiClass? defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder[SimpleFunctionDescriptorImpl]

'element' @ [55:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.isTest[ValueParameterDescriptorImpl]

'super' @ [56:16] ==> <this> defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder[LazyClassReceiverParameterDescriptor]

'isTest' @ [56:22] ==> public open fun isTest(@NotNull p0: PsiElement): Boolean defined in com.intellij.testIntegration.JavaTestFinder[JavaMethodDescriptor]

'sourceElement' @ [56:29] ==> val sourceElement: PsiClass defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.isTest[LocalVariableDescriptor]

'findSourceElement' @ [60:21] ==> public open fun findSourceElement(from: PsiElement): PsiClass? defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder[SimpleFunctionDescriptorImpl]

'element' @ [60:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[ValueParameterDescriptorImpl]

'emptySet' @ [60:58] ==> public fun <T> emptySet(): Set<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getSearchScope' @ [62:21] ==> protected/*protected and package*/ open fun getSearchScope(p0: (PsiElement..PsiElement?), p1: Boolean): (GlobalSearchScope..GlobalSearchScope?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder[JavaMethodDescriptor]

'element' @ [62:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[ValueParameterDescriptorImpl]

'getInstance' @ [64:40] ==> public open fun getInstance(p0: (Project..Project?)): (PsiShortNamesCache..PsiShortNamesCache?) defined in com.intellij.psi.search.PsiShortNamesCache[JavaMethodDescriptor]

'element' @ [64:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[ValueParameterDescriptorImpl]

'project' @ [64:60] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getInstance' @ [66:41] ==> public open fun getInstance(): (TestFrameworks..TestFrameworks?) defined in com.intellij.codeInsight.TestFrameworks[JavaMethodDescriptor]

'ArrayList' @ [67:34] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<out PsiNamedElement, Int>

'iterator' @ [68:41] ==> public abstract fun iterator(): MutableIterator<(Pair<(String..String?), (Int..Int?)>..Pair<(String..String?), (Int..Int?)>?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'collectPossibleClassNamesWithWeights' @ [68:58] ==> public open fun collectPossibleClassNamesWithWeights(p0: (String..String?)): (MutableList<(Pair<(String..String?), (Int..Int?)>..Pair<(String..String?), (Int..Int?)>?)>..List<(Pair<(String..String?), (Int..Int?)>..Pair<(String..String?), (Int..Int?)>?)>?) defined in com.intellij.testIntegration.TestFinderHelper[JavaMethodDescriptor]

'klass' @ [68:95] ==> val klass: PsiClass defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'name' @ [68:101] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'cache' @ [69:31] ==> val cache: (PsiShortNamesCache..PsiShortNamesCache?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'getClassesByName' @ [69:37] ==> @NotNull public abstract fun getClassesByName(@NotNull @NonNls p0: String, @NotNull p1: GlobalSearchScope): (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>) defined in com.intellij.psi.search.PsiShortNamesCache[JavaMethodDescriptor]

'candidateNameWithWeight' @ [69:54] ==> val candidateNameWithWeight: (Pair<(String..String?), (Int..Int?)>..Pair<(String..String?), (Int..Int?)>?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'first' @ [69:78] ==> public final val first: (String..String?) defined in com.intellij.openapi.util.Pair[JavaPropertyDescriptor]

'scope' @ [69:85] ==> val scope: (GlobalSearchScope..GlobalSearchScope?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'eachClass' @ [70:21] ==> val eachClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'isAnnotationType' @ [70:31] ==> public final val PsiClass.isAnnotationType: Boolean[MyPropertyDescriptor]

'frameworks' @ [70:51] ==> val frameworks: (TestFrameworks..TestFrameworks?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'isTestClass' @ [70:62] ==> public abstract fun isTestClass(p0: (PsiClass..PsiClass?)): Boolean defined in com.intellij.codeInsight.TestFrameworks[JavaMethodDescriptor]

'eachClass' @ [70:74] ==> val eachClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'if (eachClass is KtLightClassForFacade) {
                    eachClass.files.mapTo(classesWithWeights) { Pair.create(it, candidateNameWithWeight.second) }
                }
                else if (eachClass.isPhysical || eachClass is KtLightClassForSourceDeclaration) {
                    classesWithWeights.add(Pair.create(eachClass, candidateNameWithWeight.second))
                }' @ [72:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'eachClass' @ [72:21] ==> val eachClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'eachClass' @ [73:21] ==> val eachClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'files' @ [73:31] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[DeserializedPropertyDescriptor]

'mapTo' @ [73:37] ==> public inline fun <T, R, C : MutableCollection<in Pair<KtFile, Int>>> Iterable<KtFile>.mapTo(destination: ArrayList<Pair<out PsiNamedElement, Int>>, transform: (KtFile) -> Pair<KtFile, Int>): ArrayList<Pair<out PsiNamedElement, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> Pair<KtFile, Int>
    <C : MutableCollection<in R>> -> ArrayList<Pair<out PsiNamedElement, Int>>

'classesWithWeights' @ [73:43] ==> val classesWithWeights: ArrayList<Pair<out PsiNamedElement, Int>> defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'create' @ [73:70] ==> @NotNull public open fun <A : (Any..Any?), B : (Any..Any?)> create(p0: (KtFile..KtFile?), p1: (Int..Int?)): Pair<(KtFile..KtFile?), (Int..Int?)> defined in com.intellij.openapi.util.Pair[JavaMethodDescriptor]
Inferred types:
    <A : (Any..Any?)> -> KtFile
    <B : (Any..Any?)> -> Int

'it' @ [73:77] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest.<anonymous>[ValueParameterDescriptorImpl]

'candidateNameWithWeight' @ [73:81] ==> val candidateNameWithWeight: (Pair<(String..String?), (Int..Int?)>..Pair<(String..String?), (Int..Int?)>?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'second' @ [73:105] ==> public final val second: (Int..Int?) defined in com.intellij.openapi.util.Pair[JavaPropertyDescriptor]

'eachClass' @ [75:26] ==> val eachClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'isPhysical' @ [75:36] ==> public final val PsiClass.isPhysical: Boolean[MyPropertyDescriptor]

'eachClass' @ [75:50] ==> val eachClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'classesWithWeights' @ [76:21] ==> val classesWithWeights: ArrayList<Pair<out PsiNamedElement, Int>> defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'add' @ [76:40] ==> public open fun add(element: Pair<out PsiNamedElement, Int>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'create' @ [76:49] ==> @NotNull public open fun <A : (Any..Any?), B : (Any..Any?)> create(p0: (PsiClass..PsiClass?), p1: (Int..Int?)): Pair<(PsiClass..PsiClass?), (Int..Int?)> defined in com.intellij.openapi.util.Pair[JavaMethodDescriptor]
Inferred types:
    <A : (Any..Any?)> -> PsiClass
    <B : (Any..Any?)> -> Int

'eachClass' @ [76:56] ==> val eachClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'candidateNameWithWeight' @ [76:67] ==> val candidateNameWithWeight: (Pair<(String..String?), (Int..Int?)>..Pair<(String..String?), (Int..Int?)>?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'second' @ [76:91] ==> public final val second: (Int..Int?) defined in com.intellij.openapi.util.Pair[JavaPropertyDescriptor]

'getSortedElements' @ [81:33] ==> public open fun getSortedElements(p0: (MutableList<(Pair<out (PsiNamedElement..PsiNamedElement?), (Int..Int?)>..Pair<out (PsiNamedElement..PsiNamedElement?), (Int..Int?)>?)>..List<(Pair<out (PsiNamedElement..PsiNamedElement?), (Int..Int?)>..Pair<out (PsiNamedElement..PsiNamedElement?), (Int..Int?)>?)>?), p1: Boolean): (MutableList<(PsiElement..PsiElement?)>..List<(PsiElement..PsiElement?)>?) defined in com.intellij.testIntegration.TestFinderHelper[JavaMethodDescriptor]

'classesWithWeights' @ [81:51] ==> val classesWithWeights: ArrayList<Pair<out PsiNamedElement, Int>> defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findClassesForTest[LocalVariableDescriptor]

'findSourceElement' @ [85:21] ==> public open fun findSourceElement(from: PsiElement): PsiClass? defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder[SimpleFunctionDescriptorImpl]

'element' @ [85:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[ValueParameterDescriptorImpl]

'emptySet' @ [85:58] ==> public fun <T> emptySet(): Set<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'ArrayList' @ [87:38] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<out PsiNamedElement, Int>

'CollectProcessor' @ [88:42] ==> public constructor CollectProcessor<T : (Any..Any?)>(@NotNull p0: (MutableCollection<(Pair<out PsiNamedElement, Int>..Pair<out PsiNamedElement, Int>?)>..Collection<(Pair<out PsiNamedElement, Int>..Pair<out PsiNamedElement, Int>?)>)) defined in com.intellij.util.CommonProcessors.CollectProcessor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Pair<out PsiNamedElement, Int>

'classesWithProximities' @ [88:59] ==> val classesWithProximities: ArrayList<Pair<out PsiNamedElement, Int>> defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'klass' @ [90:25] ==> val klass: PsiClass defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'name' @ [90:31] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'compile' @ [91:31] ==> public open fun compile(p0: (String..String?), p1: Int): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'+' @ [91:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'escapeToRegexp' @ [91:57] ==> @NotNull @Contract public open fun escapeToRegexp(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'klassName' @ [91:72] ==> val klassName: String defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'CASE_INSENSITIVE' @ [91:99] ==> public const final val CASE_INSENSITIVE: Int defined in java.util.regex.Pattern[JavaPropertyDescriptor]

'getSearchScope' @ [93:21] ==> protected/*protected and package*/ open fun getSearchScope(p0: (PsiElement..PsiElement?), p1: Boolean): (GlobalSearchScope..GlobalSearchScope?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder[JavaMethodDescriptor]

'klass' @ [93:36] ==> val klass: PsiClass defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'getInstance' @ [94:41] ==> public open fun getInstance(): (TestFrameworks..TestFrameworks?) defined in com.intellij.codeInsight.TestFrameworks[JavaMethodDescriptor]

'getInstance' @ [96:40] ==> public open fun getInstance(p0: (Project..Project?)): (PsiShortNamesCache..PsiShortNamesCache?) defined in com.intellij.psi.search.PsiShortNamesCache[JavaMethodDescriptor]

'klass' @ [96:52] ==> val klass: PsiClass defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'project' @ [96:58] ==> public final val PsiClass.project: Project[MyPropertyDescriptor]

'HashSet' @ [97:21] ==> public constructor HashSet<E : (Any..Any?)>() defined in com.intellij.util.containers.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'cache' @ [98:9] ==> val cache: (PsiShortNamesCache..PsiShortNamesCache?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'getAllClassNames' @ [98:15] ==> public abstract fun getAllClassNames(@NotNull p0: HashSet<(String..String?)>): Unit defined in com.intellij.psi.search.PsiShortNamesCache[JavaMethodDescriptor]

'names' @ [98:32] ==> val names: HashSet<String> defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'names' @ [100:31] ==> val names: HashSet<String> defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'!' @ [101:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'pattern' @ [101:18] ==> val pattern: (Pattern..Pattern?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'matcher' @ [101:26] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'candidateName' @ [101:34] ==> val candidateName: (String..String?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'matches' @ [101:49] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'cache' @ [102:36] ==> val cache: (PsiShortNamesCache..PsiShortNamesCache?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'getClassesByName' @ [102:42] ==> @NotNull public abstract fun getClassesByName(@NotNull @NonNls p0: String, @NotNull p1: GlobalSearchScope): (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>) defined in com.intellij.psi.search.PsiShortNamesCache[JavaMethodDescriptor]

'candidateName' @ [102:59] ==> val candidateName: (String..String?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'scope' @ [102:74] ==> val scope: (GlobalSearchScope..GlobalSearchScope?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'!' @ [103:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'frameworks' @ [103:23] ==> val frameworks: (TestFrameworks..TestFrameworks?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'isTestClass' @ [103:34] ==> public abstract fun isTestClass(p0: (PsiClass..PsiClass?)): Boolean defined in com.intellij.codeInsight.TestFrameworks[JavaMethodDescriptor]

'candidateClass' @ [103:46] ==> val candidateClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'frameworks' @ [103:65] ==> val frameworks: (TestFrameworks..TestFrameworks?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'isPotentialTestClass' @ [103:76] ==> public abstract fun isPotentialTestClass(p0: (PsiClass..PsiClass?)): Boolean defined in com.intellij.codeInsight.TestFrameworks[JavaMethodDescriptor]

'candidateClass' @ [103:97] ==> val candidateClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'!' @ [104:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'candidateClass' @ [104:22] ==> val candidateClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'isPhysical' @ [104:37] ==> public final val PsiClass.isPhysical: Boolean[MyPropertyDescriptor]

'candidateClass' @ [104:51] ==> val candidateClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'processor' @ [105:17] ==> val processor: CommonProcessors.CollectProcessor<Pair<out PsiNamedElement, Int>> defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'process' @ [105:27] ==> public open fun process(p0: (Pair<out PsiNamedElement, Int>..Pair<out PsiNamedElement, Int>?)): Boolean defined in com.intellij.util.CommonProcessors.CollectProcessor[JavaMethodDescriptor]

'create' @ [105:40] ==> @NotNull public open fun <A : (Any..Any?), B : (Any..Any?)> create(p0: (PsiClass..PsiClass?), p1: (Int..Int?)): Pair<(PsiClass..PsiClass?), (Int..Int?)> defined in com.intellij.openapi.util.Pair[JavaMethodDescriptor]
Inferred types:
    <A : (Any..Any?)> -> PsiClass
    <B : (Any..Any?)> -> Int

'candidateClass' @ [105:47] ==> val candidateClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'calcTestNameProximity' @ [105:80] ==> public open fun calcTestNameProximity(p0: (String..String?), p1: (String..String?)): (Int..Int?) defined in com.intellij.testIntegration.TestFinderHelper[JavaMethodDescriptor]

'klassName' @ [105:102] ==> val klassName: String defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'candidateName' @ [105:113] ==> val candidateName: (String..String?) defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

'getSortedElements' @ [109:33] ==> public open fun getSortedElements(p0: (MutableList<(Pair<out (PsiNamedElement..PsiNamedElement?), (Int..Int?)>..Pair<out (PsiNamedElement..PsiNamedElement?), (Int..Int?)>?)>..List<(Pair<out (PsiNamedElement..PsiNamedElement?), (Int..Int?)>..Pair<out (PsiNamedElement..PsiNamedElement?), (Int..Int?)>?)>?), p1: Boolean): (MutableList<(PsiElement..PsiElement?)>..List<(PsiElement..PsiElement?)>?) defined in com.intellij.testIntegration.TestFinderHelper[JavaMethodDescriptor]

'classesWithProximities' @ [109:51] ==> val classesWithProximities: ArrayList<Pair<out PsiNamedElement, Int>> defined in org.jetbrains.kotlin.idea.testIntegration.KotlinTestFinder.findTestsForClass[LocalVariableDescriptor]

