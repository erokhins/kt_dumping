'LightCodeInsightFixtureTestCase' @ [26:50] ==> protected/*protected and package*/ constructor LightCodeInsightFixtureTestCase() defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaClassConstructorDescriptor]

'myFixture' @ [28:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest[JavaPropertyDescriptor]

'configureByFile' @ [28:19] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'testDataPath' @ [28:35] ==> value-parameter testDataPath: String defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest.doTest[ValueParameterDescriptorImpl]

'invoke' @ [29:32] ==> public open fun invoke(@NotNull p0: Project, @NotNull p1: Editor, p2: (PsiFile..PsiFile?)): Unit defined in com.intellij.codeInsight.highlighting.HighlightUsagesHandler[JavaMethodDescriptor]

'myFixture' @ [29:39] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest[JavaPropertyDescriptor]

'project' @ [29:49] ==> public final val JavaCodeInsightTestFixture.project: (Project..Project?)[MyPropertyDescriptor]

'myFixture' @ [29:58] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest[JavaPropertyDescriptor]

'editor' @ [29:68] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'myFixture' @ [29:76] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest[JavaPropertyDescriptor]

'file' @ [29:86] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'myFixture' @ [31:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest[JavaPropertyDescriptor]

'file' @ [31:30] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'text' @ [31:35] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'findLinesWithPrefixesRemoved' @ [32:61] ==> @NotNull public open fun findLinesWithPrefixesRemoved(p0: (String..String?), vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'text' @ [32:90] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest.doTest[LocalVariableDescriptor]

'getInstance' @ [33:63] ==> public open fun getInstance(): (EditorColorsManager..EditorColorsManager?) defined in com.intellij.openapi.editor.colors.EditorColorsManager[JavaMethodDescriptor]

'globalScheme' @ [33:77] ==> public final var EditorColorsManager.globalScheme: EditorColorsScheme[MyPropertyDescriptor]

'getAttributes' @ [33:90] ==> public abstract fun getAttributes(p0: (TextAttributesKey..TextAttributesKey?)): (TextAttributes..TextAttributes?) defined in com.intellij.openapi.editor.colors.EditorColorsScheme[JavaMethodDescriptor]

'SEARCH_RESULT_ATTRIBUTES' @ [33:117] ==> public final val SEARCH_RESULT_ATTRIBUTES: (TextAttributesKey..TextAttributesKey?) defined in com.intellij.openapi.editor.colors.EditorColors[JavaPropertyDescriptor]

'myFixture' @ [34:28] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest[JavaPropertyDescriptor]

'editor' @ [34:38] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'markupModel' @ [34:45] ==> public final val Editor.markupModel: MarkupModel[MyPropertyDescriptor]

'allHighlighters' @ [34:57] ==> public final val MarkupModel.allHighlighters: (Array<(RangeHighlighter..RangeHighlighter?)>..Array<out (RangeHighlighter..RangeHighlighter?)>)[MyPropertyDescriptor]

'filter' @ [35:18] ==> public inline fun <T> Array<out (RangeHighlighter..RangeHighlighter?)>.filter(predicate: ((RangeHighlighter..RangeHighlighter?)) -> Boolean): List<(RangeHighlighter..RangeHighlighter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.editor.markup.RangeHighlighter..com.intellij.openapi.editor.markup.RangeHighlighter?)

'it' @ [35:27] ==> value-parameter it: (RangeHighlighter..RangeHighlighter?) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'textAttributes' @ [35:30] ==> public final val RangeHighlighter.textAttributes: TextAttributes?[MyPropertyDescriptor]

'searchResultsTextAttributes' @ [35:48] ==> val searchResultsTextAttributes: (TextAttributes..TextAttributes?) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest.doTest[LocalVariableDescriptor]

'highlighters' @ [36:22] ==> val highlighters: List<(RangeHighlighter..RangeHighlighter?)> defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest.doTest[LocalVariableDescriptor]

'map' @ [36:35] ==> public inline fun <T, R> Iterable<(RangeHighlighter..RangeHighlighter?)>.map(transform: ((RangeHighlighter..RangeHighlighter?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.editor.markup.RangeHighlighter..com.intellij.openapi.editor.markup.RangeHighlighter?)
    <R> -> String

'text' @ [36:41] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest.doTest[LocalVariableDescriptor]

'substring' @ [36:46] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [36:56] ==> value-parameter it: (RangeHighlighter..RangeHighlighter?) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [36:59] ==> public final val RangeHighlighter.startOffset: Int[MyPropertyDescriptor]

'it' @ [36:72] ==> value-parameter it: (RangeHighlighter..RangeHighlighter?) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'endOffset' @ [36:75] ==> public final val RangeHighlighter.endOffset: Int[MyPropertyDescriptor]

'assertEquals' @ [37:9] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'expectedToBeHighlighted' @ [37:22] ==> val expectedToBeHighlighted: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest.doTest[LocalVariableDescriptor]

'actual' @ [37:47] ==> val actual: List<String> defined in org.jetbrains.kotlin.idea.highlighter.AbstractHighlightExitPointsTest.doTest[LocalVariableDescriptor]

