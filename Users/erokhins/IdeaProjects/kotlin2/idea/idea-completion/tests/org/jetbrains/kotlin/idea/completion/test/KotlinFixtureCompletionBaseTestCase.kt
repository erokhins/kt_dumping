'KotlinLightCodeInsightFixtureTestCase' @ [27:54] ==> public constructor KotlinLightCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'myFixture' @ [31:15] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase[JavaPropertyDescriptor]

'complete' @ [31:25] ==> public abstract fun complete(@NotNull p0: CompletionType, p1: Int): (Array<(LookupElement..LookupElement?)>..Array<out (LookupElement..LookupElement?)>?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'completionType' @ [31:34] ==> value-parameter completionType: CompletionType defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase.complete[ValueParameterDescriptorImpl]

'invocationCount' @ [31:50] ==> value-parameter invocationCount: Int defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase.complete[ValueParameterDescriptorImpl]

'setUpFixture' @ [37:9] ==> protected open fun setUpFixture(testPath: String): Unit defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase[SimpleFunctionDescriptorImpl]

'testPath' @ [37:22] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase.doTest[ValueParameterDescriptorImpl]

'loadFile' @ [40:37] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [40:46] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testPath' @ [40:51] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase.doTest[ValueParameterDescriptorImpl]

'assertTrue' @ [41:13] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCaseBase[JavaMethodDescriptor]

'testPath' @ [41:59] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase.doTest[ValueParameterDescriptorImpl]

'fileText' @ [41:72] ==> val fileText: String defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase.doTest[LocalVariableDescriptor]

'contains' @ [41:81] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ExpectedCompletionUtils' @ [43:17] ==> public object ExpectedCompletionUtils defined in org.jetbrains.kotlin.idea.completion.test in file ExpectedCompletionUtils.kt[FakeCallableDescriptorForObject]

'shouldRunHighlightingBeforeCompletion' @ [43:41] ==> public final fun shouldRunHighlightingBeforeCompletion(fileText: String): Boolean defined in org.jetbrains.kotlin.idea.completion.test.ExpectedCompletionUtils[SimpleFunctionDescriptorImpl]

'fileText' @ [43:79] ==> val fileText: String defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase.doTest[LocalVariableDescriptor]

'myFixture' @ [44:17] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase[JavaPropertyDescriptor]

'doHighlighting' @ [44:27] ==> @NotNull public abstract fun doHighlighting(): (MutableList<(HighlightInfo..HighlightInfo?)>..List<(HighlightInfo..HighlightInfo?)>) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'testCompletion' @ [47:13] ==> public fun testCompletion(fileText: String, platform: TargetPlatform?, complete: (CompletionType, Int) -> Array<LookupElement>?, defaultCompletionType: CompletionType = ..., defaultInvocationCount: Int = ..., additionalValidDirectives: Collection<String> = ...): Unit defined in org.jetbrains.kotlin.idea.completion.test[SimpleFunctionDescriptorImpl]

'fileText' @ [47:28] ==> val fileText: String defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase.doTest[LocalVariableDescriptor]

'getPlatform' @ [47:38] ==> public abstract fun getPlatform(): TargetPlatform defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase[SimpleFunctionDescriptorImpl]

'complete' @ [47:80] ==> protected open fun complete(completionType: CompletionType, invocationCount: Int): Array<LookupElement>? defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase[SimpleFunctionDescriptorImpl]

'completionType' @ [47:89] ==> value-parameter completionType: CompletionType defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase.doTest.<anonymous>[ValueParameterDescriptorImpl]

'count' @ [47:105] ==> value-parameter count: Int defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase.doTest.<anonymous>[ValueParameterDescriptorImpl]

'defaultCompletionType' @ [47:115] ==> protected abstract fun defaultCompletionType(): CompletionType defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase[SimpleFunctionDescriptorImpl]

'defaultInvocationCount' @ [47:140] ==> protected open fun defaultInvocationCount(): Int defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase[SimpleFunctionDescriptorImpl]

'tearDownFixture' @ [50:13] ==> protected open fun tearDownFixture(): Unit defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase[SimpleFunctionDescriptorImpl]

'LibraryModificationTracker' @ [56:9] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[FakeCallableDescriptorForObject]

'getInstance' @ [56:36] ==> @JvmStatic public final fun getInstance(project: Project): LibraryModificationTracker defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [56:48] ==> public final val KotlinFixtureCompletionBaseTestCase.project: Project[MyPropertyDescriptor]

'incModificationCount' @ [56:57] ==> public open fun incModificationCount(): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[JavaMethodDescriptor]

'myFixture' @ [58:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase[JavaPropertyDescriptor]

'configureByFile' @ [58:19] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'testPath' @ [58:35] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase.setUpFixture[ValueParameterDescriptorImpl]

