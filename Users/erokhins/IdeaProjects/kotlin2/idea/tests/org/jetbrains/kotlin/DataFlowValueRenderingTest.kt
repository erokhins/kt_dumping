'KotlinLightCodeInsightFixtureTestCase' @ [37:52] ==> public constructor KotlinLightCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'when (this) {
        is DataFlowValueFactory.ExpressionIdentifierInfo -> expression.text
        is IdentifierInfo.Receiver -> (value as? ImplicitReceiver)?.declarationDescriptor?.name?.let { "this@$it" }
        is IdentifierInfo.Variable -> variable.name.asString()
        is IdentifierInfo.PackageOrClass -> (descriptor as? PackageViewDescriptor)?.let { it.fqName.asString() }
        is IdentifierInfo.Qualified -> receiverInfo.render() + "." + selectorInfo.render()
        else -> null
    }' @ [39:52] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?, entry3: String?, entry4: String?, entry5: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'this' @ [39:58] ==> <this> defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.render[ReceiverParameterDescriptorImpl]

'expression' @ [40:61] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.ExpressionIdentifierInfo[DeserializedPropertyDescriptor]

'text' @ [40:72] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'value' @ [41:40] ==> public final val value: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.Receiver[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [41:69] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'name' @ [41:92] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'let' @ [41:98] ==> @InlineOnly public inline fun <T, R> Name.let(block: (Name) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> String

'it' @ [41:111] ==> value-parameter it: Name defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.render.<anonymous>[ValueParameterDescriptorImpl]

'variable' @ [42:39] ==> public final val variable: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.Variable[DeserializedPropertyDescriptor]

'name' @ [42:48] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [42:53] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'descriptor' @ [43:46] ==> public final val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.PackageOrClass[DeserializedPropertyDescriptor]

'let' @ [43:85] ==> @InlineOnly public inline fun <T, R> PackageViewDescriptor.let(block: (PackageViewDescriptor) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageViewDescriptor
    <R> -> String

'it' @ [43:91] ==> value-parameter it: PackageViewDescriptor defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.render.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [43:94] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'asString' @ [43:101] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'receiverInfo' @ [44:40] ==> public final val receiverInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.Qualified[DeserializedPropertyDescriptor]

'render' @ [44:53] ==> private final fun IdentifierInfo.render(): String? defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest[SimpleFunctionDescriptorImpl]

'selectorInfo' @ [44:70] ==> public final val selectorInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.Qualified[DeserializedPropertyDescriptor]

'render' @ [44:83] ==> private final fun IdentifierInfo.render(): String? defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest[SimpleFunctionDescriptorImpl]

'if (!isStable) null
            else identifierInfo.render()' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'!' @ [50:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isStable' @ [50:18] ==> public final val isStable: Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[DeserializedPropertyDescriptor]

'identifierInfo' @ [51:18] ==> public final val identifierInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[DeserializedPropertyDescriptor]

'render' @ [51:33] ==> private final fun IdentifierInfo.render(): String? defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest[SimpleFunctionDescriptorImpl]

'+' @ [54:16] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [54:35] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'JAVA_LATEST' @ [58:48] ==> public final val JAVA_LATEST: (LightProjectDescriptor..LightProjectDescriptor?) defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaPropertyDescriptor]

'myFixture' @ [62:23] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest[JavaPropertyDescriptor]

'fixture' @ [63:9] ==> val fixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[LocalVariableDescriptor]

'configureByFile' @ [63:17] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'fileName' @ [63:33] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[ValueParameterDescriptorImpl]

'fixture' @ [65:23] ==> val fixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[LocalVariableDescriptor]

'file' @ [65:31] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'jetFile' @ [66:23] ==> val jetFile: KtFile defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[LocalVariableDescriptor]

'findElementAt' @ [66:31] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'fixture' @ [66:45] ==> val fixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[LocalVariableDescriptor]

'caretOffset' @ [66:53] ==> public final val JavaCodeInsightTestFixture.caretOffset: Int[MyPropertyDescriptor]

'element' @ [67:26] ==> val element: PsiElement defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[LocalVariableDescriptor]

'getStrictParentOfType' @ [67:34] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'expression' @ [68:20] ==> val expression: KtExpression defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[LocalVariableDescriptor]

'analyze' @ [68:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getDataFlowInfoAfter' @ [68:41] ==> public fun BindingContext.getDataFlowInfoAfter(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'expression' @ [68:62] ==> val expression: KtExpression defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[LocalVariableDescriptor]

'info' @ [70:26] ==> val info: DataFlowInfo defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[LocalVariableDescriptor]

'completeTypeInfo' @ [70:31] ==> public abstract val completeTypeInfo: SetMultimap<DataFlowValue, KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedPropertyDescriptor]

'keySet' @ [70:48] ==> public abstract fun keySet(): (MutableSet<(DataFlowValue..DataFlowValue?)>..Set<(DataFlowValue..DataFlowValue?)>?) defined in com.google.common.collect.SetMultimap[JavaMethodDescriptor]

'info' @ [70:59] ==> val info: DataFlowInfo defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[LocalVariableDescriptor]

'completeNullabilityInfo' @ [70:64] ==> public abstract val completeNullabilityInfo: Map<DataFlowValue, Nullability> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedPropertyDescriptor]

'keys' @ [70:88] ==> public abstract val keys: Set<DataFlowValue> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'toSet' @ [70:94] ==> public fun <T> Iterable<(DataFlowValue..DataFlowValue?)>.toSet(): Set<(DataFlowValue..DataFlowValue?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue..org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue?)

'allValues' @ [71:22] ==> val allValues: Set<(DataFlowValue..DataFlowValue?)> defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[LocalVariableDescriptor]

'mapNotNull' @ [71:32] ==> public inline fun <T, R : Any> Iterable<(DataFlowValue..DataFlowValue?)>.mapNotNull(transform: ((DataFlowValue..DataFlowValue?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue..org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue?)
    <R : Any> -> String

'it' @ [71:45] ==> value-parameter it: (DataFlowValue..DataFlowValue?) defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'render' @ [71:48] ==> private final fun DataFlowValue.render(): String? defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest[SimpleFunctionDescriptorImpl]

'sorted' @ [71:59] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'joinToString' @ [71:68] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEqualsToFile' @ [73:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [73:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'+' @ [73:49] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getNameWithoutExtension' @ [73:58] ==> @NotNull public open fun getNameWithoutExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'fileName' @ [73:82] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[ValueParameterDescriptorImpl]

'actual' @ [73:103] ==> val actual: String defined in org.jetbrains.kotlin.AbstractDataFlowValueRenderingTest.doTest[LocalVariableDescriptor]

