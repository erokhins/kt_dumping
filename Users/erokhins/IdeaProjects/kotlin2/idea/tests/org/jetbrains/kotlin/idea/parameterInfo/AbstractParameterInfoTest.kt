'LightCodeInsightFixtureTestCase' @ [36:44] ==> protected/*protected and package*/ constructor LightCodeInsightFixtureTestCase() defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaClassConstructorDescriptor]

'getTestsRoot' @ [38:36] ==> public open fun getTestsRoot(@NotNull p0: Class<*>): (String..String?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'this' @ [38:49] ==> <this> defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest[LazyClassReceiverParameterDescriptor]

'java' @ [38:61] ==> public val <T> KClass<out AbstractParameterInfoTest>.java: Class<out AbstractParameterInfoTest> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AbstractParameterInfoTest

'root' @ [39:13] ==> val root: (String..String?) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.getProjectDescriptor[LocalVariableDescriptor]

'contains' @ [39:18] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JdkAndMockLibraryProjectDescriptor' @ [40:20] ==> public constructor JdkAndMockLibraryProjectDescriptor(sourcesPath: (String..String?), withSources: Boolean, withRuntime: Boolean, isJsLibrary: Boolean, allowKotlinPackage: Boolean) defined in org.jetbrains.kotlin.idea.test.JdkAndMockLibraryProjectDescriptor[JavaClassConstructorDescriptor]

'root' @ [41:23] ==> val root: (String..String?) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.getProjectDescriptor[LocalVariableDescriptor]

'INSTANCE' @ [45:51] ==> @NotNull public final val INSTANCE: ProjectDescriptorWithStdlibSources defined in org.jetbrains.kotlin.idea.test.ProjectDescriptorWithStdlibSources[JavaPropertyDescriptor]

'super' @ [49:9] ==> <this> defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [49:15] ==> protected/*protected and package*/ open fun setUp(): Unit defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'myFixture' @ [50:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest[JavaPropertyDescriptor]

'testDataPath' @ [50:19] ==> public final var JavaCodeInsightTestFixture.testDataPath: String[MyPropertyDescriptor]

'+' @ [50:34] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [50:53] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'myFixture' @ [54:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest[JavaPropertyDescriptor]

'configureByFile' @ [54:19] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'fileName' @ [54:35] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[ValueParameterDescriptorImpl]

'myFixture' @ [56:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest[JavaPropertyDescriptor]

'file' @ [56:30] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'!=' @ [57:29] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'findStringWithPrefixes' @ [57:51] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'file' @ [57:74] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'text' @ [57:79] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'isWithRuntime' @ [60:17] ==> val isWithRuntime: Boolean defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'ConfigLibraryUtil' @ [61:17] ==> public object ConfigLibraryUtil defined in org.jetbrains.kotlin.idea.test in file ConfigLibraryUtil.kt[FakeCallableDescriptorForObject]

'configureKotlinRuntimeAndSdk' @ [61:35] ==> public final fun configureKotlinRuntimeAndSdk(module: Module, sdk: Sdk): Unit defined in org.jetbrains.kotlin.idea.test.ConfigLibraryUtil[SimpleFunctionDescriptorImpl]

'myFixture' @ [61:64] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest[JavaPropertyDescriptor]

'module' @ [61:74] ==> public final val JavaCodeInsightTestFixture.module: (Module..Module?)[MyPropertyDescriptor]

'mockJdk' @ [61:101] ==> @NotNull public open fun mockJdk(): Sdk defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'file' @ [64:29] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'allChildren' @ [64:34] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filter' @ [64:46] ==> public fun <T> Sequence<PsiElement>.filter(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [64:55] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'last' @ [64:78] ==> public fun <T> Sequence<PsiElement>.last(): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'when (lastChild.node.elementType) {
                KtTokens.BLOCK_COMMENT -> lastChild.text.substring(2, lastChild.text.length - 2).trim()
                KtTokens.EOL_COMMENT -> lastChild.text.substring(2).trim()
                else -> error("Unexpected last file child")
            }' @ [65:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'lastChild' @ [65:44] ==> val lastChild: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'node' @ [65:54] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [65:59] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'BLOCK_COMMENT' @ [66:26] ==> public final val BLOCK_COMMENT: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'lastChild' @ [66:43] ==> val lastChild: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'text' @ [66:53] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'substring' @ [66:58] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lastChild' @ [66:71] ==> val lastChild: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'text' @ [66:81] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'length' @ [66:86] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'trim' @ [66:98] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'EOL_COMMENT' @ [67:26] ==> public final val EOL_COMMENT: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'lastChild' @ [67:41] ==> val lastChild: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'text' @ [67:51] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'substring' @ [67:56] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [67:69] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'error' @ [68:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'ShowParameterInfoContext' @ [71:27] ==> public constructor ShowParameterInfoContext(p0: (Editor..Editor?), p1: (Project..Project?), p2: (PsiFile..PsiFile?), p3: Int, p4: Int, p5: Boolean) defined in com.intellij.codeInsight.hint.ShowParameterInfoContext[JavaClassConstructorDescriptor]

'editor' @ [71:52] ==> protected/*protected and package*/ for synthetic extension final val AbstractParameterInfoTest.editor: (Editor..Editor?)[MyPropertyDescriptor]

'project' @ [71:60] ==> protected/*protected and package*/ for synthetic extension final val AbstractParameterInfoTest.project: (Project..Project?)[MyPropertyDescriptor]

'file' @ [71:69] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'editor' @ [71:75] ==> protected/*protected and package*/ for synthetic extension final val AbstractParameterInfoTest.editor: (Editor..Editor?)[MyPropertyDescriptor]

'caretModel' @ [71:82] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [71:93] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'-' @ [71:101] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'!!' @ [73:28] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: (Array<raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>?)>?..Array<out raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>?)>?)): (Array<raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>?)>..Array<out raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>?)>)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> (kotlin.Array<raw (com.intellij.lang.parameterInfo.ParameterInfoHandler<(kotlin.Any..kotlin.Any?), (kotlin.Any..kotlin.Any?)>..com.intellij.lang.parameterInfo.ParameterInfoHandler<*, *>?)>..kotlin.Array<out raw (com.intellij.lang.parameterInfo.ParameterInfoHandler<(kotlin.Any..kotlin.Any?), (kotlin.Any..kotlin.Any?)>..com.intellij.lang.parameterInfo.ParameterInfoHandler<*, *>?)>)

