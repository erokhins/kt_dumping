'KotlinAndroidTestCase' @ [26:48] ==> public constructor KotlinAndroidTestCase() defined in org.jetbrains.kotlin.android.KotlinAndroidTestCase[ClassConstructorDescriptorImpl]

'super' @ [31:9] ==> <this> defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [31:15] ==> @Override protected/*protected and package*/ open fun setUp(): Unit defined in org.jetbrains.kotlin.android.KotlinAndroidTestCase[JavaMethodDescriptor]

'getInstance' @ [33:44] ==> public open fun getInstance(): (CodeInsightSettings..CodeInsightSettings?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaMethodDescriptor]

'codeCompletionOldValue' @ [34:9] ==> private final var codeCompletionOldValue: Boolean defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[PropertyDescriptorImpl]

'settings' @ [34:34] ==> val settings: (CodeInsightSettings..CodeInsightSettings?) defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.setUp[LocalVariableDescriptor]

'AUTOCOMPLETE_ON_CODE_COMPLETION' @ [34:43] ==> public final var AUTOCOMPLETE_ON_CODE_COMPLETION: Boolean defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'smartTypeCompletionOldValue' @ [35:9] ==> private final var smartTypeCompletionOldValue: Boolean defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[PropertyDescriptorImpl]

'settings' @ [35:39] ==> val settings: (CodeInsightSettings..CodeInsightSettings?) defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.setUp[LocalVariableDescriptor]

'AUTOCOMPLETE_ON_SMART_TYPE_COMPLETION' @ [35:48] ==> public final var AUTOCOMPLETE_ON_SMART_TYPE_COMPLETION: Boolean defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'Suppress' @ [37:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (completionType()) {
            CompletionType.SMART -> settings.AUTOCOMPLETE_ON_SMART_TYPE_COMPLETION = false
            CompletionType.BASIC -> settings.AUTOCOMPLETE_ON_CODE_COMPLETION = false
        }' @ [38:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'completionType' @ [38:15] ==> private final fun completionType(): CompletionType defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[SimpleFunctionDescriptorImpl]

'SMART' @ [39:28] ==> enum entry SMART defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

'settings' @ [39:37] ==> val settings: (CodeInsightSettings..CodeInsightSettings?) defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.setUp[LocalVariableDescriptor]

'AUTOCOMPLETE_ON_SMART_TYPE_COMPLETION' @ [39:46] ==> public final var AUTOCOMPLETE_ON_SMART_TYPE_COMPLETION: Boolean defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'BASIC' @ [40:28] ==> enum entry BASIC defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

'settings' @ [40:37] ==> val settings: (CodeInsightSettings..CodeInsightSettings?) defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.setUp[LocalVariableDescriptor]

'AUTOCOMPLETE_ON_CODE_COMPLETION' @ [40:46] ==> public final var AUTOCOMPLETE_ON_CODE_COMPLETION: Boolean defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'BASIC' @ [44:51] ==> enum entry BASIC defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

'copyResourceDirectoryForTest' @ [47:9] ==> public final fun copyResourceDirectoryForTest(path: String): Unit defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[SimpleFunctionDescriptorImpl]

'path' @ [47:38] ==> value-parameter path: String defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.doTest[ValueParameterDescriptorImpl]

'myFixture' @ [48:27] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[JavaPropertyDescriptor]

'copyFileToProject' @ [48:37] ==> @NotNull public abstract fun copyFileToProject(@NotNull p0: String, @NotNull p1: String): VirtualFile defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'path' @ [48:55] ==> value-parameter path: String defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.doTest[ValueParameterDescriptorImpl]

'getTestName' @ [48:62] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[JavaMethodDescriptor]

'+' @ [48:89] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestName' @ [48:98] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[JavaMethodDescriptor]

'myFixture' @ [49:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[JavaPropertyDescriptor]

'configureFromExistingVirtualFile' @ [49:19] ==> public abstract fun configureFromExistingVirtualFile(@NotNull p0: VirtualFile): Unit defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'virtualFile' @ [49:52] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.doTest[LocalVariableDescriptor]

'loadFile' @ [50:33] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [50:42] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [50:47] ==> value-parameter path: String defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.doTest[ValueParameterDescriptorImpl]

'getTestName' @ [50:54] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[JavaMethodDescriptor]

'testCompletion' @ [51:9] ==> public fun testCompletion(fileText: String, platform: TargetPlatform?, complete: (CompletionType, Int) -> Array<LookupElement>?, defaultCompletionType: CompletionType = ..., defaultInvocationCount: Int = ..., additionalValidDirectives: Collection<String> = ...): Unit defined in org.jetbrains.kotlin.idea.completion.test[SimpleFunctionDescriptorImpl]

'fileText' @ [51:24] ==> val fileText: String defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.doTest[LocalVariableDescriptor]

'JvmPlatform' @ [51:34] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'myFixture' @ [51:74] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[JavaPropertyDescriptor]

'complete' @ [51:84] ==> public abstract fun complete(@NotNull p0: CompletionType, p1: Int): (Array<(LookupElement..LookupElement?)>..Array<out (LookupElement..LookupElement?)>?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'completionType' @ [51:93] ==> value-parameter completionType: CompletionType defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'count' @ [51:109] ==> value-parameter count: Int defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'getInstance' @ [55:44] ==> public open fun getInstance(): (CodeInsightSettings..CodeInsightSettings?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaMethodDescriptor]

'settings' @ [56:9] ==> val settings: (CodeInsightSettings..CodeInsightSettings?) defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.tearDown[LocalVariableDescriptor]

'AUTOCOMPLETE_ON_CODE_COMPLETION' @ [56:18] ==> public final var AUTOCOMPLETE_ON_CODE_COMPLETION: Boolean defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'codeCompletionOldValue' @ [56:52] ==> private final var codeCompletionOldValue: Boolean defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[PropertyDescriptorImpl]

'settings' @ [57:9] ==> val settings: (CodeInsightSettings..CodeInsightSettings?) defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest.tearDown[LocalVariableDescriptor]

'AUTOCOMPLETE_ON_SMART_TYPE_COMPLETION' @ [57:18] ==> public final var AUTOCOMPLETE_ON_SMART_TYPE_COMPLETION: Boolean defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'smartTypeCompletionOldValue' @ [57:58] ==> private final var smartTypeCompletionOldValue: Boolean defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[PropertyDescriptorImpl]

'super' @ [59:9] ==> <this> defined in org.jetbrains.kotlin.android.AbstractAndroidCompletionTest[LazyClassReceiverParameterDescriptor]

'tearDown' @ [59:15] ==> @Override protected/*protected and package*/ open fun tearDown(): Unit defined in org.jetbrains.kotlin.android.KotlinAndroidTestCase[JavaMethodDescriptor]

