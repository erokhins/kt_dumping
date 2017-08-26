'LightCodeInsightFixtureTestCase' @ [27:58] ==> protected/*protected and package*/ constructor LightCodeInsightFixtureTestCase() defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaClassConstructorDescriptor]

'super' @ [30:9] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [30:15] ==> protected/*protected and package*/ open fun setUp(): Unit defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'invalidateLibraryCache' @ [31:9] ==> public fun invalidateLibraryCache(project: Project): Unit defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [31:32] ==> protected/*protected and package*/ for synthetic extension final val AbstractSelectExpressionForDebuggerTest.project: (Project..Project?)[MyPropertyDescriptor]

'doTest' @ [35:9] ==> public final fun doTest(path: String, allowMethodCalls: Boolean): Unit defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest[SimpleFunctionDescriptorImpl]

'path' @ [35:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest.doTest[ValueParameterDescriptorImpl]

'doTest' @ [39:9] ==> public final fun doTest(path: String, allowMethodCalls: Boolean): Unit defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest[SimpleFunctionDescriptorImpl]

'path' @ [39:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest.doTestWoMethodCalls[ValueParameterDescriptorImpl]

'myFixture' @ [43:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest[JavaPropertyDescriptor]

'configureByFile' @ [43:19] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'path' @ [43:35] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest.doTest[ValueParameterDescriptorImpl]

'myFixture' @ [45:25] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest[JavaPropertyDescriptor]

'file' @ [45:35] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'findElementAt' @ [45:41] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'myFixture' @ [45:55] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest[JavaPropertyDescriptor]

'caretOffset' @ [45:65] ==> public final val JavaCodeInsightTestFixture.caretOffset: Int[MyPropertyDescriptor]

'KotlinEditorTextProvider' @ [46:34] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.KotlinEditorTextProvider[FakeCallableDescriptorForObject]

'findExpressionInner' @ [46:59] ==> public final fun findExpressionInner(element: PsiElement, allowMethodCalls: Boolean): KtExpression? defined in org.jetbrains.kotlin.idea.debugger.KotlinEditorTextProvider.Companion[DeserializedSimpleFunctionDescriptor]

'elementAt' @ [46:79] ==> val elementAt: PsiElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest.doTest[LocalVariableDescriptor]

'allowMethodCalls' @ [46:90] ==> value-parameter allowMethodCalls: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest.doTest[ValueParameterDescriptorImpl]

'findStringWithPrefixes' @ [48:46] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'myFixture' @ [48:69] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest[JavaPropertyDescriptor]

'file' @ [48:79] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'text' @ [48:85] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'if (selectedExpression != null)
            KotlinEditorTextProvider.getElementInfo(selectedExpression) { it.text }
        else
            "null"' @ [49:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'selectedExpression' @ [49:32] ==> val selectedExpression: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest.doTest[LocalVariableDescriptor]

'getElementInfo' @ [50:38] ==> public final fun <T> getElementInfo(expr: KtExpression, f: (PsiElement) -> (String..String?)): (String..String?) defined in org.jetbrains.kotlin.idea.debugger.KotlinEditorTextProvider.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'selectedExpression' @ [50:53] ==> val selectedExpression: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest.doTest[LocalVariableDescriptor]

'it' @ [50:75] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [50:78] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'assertEquals' @ [54:16] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'expected' @ [54:70] ==> val expected: String? defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest.doTest[LocalVariableDescriptor]

'actualResult' @ [54:80] ==> val actualResult: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.AbstractSelectExpressionForDebuggerTest.doTest[LocalVariableDescriptor]

'INSTANCE' @ [57:72] ==> public final val INSTANCE: (KotlinLightProjectDescriptor..KotlinLightProjectDescriptor?) defined in org.jetbrains.kotlin.idea.test.KotlinLightProjectDescriptor[JavaPropertyDescriptor]

'+' @ [59:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [59:57] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