'getHandlers' @ [73:53] ==> @Nullable public open fun getHandlers(p0: (Project..Project?), vararg p1: (Language..Language?)): (Array<raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>?)>?..Array<out raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>?)>?) defined in com.intellij.codeInsight.hint.ShowParameterInfoHandler[JavaMethodDescriptor]

'project' @ [73:65] ==> protected/*protected and package*/ for synthetic extension final val AbstractParameterInfoTest.project: (Project..Project?)[MyPropertyDescriptor]

'INSTANCE' @ [73:89] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'handlers' @ [74:27] ==> val handlers: (Array<raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>?)>..Array<out raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>?)>) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'firstOrNull' @ [74:36] ==> public inline fun <T> Array<out raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>?)>.firstOrNull(predicate: (raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>?)) -> Boolean): raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>?..ParameterInfoHandler<*, *>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> raw (com.intellij.lang.parameterInfo.ParameterInfoHandler<(kotlin.Any..kotlin.Any?), (kotlin.Any..kotlin.Any?)>..com.intellij.lang.parameterInfo.ParameterInfoHandler<*, *>?)

'it' @ [74:50] ==> value-parameter it: raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>?) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'findElementForParameterInfo' @ [74:53] ==> @Nullable public abstract fun findElementForParameterInfo(@NotNull p0: CreateParameterInfoContext): Any? defined in com.intellij.lang.parameterInfo.ParameterInfoHandler[JavaMethodDescriptor]

'context' @ [74:81] ==> val context: ShowParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'error' @ [75:30] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'MockCreateParameterInfoContext' @ [77:50] ==> public/*package*/ constructor MockCreateParameterInfoContext(file: (PsiFile..PsiFile?), fixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?)) defined in org.jetbrains.kotlin.idea.parameterInfo.MockCreateParameterInfoContext[JavaClassConstructorDescriptor]

'file' @ [77:81] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'myFixture' @ [77:87] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest[JavaPropertyDescriptor]

'handler' @ [78:34] ==> val handler: (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'findElementForParameterInfo' @ [78:42] ==> @Nullable public abstract fun findElementForParameterInfo(@NotNull p0: CreateParameterInfoContext): Any? defined in com.intellij.lang.parameterInfo.ParameterInfoHandler[JavaMethodDescriptor]

'mockCreateParameterInfoContext' @ [78:70] ==> val mockCreateParameterInfoContext: MockCreateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'findStringWithPrefixes' @ [80:52] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'file' @ [80:75] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'text' @ [80:80] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'textToType' @ [81:17] ==> val textToType: String? defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'myFixture' @ [82:17] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest[JavaPropertyDescriptor]

'type' @ [82:27] ==> public abstract fun type(@NotNull p0: String): Unit defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'textToType' @ [82:32] ==> val textToType: String? defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'getInstance' @ [83:36] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [83:48] ==> protected/*protected and package*/ for synthetic extension final val AbstractParameterInfoTest.project: (Project..Project?)[MyPropertyDescriptor]

'commitAllDocuments' @ [83:57] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'MockUpdateParameterInfoContext' @ [87:33] ==> public/*package*/ constructor MockUpdateParameterInfoContext(file: (PsiFile..PsiFile?), fixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?)) defined in org.jetbrains.kotlin.idea.parameterInfo.MockUpdateParameterInfoContext[JavaClassConstructorDescriptor]

