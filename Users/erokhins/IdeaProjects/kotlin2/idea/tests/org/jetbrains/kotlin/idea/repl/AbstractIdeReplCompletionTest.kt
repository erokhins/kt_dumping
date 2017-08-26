'KotlinFixtureCompletionBaseTestCase' @ [33:48] ==> public constructor KotlinFixtureCompletionBaseTestCase() defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase[ClassConstructorDescriptorImpl]

'super' @ [37:9] ==> <this> defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [37:15] ==> protected open fun setUp(): Unit defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase[SimpleFunctionDescriptorImpl]

'consoleRunner' @ [38:9] ==> private final var consoleRunner: KotlinConsoleRunner? defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[PropertyDescriptorImpl]

'KotlinConsoleKeeper' @ [38:25] ==> public companion object defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[FakeCallableDescriptorForObject]

'getInstance' @ [38:45] ==> @JvmStatic public final fun getInstance(project: Project): (KotlinConsoleKeeper..KotlinConsoleKeeper?) defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [38:57] ==> public final val AbstractIdeReplCompletionTest.project: Project[MyPropertyDescriptor]

'run' @ [38:66] ==> public final fun run(module: Module, previousCompilationFailed: Boolean = ...): KotlinConsoleRunner? defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[DeserializedSimpleFunctionDescriptor]

'myModule' @ [38:70] ==> protected/*protected and package*/ final var myModule: (Module..Module?) defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[JavaPropertyDescriptor]

'consoleRunner' @ [42:9] ==> private final var consoleRunner: KotlinConsoleRunner? defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[PropertyDescriptorImpl]

'dispose' @ [42:24] ==> public final fun dispose(): Unit defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[DeserializedSimpleFunctionDescriptor]

'consoleRunner' @ [43:9] ==> private final var consoleRunner: KotlinConsoleRunner? defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[PropertyDescriptorImpl]

'super' @ [44:9] ==> <this> defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[LazyClassReceiverParameterDescriptor]

'tearDown' @ [44:15] ==> protected open fun tearDown(): Unit defined in org.jetbrains.kotlin.idea.completion.test.KotlinFixtureCompletionBaseTestCase[SimpleFunctionDescriptorImpl]

'JvmPlatform' @ [47:34] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'BASIC' @ [48:59] ==> enum entry BASIC defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

'consoleRunner' @ [51:22] ==> private final var consoleRunner: KotlinConsoleRunner? defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[PropertyDescriptorImpl]

'File' @ [52:20] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testPath' @ [52:25] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest[ValueParameterDescriptorImpl]

'file' @ [53:21] ==> val file: File defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest[LocalVariableDescriptor]

'readLines' @ [53:26] ==> public fun File.readLines(charset: Charset = ...): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'lines' @ [54:9] ==> val lines: List<String> defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest[LocalVariableDescriptor]

'prefixedWith' @ [54:15] ==> private final fun List<String>.prefixedWith(prefix: String): List<String> defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[SimpleFunctionDescriptorImpl]

'forEach' @ [54:35] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'runner' @ [54:45] ==> val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest[LocalVariableDescriptor]

'successfulLine' @ [54:52] ==> public final fun successfulLine(text: String): Unit defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[DeserializedSimpleFunctionDescriptor]

'it' @ [54:67] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'lines' @ [55:26] ==> val lines: List<String> defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest[LocalVariableDescriptor]

'prefixedWith' @ [55:32] ==> private final fun List<String>.prefixedWith(prefix: String): List<String> defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[SimpleFunctionDescriptorImpl]

'joinToString' @ [55:52] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'runWriteAction' @ [57:9] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'runner' @ [58:26] ==> val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest[LocalVariableDescriptor]

'consoleView' @ [58:33] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'editorDocument' @ [58:45] ==> public final val LanguageConsoleView.editorDocument: Document[MyPropertyDescriptor]

'editor' @ [59:13] ==> val editor: Document defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest.<anonymous>[LocalVariableDescriptor]

'setText' @ [59:20] ==> public abstract fun setText(@NotNull p0: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'codeSample' @ [59:28] ==> val codeSample: String defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest[LocalVariableDescriptor]

'getInstance' @ [60:33] ==> @NotNull public open fun getInstance(): FileDocumentManager defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'saveDocument' @ [60:47] ==> public abstract fun saveDocument(@NotNull p0: Document): Unit defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'runner' @ [60:60] ==> val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest[LocalVariableDescriptor]

'consoleView' @ [60:67] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'editorDocument' @ [60:79] ==> public final val LanguageConsoleView.editorDocument: Document[MyPropertyDescriptor]

'getInstance' @ [61:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [61:44] ==> public final val AbstractIdeReplCompletionTest.project: Project[MyPropertyDescriptor]

'commitAllDocuments' @ [61:53] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'myFixture' @ [64:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[JavaPropertyDescriptor]

'configureFromExistingVirtualFile' @ [64:19] ==> public abstract fun configureFromExistingVirtualFile(@NotNull p0: VirtualFile): Unit defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'runner' @ [64:52] ==> val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest[LocalVariableDescriptor]

'consoleFile' @ [64:59] ==> public final val consoleFile: KtFile defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[DeserializedPropertyDescriptor]

'virtualFile' @ [64:71] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'myFixture' @ [65:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[JavaPropertyDescriptor]

'editor' @ [65:19] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'caretModel' @ [65:26] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [65:37] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'myFixture' @ [65:50] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[JavaPropertyDescriptor]

'editor' @ [65:60] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'document' @ [65:67] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'getLineEndOffset' @ [65:76] ==> @Contract public abstract fun getLineEndOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'testCompletion' @ [67:9] ==> public fun testCompletion(fileText: String, platform: TargetPlatform?, complete: (CompletionType, Int) -> Array<LookupElement>?, defaultCompletionType: CompletionType = ..., defaultInvocationCount: Int = ..., additionalValidDirectives: Collection<String> = ...): Unit defined in org.jetbrains.kotlin.idea.completion.test[SimpleFunctionDescriptorImpl]

'file' @ [67:24] ==> val file: File defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest[LocalVariableDescriptor]

'readText' @ [67:29] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'getPlatform' @ [67:41] ==> public open fun getPlatform(): JvmPlatform defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[SimpleFunctionDescriptorImpl]

'myFixture' @ [67:83] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest[JavaPropertyDescriptor]

'complete' @ [67:93] ==> public abstract fun complete(@NotNull p0: CompletionType, p1: Int): (Array<(LookupElement..LookupElement?)>..Array<out (LookupElement..LookupElement?)>?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'completionType' @ [67:102] ==> value-parameter completionType: CompletionType defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'count' @ [67:118] ==> value-parameter count: Int defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [70:61] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [70:70] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.prefixedWith.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [70:73] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [70:84] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.prefixedWith[ValueParameterDescriptorImpl]

'map' @ [70:94] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [70:100] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.prefixedWith.<anonymous>[ValueParameterDescriptorImpl]

'removePrefix' @ [70:103] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [70:116] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.idea.repl.AbstractIdeReplCompletionTest.prefixedWith[ValueParameterDescriptorImpl]

'FullJdkProjectDescriptor' @ [72:67] ==> private object FullJdkProjectDescriptor : KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.repl in file AbstractIdeReplCompletionTest.kt[FakeCallableDescriptorForObject]

'KotlinWithJdkAndRuntimeLightProjectDescriptor' @ [75:43] ==> protected/*protected and package*/ constructor KotlinWithJdkAndRuntimeLightProjectDescriptor() defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaClassConstructorDescriptor]

'fullJdk' @ [76:48] ==> @NotNull public open fun fullJdk(): Sdk defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

