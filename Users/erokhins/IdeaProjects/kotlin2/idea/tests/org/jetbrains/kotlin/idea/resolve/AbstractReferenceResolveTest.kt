'KotlinLightPlatformCodeInsightFixtureTestCase' @ [35:47] ==> public constructor KotlinLightPlatformCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightPlatformCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'shouldBeUnresolved' @ [39:20] ==> private final val shouldBeUnresolved: Boolean? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.ExpectedResolveData[PropertyDescriptorImpl]

'assert' @ [44:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'path' @ [44:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doTest[ValueParameterDescriptorImpl]

'endsWith' @ [44:21] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'path' @ [44:40] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doTest[ValueParameterDescriptorImpl]

'myFixture' @ [45:9] ==> protected/*protected and package*/ final var myFixture: (CodeInsightTestFixture..CodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[JavaPropertyDescriptor]

'configureWithExtraFile' @ [45:19] ==> public fun CodeInsightTestFixture.configureWithExtraFile(path: String, vararg extraNameParts: String = ..., relativePaths: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.test in file ideaTestUtils.kt[SimpleFunctionDescriptorImpl]

'path' @ [45:42] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doTest[ValueParameterDescriptorImpl]

'performChecks' @ [46:9] ==> protected final fun performChecks(): Unit defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[SimpleFunctionDescriptorImpl]

'if (InTextDirectivesUtils.isDirectiveDefined(myFixture.file.text, MULTIRESOLVE)) {
            doMultiResolveTest()
        }
        else {
            doSingleResolveTest()
        }' @ [50:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isDirectiveDefined' @ [50:35] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'myFixture' @ [50:54] ==> protected/*protected and package*/ final var myFixture: (CodeInsightTestFixture..CodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[JavaPropertyDescriptor]

'file' @ [50:64] ==> public final val CodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'text' @ [50:69] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'MULTIRESOLVE' @ [50:75] ==> public final val MULTIRESOLVE: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion[PropertyDescriptorImpl]

'doMultiResolveTest' @ [51:13] ==> protected final fun doMultiResolveTest(): Unit defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[SimpleFunctionDescriptorImpl]

'doSingleResolveTest' @ [54:13] ==> protected final fun doSingleResolveTest(): Unit defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[SimpleFunctionDescriptorImpl]

'forEachCaret' @ [59:9] ==> private final fun forEachCaret(action: (index: Int, offset: Int) -> Unit): Unit defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[SimpleFunctionDescriptorImpl]

'readResolveData' @ [60:39] ==> public final fun readResolveData(fileText: String, index: Int, refMarkerText: String = ...): AbstractReferenceResolveTest.ExpectedResolveData defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion[SimpleFunctionDescriptorImpl]

'myFixture' @ [60:55] ==> protected/*protected and package*/ final var myFixture: (CodeInsightTestFixture..CodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[JavaPropertyDescriptor]

'file' @ [60:65] ==> public final val CodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'text' @ [60:70] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'index' @ [60:76] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doSingleResolveTest.<anonymous>[ValueParameterDescriptorImpl]

'refMarkerText' @ [60:83] ==> public open val refMarkerText: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[PropertyDescriptorImpl]

'wrapReference' @ [61:32] ==> public open fun wrapReference(reference: PsiReference?): PsiReference? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[SimpleFunctionDescriptorImpl]

'myFixture' @ [61:46] ==> protected/*protected and package*/ final var myFixture: (CodeInsightTestFixture..CodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[JavaPropertyDescriptor]

'file' @ [61:56] ==> public final val CodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'findReferenceAt' @ [61:61] ==> @Nullable @Contract public abstract fun findReferenceAt(p0: Int): PsiReference? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [61:77] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doSingleResolveTest.<anonymous>[ValueParameterDescriptorImpl]

'checkReferenceResolve' @ [62:13] ==> public final fun checkReferenceResolve(expectedResolveData: AbstractReferenceResolveTest.ExpectedResolveData, offset: Int, psiReference: PsiReference?, checkResolvedTo: (PsiElement) -> Unit = ...): Unit defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion[SimpleFunctionDescriptorImpl]

'expectedResolveData' @ [62:35] ==> val expectedResolveData: AbstractReferenceResolveTest.ExpectedResolveData defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doSingleResolveTest.<anonymous>[LocalVariableDescriptor]

'offset' @ [62:56] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doSingleResolveTest.<anonymous>[ValueParameterDescriptorImpl]

'psiReference' @ [62:64] ==> val psiReference: PsiReference? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doSingleResolveTest.<anonymous>[LocalVariableDescriptor]

'checkResolvedTo' @ [62:80] ==> public open fun checkResolvedTo(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[SimpleFunctionDescriptorImpl]

'it' @ [62:96] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doSingleResolveTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'reference' @ [70:71] ==> value-parameter reference: PsiReference? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.wrapReference[ValueParameterDescriptorImpl]

'reference' @ [71:91] ==> value-parameter reference: PsiPolyVariantReference defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.wrapReference[ValueParameterDescriptorImpl]

'forEachCaret' @ [74:9] ==> private final fun forEachCaret(action: (index: Int, offset: Int) -> Unit): Unit defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[SimpleFunctionDescriptorImpl]

'getExpectedReferences' @ [75:38] ==> private final fun getExpectedReferences(text: String, index: Int, refMarkerText: String): List<String> defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion[SimpleFunctionDescriptorImpl]

'myFixture' @ [75:60] ==> protected/*protected and package*/ final var myFixture: (CodeInsightTestFixture..CodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[JavaPropertyDescriptor]

'file' @ [75:70] ==> public final val CodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'text' @ [75:75] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'index' @ [75:81] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doMultiResolveTest.<anonymous>[ValueParameterDescriptorImpl]

'refMarkerText' @ [75:88] ==> public open val refMarkerText: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[PropertyDescriptorImpl]

'myFixture' @ [77:32] ==> protected/*protected and package*/ final var myFixture: (CodeInsightTestFixture..CodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[JavaPropertyDescriptor]

'file' @ [77:42] ==> public final val CodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'findReferenceAt' @ [77:47] ==> @Nullable @Contract public abstract fun findReferenceAt(p0: Int): PsiReference? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [77:63] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doMultiResolveTest.<anonymous>[ValueParameterDescriptorImpl]

'assertTrue' @ [78:13] ==> public open fun assertTrue(p0: Boolean): Unit defined in com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase[JavaMethodDescriptor]

'psiReference' @ [78:24] ==> val psiReference: PsiReference? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doMultiResolveTest.<anonymous>[LocalVariableDescriptor]

'psiReference' @ [79:13] ==> val psiReference: PsiReference? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doMultiResolveTest.<anonymous>[LocalVariableDescriptor]

'wrapReference' @ [81:27] ==> public open fun wrapReference(reference: PsiPolyVariantReference): PsiPolyVariantReference defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[SimpleFunctionDescriptorImpl]

'psiReference' @ [81:41] ==> val psiReference: PsiReference? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doMultiResolveTest.<anonymous>[LocalVariableDescriptor]

'multiResolve' @ [81:55] ==> @NotNull public abstract fun multiResolve(p0: Boolean): (Array<(ResolveResult..ResolveResult?)>..Array<out (ResolveResult..ResolveResult?)>) defined in com.intellij.psi.PsiPolyVariantReference[JavaMethodDescriptor]

'newArrayList' @ [83:42] ==> @GwtCompatible public open fun <E : (Any..Any?)> newArrayList(): (ArrayList<(String..String?)>..ArrayList<(String..String?)>?) defined in com.google.common.collect.Lists[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'results' @ [84:28] ==> val results: (Array<(ResolveResult..ResolveResult?)>..Array<out (ResolveResult..ResolveResult?)>) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doMultiResolveTest.<anonymous>[LocalVariableDescriptor]

'actualResolvedTo' @ [85:17] ==> val actualResolvedTo: (ArrayList<(String..String?)>..ArrayList<(String..String?)>?) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doMultiResolveTest.<anonymous>[LocalVariableDescriptor]

'add' @ [85:34] ==> public open fun add(element: (String..String?)): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'result' @ [85:38] ==> val result: (ResolveResult..ResolveResult?) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doMultiResolveTest.<anonymous>[LocalVariableDescriptor]

'element' @ [85:45] ==> public final val ResolveResult.element: PsiElement?[MyPropertyDescriptor]

'renderAsGotoImplementation' @ [85:55] ==> public fun PsiElement.renderAsGotoImplementation(): String defined in org.jetbrains.kotlin.test.util in file ReferenceUtils.kt[SimpleFunctionDescriptorImpl]

'assertOrderedEquals' @ [88:28] ==> public open fun <T : (Any..Any?)> assertOrderedEquals(p0: (String..String?), @NotNull p1: (MutableIterable<(String..String?)>..Iterable<(String..String?)>), @NotNull p2: (MutableCollection<out (String..String?)>..Collection<(String..String?)>)): Unit defined in com.intellij.testFramework.UsefulTestCase[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'index' @ [88:78] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doMultiResolveTest.<anonymous>[ValueParameterDescriptorImpl]

'actualResolvedTo' @ [88:86] ==> val actualResolvedTo: (ArrayList<(String..String?)>..ArrayList<(String..String?)>?) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doMultiResolveTest.<anonymous>[LocalVariableDescriptor]

'sorted' @ [88:103] ==> public fun <T : Comparable<(String..String?)>> Iterable<(String..String?)>.sorted(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> (kotlin.String..kotlin.String?)

'expectedReferences' @ [88:113] ==> val expectedReferences: List<String> defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.doMultiResolveTest.<anonymous>[LocalVariableDescriptor]

'sorted' @ [88:132] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'myFixture' @ [93:23] ==> protected/*protected and package*/ final var myFixture: (CodeInsightTestFixture..CodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest[JavaPropertyDescriptor]

'editor' @ [93:33] ==> public final val CodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'caretModel' @ [93:40] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'allCarets' @ [93:51] ==> public final val CaretModel.allCarets: (MutableList<(Caret..Caret?)>..List<(Caret..Caret?)>)[MyPropertyDescriptor]

'map' @ [93:61] ==> public inline fun <T, R> Iterable<(Caret..Caret?)>.map(transform: ((Caret..Caret?)) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.editor.Caret..com.intellij.openapi.editor.Caret?)
    <R> -> Int

'it' @ [93:67] ==> value-parameter it: (Caret..Caret?) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.forEachCaret.<anonymous>[ValueParameterDescriptorImpl]

'offset' @ [93:70] ==> public final val Caret.offset: Int[MyPropertyDescriptor]

'offsets' @ [94:27] ==> val offsets: List<Int> defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.forEachCaret[LocalVariableDescriptor]

'size' @ [94:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'component1' @ [95:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [95:22] ==> public final operator fun component2(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'offsets' @ [95:33] ==> val offsets: List<Int> defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.forEachCaret[LocalVariableDescriptor]

'withIndex' @ [95:41] ==> public fun <T> Iterable<Int>.withIndex(): Iterable<IndexedValue<Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'invoke' @ [96:13] ==> public abstract operator fun invoke(index: @ParameterName Int, offset: @ParameterName Int): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'if (singleCaret) -1 else index + 1' @ [96:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'singleCaret' @ [96:24] ==> val singleCaret: Boolean defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.forEachCaret[LocalVariableDescriptor]

'-' @ [96:37] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'index' @ [96:45] ==> val index: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.forEachCaret[LocalVariableDescriptor]

'offset' @ [96:56] ==> val offset: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.forEachCaret[LocalVariableDescriptor]

'INSTANCE' @ [100:114] ==> @NotNull public final val INSTANCE: KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaPropertyDescriptor]

'isDirectiveDefined' @ [111:60] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [111:79] ==> value-parameter fileText: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[ValueParameterDescriptorImpl]

'REF_EMPTY' @ [111:89] ==> public final val REF_EMPTY: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion[PropertyDescriptorImpl]

'getExpectedReferences' @ [112:24] ==> private final fun getExpectedReferences(text: String, index: Int, refMarkerText: String): List<String> defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion[SimpleFunctionDescriptorImpl]

'fileText' @ [112:46] ==> value-parameter fileText: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[ValueParameterDescriptorImpl]

'index' @ [112:56] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[ValueParameterDescriptorImpl]

'refMarkerText' @ [112:63] ==> value-parameter refMarkerText: String = ... defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[ValueParameterDescriptorImpl]

'if (shouldBeUnresolved) {
                Assert.assertTrue("REF: directives will be ignored for $REF_EMPTY test: $refs", refs.isEmpty())
                referenceToString = "<empty>"
            }
            else {
                assertTrue(refs.size == 1, "Must be a single ref: $refs.\nUse $MULTIRESOLVE if you need multiple refs\nUse $REF_EMPTY for an unresolved reference")
                referenceToString = refs.get(0)
                Assert.assertNotNull("Test data wasn't found, use \"// REF: \" directive", referenceToString)
            }' @ [115:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'shouldBeUnresolved' @ [115:17] ==> val shouldBeUnresolved: Boolean defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[LocalVariableDescriptor]

'assertTrue' @ [116:24] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'REF_EMPTY' @ [116:73] ==> public final val REF_EMPTY: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion[PropertyDescriptorImpl]

'refs' @ [116:90] ==> val refs: List<String> defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[LocalVariableDescriptor]

'refs' @ [116:97] ==> val refs: List<String> defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[LocalVariableDescriptor]

'isEmpty' @ [116:102] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'referenceToString' @ [117:17] ==> val referenceToString: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[LocalVariableDescriptor]

'assertTrue' @ [120:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'refs' @ [120:28] ==> val refs: List<String> defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[LocalVariableDescriptor]

'size' @ [120:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'refs' @ [120:68] ==> val refs: List<String> defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[LocalVariableDescriptor]

'MULTIRESOLVE' @ [120:80] ==> public final val MULTIRESOLVE: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion[PropertyDescriptorImpl]

'REF_EMPTY' @ [120:125] ==> public final val REF_EMPTY: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion[PropertyDescriptorImpl]

'referenceToString' @ [121:17] ==> val referenceToString: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[LocalVariableDescriptor]

'refs' @ [121:37] ==> val refs: List<String> defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[LocalVariableDescriptor]

'get' @ [121:42] ==> public abstract operator fun get(index: Int): String defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'assertNotNull' @ [122:24] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'referenceToString' @ [122:92] ==> val referenceToString: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[LocalVariableDescriptor]

'ExpectedResolveData' @ [125:20] ==> public constructor ExpectedResolveData(shouldBeUnresolved: Boolean?, referenceString: String) defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.ExpectedResolveData[ClassConstructorDescriptorImpl]

'shouldBeUnresolved' @ [125:40] ==> val shouldBeUnresolved: Boolean defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[LocalVariableDescriptor]

'referenceToString' @ [125:60] ==> val referenceToString: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.readResolveData[LocalVariableDescriptor]

'if (index > 0) "// $refMarkerText$index:" else "// $refMarkerText:"' @ [131:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [131:30] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.getExpectedReferences[ValueParameterDescriptorImpl]

'refMarkerText' @ [131:46] ==> value-parameter refMarkerText: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.getExpectedReferences[ValueParameterDescriptorImpl]

'index' @ [131:60] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.getExpectedReferences[ValueParameterDescriptorImpl]

'refMarkerText' @ [131:78] ==> value-parameter refMarkerText: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.getExpectedReferences[ValueParameterDescriptorImpl]

'findLinesWithPrefixesRemoved' @ [132:42] ==> @NotNull public open fun findLinesWithPrefixesRemoved(p0: (String..String?), vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'text' @ [132:71] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.getExpectedReferences[ValueParameterDescriptorImpl]

'prefix' @ [132:77] ==> val prefix: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.getExpectedReferences[LocalVariableDescriptor]

'expectedResolveData' @ [136:34] ==> value-parameter expectedResolveData: AbstractReferenceResolveTest.ExpectedResolveData defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[ValueParameterDescriptorImpl]

'referenceString' @ [136:54] ==> public final val referenceString: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.ExpectedResolveData[PropertyDescriptorImpl]

'if (psiReference != null) {
                val resolvedTo = psiReference.resolve()
                if (resolvedTo != null) {
                    checkResolvedTo(resolvedTo)
                    val resolvedToElementStr = replacePlaceholders(resolvedTo.renderAsGotoImplementation())
                    assertEquals("Found reference to '$resolvedToElementStr', but '$expectedString' was expected", expectedString, resolvedToElementStr)
                }
                else {
                    if (!expectedResolveData.shouldBeUnresolved()) {
                        assertNull("Element $psiReference (${psiReference.element.text}) wasn't resolved to anything, but $expectedString was expected", expectedString)
                    }
                }
            }
            else {
                assertNull("No reference found at offset: $offset, but one resolved to $expectedString was expected", expectedString)
            }' @ [137:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'psiReference' @ [137:17] ==> value-parameter psiReference: PsiReference? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[ValueParameterDescriptorImpl]

'psiReference' @ [138:34] ==> value-parameter psiReference: PsiReference? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[ValueParameterDescriptorImpl]

'resolve' @ [138:47] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'if (resolvedTo != null) {
                    checkResolvedTo(resolvedTo)
                    val resolvedToElementStr = replacePlaceholders(resolvedTo.renderAsGotoImplementation())
                    assertEquals("Found reference to '$resolvedToElementStr', but '$expectedString' was expected", expectedString, resolvedToElementStr)
                }
                else {
                    if (!expectedResolveData.shouldBeUnresolved()) {
                        assertNull("Element $psiReference (${psiReference.element.text}) wasn't resolved to anything, but $expectedString was expected", expectedString)
                    }
                }' @ [139:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'resolvedTo' @ [139:21] ==> val resolvedTo: PsiElement? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[LocalVariableDescriptor]

'invoke' @ [140:21] ==> public abstract operator fun invoke(p1: PsiElement): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'resolvedTo' @ [140:37] ==> val resolvedTo: PsiElement? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[LocalVariableDescriptor]

'replacePlaceholders' @ [141:48] ==> private final fun replacePlaceholders(actualString: String): String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion[SimpleFunctionDescriptorImpl]

'resolvedTo' @ [141:68] ==> val resolvedTo: PsiElement? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[LocalVariableDescriptor]

'renderAsGotoImplementation' @ [141:79] ==> public fun PsiElement.renderAsGotoImplementation(): String defined in org.jetbrains.kotlin.test.util in file ReferenceUtils.kt[SimpleFunctionDescriptorImpl]

'assertEquals' @ [142:21] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase[JavaMethodDescriptor]

'resolvedToElementStr' @ [142:56] ==> val resolvedToElementStr: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[LocalVariableDescriptor]

'expectedString' @ [142:85] ==> val expectedString: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[LocalVariableDescriptor]

'expectedString' @ [142:116] ==> val expectedString: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[LocalVariableDescriptor]

'resolvedToElementStr' @ [142:132] ==> val resolvedToElementStr: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[LocalVariableDescriptor]

'!' @ [145:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expectedResolveData' @ [145:26] ==> value-parameter expectedResolveData: AbstractReferenceResolveTest.ExpectedResolveData defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[ValueParameterDescriptorImpl]

'shouldBeUnresolved' @ [145:46] ==> public final fun shouldBeUnresolved(): Boolean defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.ExpectedResolveData[SimpleFunctionDescriptorImpl]

'assertNull' @ [146:25] ==> public open fun assertNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase[JavaMethodDescriptor]

'psiReference' @ [146:46] ==> value-parameter psiReference: PsiReference? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[ValueParameterDescriptorImpl]

'psiReference' @ [146:62] ==> value-parameter psiReference: PsiReference? defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[ValueParameterDescriptorImpl]

'element' @ [146:75] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'text' @ [146:83] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'expectedString' @ [146:124] ==> val expectedString: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[LocalVariableDescriptor]

'expectedString' @ [146:154] ==> val expectedString: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[LocalVariableDescriptor]

'assertNull' @ [151:17] ==> public open fun assertNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase[JavaMethodDescriptor]

'offset' @ [151:60] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[ValueParameterDescriptorImpl]

'expectedString' @ [151:89] ==> val expectedString: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[LocalVariableDescriptor]

'expectedString' @ [151:119] ==> val expectedString: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.checkReferenceResolve[LocalVariableDescriptor]

'toSystemIndependentName' @ [156:37] ==> @Contract public open fun toSystemIndependentName(@Nullable p0: String?): (String..String?) defined in com.intellij.util.PathUtil[JavaMethodDescriptor]

'actualString' @ [156:61] ==> value-parameter actualString: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.replacePlaceholders[ValueParameterDescriptorImpl]

'replace' @ [157:22] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'TEST_DATA_PROJECT_RELATIVE' @ [157:49] ==> public const final val TEST_DATA_PROJECT_RELATIVE: String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaPropertyDescriptor]

'replace' @ [158:22] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'in' @ [159:17] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replaced' @ [159:25] ==> val replaced: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.replacePlaceholders[LocalVariableDescriptor]

'replaced' @ [160:24] ==> val replaced: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.replacePlaceholders[LocalVariableDescriptor]

'replace' @ [160:33] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replaced' @ [160:41] ==> val replaced: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.replacePlaceholders[LocalVariableDescriptor]

'substringBefore' @ [160:50] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replaced' @ [162:20] ==> val replaced: String defined in org.jetbrains.kotlin.idea.resolve.AbstractReferenceResolveTest.Companion.replacePlaceholders[LocalVariableDescriptor]