'file' @ [87:64] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'myFixture' @ [87:70] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest[JavaPropertyDescriptor]

'handler' @ [88:38] ==> val handler: (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'findElementForUpdatingParameterInfo' @ [88:46] ==> @Nullable public abstract fun findElementForUpdatingParameterInfo(@NotNull p0: UpdateParameterInfoContext): Any? defined in com.intellij.lang.parameterInfo.ParameterInfoHandler[JavaMethodDescriptor]

'updateContext' @ [88:82] ==> val updateContext: MockUpdateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'elementForUpdating' @ [89:17] ==> val elementForUpdating: Any? defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'handler' @ [90:17] ==> val handler: (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'updateParameterInfo' @ [90:25] ==> public abstract fun updateParameterInfo(@NotNull p0: Any, @NotNull p1: UpdateParameterInfoContext): Unit defined in com.intellij.lang.parameterInfo.ParameterInfoHandler[JavaMethodDescriptor]

'elementForUpdating' @ [90:45] ==> val elementForUpdating: Any? defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'updateContext' @ [90:65] ==> val updateContext: MockUpdateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'MockParameterInfoUIContext' @ [93:42] ==> public/*package*/ constructor MockParameterInfoUIContext(parameterOwner: (PsiElement..PsiElement?), currentParameterIndex: Int) defined in org.jetbrains.kotlin.idea.parameterInfo.MockParameterInfoUIContext[JavaClassConstructorDescriptor]

'parameterOwner' @ [93:69] ==> val parameterOwner: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'updateContext' @ [93:85] ==> val updateContext: MockUpdateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'currentParameter' @ [93:99] ==> public final var MockUpdateParameterInfoContext.currentParameter: Int[MyPropertyDescriptor]

'mockCreateParameterInfoContext' @ [95:10] ==> val mockCreateParameterInfoContext: MockCreateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'itemsToShow' @ [95:41] ==> public final var MockCreateParameterInfoContext.itemsToShow: (Array<(Any..Any?)>?..Array<out (Any..Any?)>?)[MyPropertyDescriptor]

'forEach' @ [95:54] ==> public inline fun <T> Array<out (Any..Any?)>.forEach(action: ((Any..Any?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'handler' @ [96:13] ==> val handler: (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'updateUI' @ [96:21] ==> public abstract fun updateUI(p0: (Any..Any?), @NotNull p1: ParameterInfoUIContext): Unit defined in com.intellij.lang.parameterInfo.ParameterInfoHandler[JavaMethodDescriptor]

'it' @ [96:30] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'parameterInfoUIContext' @ [96:34] ==> val parameterInfoUIContext: MockParameterInfoUIContext defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'assertEquals' @ [98:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'expectedResultText' @ [98:29] ==> val expectedResultText: String defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'parameterInfoUIContext' @ [98:49] ==> val parameterInfoUIContext: MockParameterInfoUIContext defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'resultText' @ [98:72] ==> public final val MockParameterInfoUIContext.resultText: (String..String?)[MyPropertyDescriptor]

'isWithRuntime' @ [100:17] ==> val isWithRuntime: Boolean defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest.doTest[LocalVariableDescriptor]

'ConfigLibraryUtil' @ [101:17] ==> public object ConfigLibraryUtil defined in org.jetbrains.kotlin.idea.test in file ConfigLibraryUtil.kt[FakeCallableDescriptorForObject]

'unConfigureKotlinRuntimeAndSdk' @ [101:35] ==> public final fun unConfigureKotlinRuntimeAndSdk(module: Module, sdk: Sdk): Unit defined in org.jetbrains.kotlin.idea.test.ConfigLibraryUtil[SimpleFunctionDescriptorImpl]

'myFixture' @ [101:66] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.parameterInfo.AbstractParameterInfoTest[JavaPropertyDescriptor]

'module' @ [101:76] ==> public final val JavaCodeInsightTestFixture.module: (Module..Module?)[MyPropertyDescriptor]

'getMockJdk17' @ [101:97] ==> public open fun getMockJdk17(): (Sdk..Sdk?) defined in com.intellij.testFramework.IdeaTestUtil[JavaMethodDescriptor]

