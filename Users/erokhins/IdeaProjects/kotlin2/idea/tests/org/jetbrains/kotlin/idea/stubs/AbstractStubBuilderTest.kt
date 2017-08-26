'LightCodeInsightFixtureTestCase' @ [30:42] ==> protected/*protected and package*/ constructor LightCodeInsightFixtureTestCase() defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaClassConstructorDescriptor]

'myFixture' @ [32:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest[JavaPropertyDescriptor]

'configureByFile' @ [32:30] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'sourcePath' @ [32:46] ==> value-parameter sourcePath: String defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.doTest[ValueParameterDescriptorImpl]

'KtFileStubBuilder' @ [33:30] ==> public constructor KtFileStubBuilder() defined in org.jetbrains.kotlin.psi.stubs.elements.KtFileStubBuilder[JavaClassConstructorDescriptor]

'jetStubBuilder' @ [34:27] ==> val jetStubBuilder: KtFileStubBuilder defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.doTest[LocalVariableDescriptor]

'buildStubTree' @ [34:42] ==> public open fun buildStubTree(@NotNull p0: PsiFile): raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtFileStubBuilder[JavaMethodDescriptor]

'file' @ [34:56] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.doTest[LocalVariableDescriptor]

'serializeStubToString' @ [35:24] ==> public final fun serializeStubToString(stubElement: StubElement<*>): String defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.Companion[SimpleFunctionDescriptorImpl]

'lighterTree' @ [35:46] ==> val lighterTree: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?) defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.doTest[LocalVariableDescriptor]

'sourcePath' @ [36:28] ==> value-parameter sourcePath: String defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.doTest[ValueParameterDescriptorImpl]

'replace' @ [36:39] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEqualsToFile' @ [37:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [37:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'expectedFile' @ [37:49] ==> val expectedFile: String defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.doTest[LocalVariableDescriptor]

'stubTree' @ [37:64] ==> val stubTree: String defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.doTest[LocalVariableDescriptor]

'stubTreeToString' @ [42:37] ==> public open fun stubTreeToString(p0: (Stub..Stub?)): (String..String?) defined in com.intellij.psi.impl.DebugUtil[JavaMethodDescriptor]

'stubElement' @ [42:54] ==> value-parameter stubElement: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.Companion.serializeStubToString[ValueParameterDescriptorImpl]

'replace' @ [42:67] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'SAFE_IDENTIFIER_FOR_NO_NAME' @ [42:88] ==> public final val SAFE_IDENTIFIER_FOR_NO_NAME: (Name..Name?) defined in org.jetbrains.kotlin.name.SpecialNames[JavaPropertyDescriptor]

'asString' @ [42:116] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'treeStr' @ [46:20] ==> val treeStr: String defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.Companion.serializeStubToString[LocalVariableDescriptor]

'lines' @ [47:22] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [47:30] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (it.contains(STUB_TO_STRING_PREFIX)) {
                            it.takeWhile { it.isWhitespace() } + it.substringAfter("KotlinStub$")
                        }
                        else {
                            it
                        }' @ [48:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [48:29] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.Companion.serializeStubToString.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [48:32] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'STUB_TO_STRING_PREFIX' @ [48:41] ==> public val STUB_TO_STRING_PREFIX: String defined in org.jetbrains.kotlin.psi.stubs.impl[DeserializedPropertyDescriptor]

'it' @ [49:29] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.Companion.serializeStubToString.<anonymous>[ValueParameterDescriptorImpl]

'takeWhile' @ [49:32] ==> public inline fun String.takeWhile(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [49:44] ==> value-parameter it: Char defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.Companion.serializeStubToString.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isWhitespace' @ [49:47] ==> public fun Char.isWhitespace(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [49:66] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.Companion.serializeStubToString.<anonymous>[ValueParameterDescriptorImpl]

'substringAfter' @ [49:69] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [52:29] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.stubs.AbstractStubBuilderTest.Companion.serializeStubToString.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [55:22] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'replace' @ [56:22] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

