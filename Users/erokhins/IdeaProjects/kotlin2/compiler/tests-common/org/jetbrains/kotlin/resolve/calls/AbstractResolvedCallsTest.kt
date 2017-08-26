'KotlinTestWithEnvironment' @ [47:44] ==> public constructor KotlinTestWithEnvironment() defined in org.jetbrains.kotlin.test.KotlinTestWithEnvironment[JavaClassConstructorDescriptor]

'createEnvironmentWithMockJdk' @ [48:63] ==> @NotNull protected/*protected and package*/ open fun createEnvironmentWithMockJdk(@NotNull configurationKind: ConfigurationKind): KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest[JavaMethodDescriptor]

'ALL' @ [48:110] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'!!' @ [51:28] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'doLoadFile' @ [51:44] ==> public open fun doLoadFile(@NotNull file: File): (String..String?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [51:55] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'filePath' @ [51:60] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[ValueParameterDescriptorImpl]

'component1' @ [52:14] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [52:20] ==> public final operator fun component2(): List<Int> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'extractCarets' @ [52:30] ==> protected final fun extractCarets(text: String): Pair<String, List<Int>> defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest[SimpleFunctionDescriptorImpl]

'originalText' @ [52:44] ==> val originalText: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[LocalVariableDescriptor]

'KtPsiFactory' @ [54:22] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [54:35] ==> public final val AbstractResolvedCallsTest.project: Project[MyPropertyDescriptor]

'createFile' @ [54:44] ==> public final fun createFile(text: String): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'text' @ [54:55] ==> val text: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[LocalVariableDescriptor]

'JvmResolveUtil' @ [55:30] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy in file JvmResolveUtil.kt[FakeCallableDescriptorForObject]

'analyze' @ [55:45] ==> @JvmStatic public final fun analyze(file: KtFile, environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[SimpleFunctionDescriptorImpl]

'ktFile' @ [55:53] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[LocalVariableDescriptor]

'environment' @ [55:61] ==> public final val AbstractResolvedCallsTest.environment: KotlinCoreEnvironment[MyPropertyDescriptor]

'bindingContext' @ [55:74] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'carets' @ [57:31] ==> val carets: List<Int> defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[LocalVariableDescriptor]

'map' @ [57:38] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> Pair<Int, ResolvedCall<out CallableDescriptor>?>): List<Pair<Int, ResolvedCall<out CallableDescriptor>?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Pair<Int, ResolvedCall<out CallableDescriptor>?>

'caret' @ [57:53] ==> value-parameter caret: Int defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'run' @ [57:62] ==> @InlineOnly public inline fun <T, R> AbstractResolvedCallsTest.run(block: AbstractResolvedCallsTest.() -> ResolvedCall<out CallableDescriptor>?): ResolvedCall<out CallableDescriptor>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractResolvedCallsTest
    <R> -> ResolvedCall<out CallableDescriptor>?

'component1' @ [58:18] ==> public final operator fun component1(): PsiElement? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [58:27] ==> public final operator fun component2(): ResolvedCall<out CallableDescriptor>? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'buildCachedCallAtIndex' @ [58:41] ==> protected open fun buildCachedCallAtIndex(bindingContext: BindingContext, jetFile: KtFile, index: Int): Pair<PsiElement?, ResolvedCall<out CallableDescriptor>?> defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest[SimpleFunctionDescriptorImpl]

'bindingContext' @ [58:64] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[LocalVariableDescriptor]

'ktFile' @ [58:80] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[LocalVariableDescriptor]

'caret' @ [58:88] ==> value-parameter caret: Int defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'when {
                cachedCall !is VariableAsFunctionResolvedCall -> cachedCall
                "(" == element?.text -> cachedCall.functionCall
                else -> cachedCall.variableCall
            }' @ [60:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ResolvedCall<out CallableDescriptor>?, entry1: ResolvedCall<out CallableDescriptor>?, entry2: ResolvedCall<out CallableDescriptor>?): ResolvedCall<out CallableDescriptor>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ResolvedCall<out CallableDescriptor>?

'cachedCall' @ [61:17] ==> val cachedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'cachedCall' @ [61:66] ==> val cachedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'==' @ [62:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [62:24] ==> val element: PsiElement? defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'text' @ [62:33] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'cachedCall' @ [62:41] ==> val cachedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'functionCall' @ [62:52] ==> public abstract val functionCall: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'cachedCall' @ [63:25] ==> val cachedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'variableCall' @ [63:36] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'resolvedCall' @ [66:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'renderOutput' @ [69:22] ==> protected open fun renderOutput(originalText: String, text: String, resolvedCallsAt: List<Pair<Int, ResolvedCall<*>?>>): String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest[SimpleFunctionDescriptorImpl]

'originalText' @ [69:35] ==> val originalText: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[LocalVariableDescriptor]

'text' @ [69:49] ==> val text: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[LocalVariableDescriptor]

'resolvedCallsAt' @ [69:55] ==> val resolvedCallsAt: List<Pair<Int, ResolvedCall<out CallableDescriptor>?>> defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[LocalVariableDescriptor]

'+' @ [71:40] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getNameWithoutExtension' @ [71:49] ==> @NotNull public open fun getNameWithoutExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'filePath' @ [71:73] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[ValueParameterDescriptorImpl]

'assertEqualsToFile' @ [72:25] ==> public open fun assertEqualsToFile(@NotNull expectedFile: File, @NotNull actual: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [72:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'resolvedCallInfoFileName' @ [72:49] ==> val resolvedCallInfoFileName: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[LocalVariableDescriptor]

'output' @ [72:76] ==> val output: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.doTest[LocalVariableDescriptor]

'resolvedCallsAt' @ [76:13] ==> value-parameter resolvedCallsAt: List<Pair<Int, ResolvedCall<*>?>> defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.renderOutput[ValueParameterDescriptorImpl]

'joinToString' @ [76:29] ==> public fun <T> Iterable<Pair<Int, ResolvedCall<*>?>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Pair<Int, ResolvedCall<*>?>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, ResolvedCall<*>?>

'originalText' @ [76:61] ==> value-parameter originalText: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.renderOutput[ValueParameterDescriptorImpl]

'component1' @ [76:85] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [76:88] ==> public final operator fun component2(): ResolvedCall<*>? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [77:17] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.renderOutput.<anonymous>[LocalVariableDescriptor]

'renderToText' @ [77:31] ==> internal fun ResolvedCall<*>.renderToText(): String defined in org.jetbrains.kotlin.resolve.calls in file AbstractResolvedCallsTest.kt[SimpleFunctionDescriptorImpl]

'toString' @ [77:46] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'text' @ [81:21] ==> value-parameter text: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.extractCarets[ValueParameterDescriptorImpl]

'split' @ [81:26] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parts' @ [82:13] ==> val parts: List<String> defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.extractCarets[LocalVariableDescriptor]

'size' @ [82:19] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'text' @ [82:36] ==> value-parameter text: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.extractCarets[ValueParameterDescriptorImpl]

'emptyList' @ [82:44] ==> public fun <T> emptyList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'mutableListOf' @ [84:23] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'buildString' @ [85:26] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parts' @ [86:13] ==> val parts: List<String> defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.extractCarets[LocalVariableDescriptor]

'dropLast' @ [86:19] ==> public fun <T> List<String>.dropLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'forEach' @ [86:31] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'append' @ [87:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'part' @ [87:24] ==> value-parameter part: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.extractCarets.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'indices' @ [88:17] ==> val indices: MutableList<Int> defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.extractCarets[LocalVariableDescriptor]

'add' @ [88:25] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'this' @ [88:29] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.extractCarets.<anonymous>[ReceiverParameterDescriptorImpl]

'length' @ [88:34] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'append' @ [90:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'parts' @ [90:20] ==> val parts: List<String> defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.extractCarets[LocalVariableDescriptor]

'last' @ [90:26] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'resultText' @ [92:16] ==> val resultText: String defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.extractCarets[LocalVariableDescriptor]

'indices' @ [92:30] ==> val indices: MutableList<Int> defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.extractCarets[LocalVariableDescriptor]

'jetFile' @ [98:23] ==> value-parameter jetFile: KtFile defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.buildCachedCallAtIndex[ValueParameterDescriptorImpl]

'findElementAt' @ [98:31] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'index' @ [98:45] ==> value-parameter index: Int defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.buildCachedCallAtIndex[ValueParameterDescriptorImpl]

'element' @ [99:26] ==> val element: PsiElement defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.buildCachedCallAtIndex[LocalVariableDescriptor]

'getStrictParentOfType' @ [99:34] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'expression' @ [101:26] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.buildCachedCallAtIndex[LocalVariableDescriptor]

'getParentResolvedCall' @ [101:38] ==> public fun KtElement?.getParentResolvedCall(context: BindingContext, strict: Boolean = ...): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [101:60] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.buildCachedCallAtIndex[ValueParameterDescriptorImpl]

'Pair' @ [102:16] ==> public constructor Pair<out A, out B>(first: PsiElement, second: ResolvedCall<out CallableDescriptor>?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> PsiElement
    <out B> -> ResolvedCall<out CallableDescriptor>?

'element' @ [102:21] ==> val element: PsiElement defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.buildCachedCallAtIndex[LocalVariableDescriptor]

'cachedCall' @ [102:30] ==> val cachedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest.buildCachedCallAtIndex[LocalVariableDescriptor]

'when (this) {
    is ExpressionReceiver -> "${expression.text} {${type}}"
    is ImplicitClassReceiver -> "Class{${type}}"
    is ExtensionReceiver -> "${type}Ext{${declarationDescriptor.getText()}}"
    null -> "NO_RECEIVER"
    else -> toString()
}' @ [106:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [106:42] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.getText[ReceiverParameterDescriptorImpl]

'expression' @ [107:33] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'text' @ [107:44] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'type' @ [107:53] ==> public final val ExpressionReceiver.type: KotlinType[MyPropertyDescriptor]

'type' @ [108:42] ==> public final val ImplicitClassReceiver.type: SimpleType[MyPropertyDescriptor]

'type' @ [109:32] ==> public final val ExtensionReceiver.type: KotlinType[MyPropertyDescriptor]

'declarationDescriptor' @ [109:43] ==> public open val declarationDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExtensionReceiver[JavaPropertyDescriptor]

'getText' @ [109:65] ==> internal fun DeclarationDescriptor.getText(): String defined in org.jetbrains.kotlin.resolve.calls in file AbstractResolvedCallsTest.kt[SimpleFunctionDescriptorImpl]

'toString' @ [111:13] ==> public open fun toString(): String defined in org.jetbrains.kotlin.resolve.scopes.receivers.Receiver[DeserializedSimpleFunctionDescriptor]

'this' @ [114:40] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.getText[ReceiverParameterDescriptorImpl]

'getArgumentExpression' @ [114:45] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'text' @ [114:70] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'replace' @ [114:76] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (this) {
    is ArgumentMatch -> {
        val parameterType = DescriptorRenderer.SHORT_NAMES_IN_TYPES.renderType(valueParameter.type)
        "${status.name}  ${valueParameter.name} : ${parameterType} ="
    }
    else -> "ARGUMENT UNMAPPED: "
}' @ [116:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [116:48] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.getText[ReceiverParameterDescriptorImpl]

'DescriptorRenderer' @ [118:29] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'SHORT_NAMES_IN_TYPES' @ [118:48] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [118:69] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'valueParameter' @ [118:80] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'type' @ [118:95] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'status' @ [119:12] ==> public abstract val status: ArgumentMatchStatus defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'name' @ [119:19] ==> public final val name: String defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatchStatus[DeserializedPropertyDescriptor]

'valueParameter' @ [119:28] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'name' @ [119:43] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'parameterType' @ [119:53] ==> val parameterType: String defined in org.jetbrains.kotlin.resolve.calls.getText[LocalVariableDescriptor]

'when (this) {
    is ReceiverParameterDescriptor -> "${value.getText()}::this"
    else -> DescriptorRenderer.COMPACT_WITH_SHORT_TYPES.render(this)
}' @ [124:56] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [124:62] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.getText[ReceiverParameterDescriptorImpl]

'value' @ [125:42] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'getText' @ [125:48] ==> internal fun Receiver?.getText(): String defined in org.jetbrains.kotlin.resolve.calls[SimpleFunctionDescriptorImpl]

'DescriptorRenderer' @ [126:13] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'COMPACT_WITH_SHORT_TYPES' @ [126:32] ==> @field:JvmField public final val COMPACT_WITH_SHORT_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [126:57] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [126:64] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.getText[ReceiverParameterDescriptorImpl]

'buildString' @ [130:12] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [131:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [132:9] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'candidateDescriptor' @ [134:13] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resultingDescriptor' @ [134:36] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'appendln' @ [135:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'candidateDescriptor' @ [135:47] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'getText' @ [135:69] ==> internal fun DeclarationDescriptor.getText(): String defined in org.jetbrains.kotlin.resolve.calls in file AbstractResolvedCallsTest.kt[SimpleFunctionDescriptorImpl]

'appendln' @ [137:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'resultingDescriptor' @ [137:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'getText' @ [137:65] ==> internal fun DeclarationDescriptor.getText(): String defined in org.jetbrains.kotlin.resolve.calls in file AbstractResolvedCallsTest.kt[SimpleFunctionDescriptorImpl]

'appendln' @ [138:9] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [140:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'explicitReceiverKind' @ [140:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'appendln' @ [141:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'dispatchReceiver' @ [141:41] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'getText' @ [141:58] ==> internal fun Receiver?.getText(): String defined in org.jetbrains.kotlin.resolve.calls[SimpleFunctionDescriptorImpl]

'appendln' @ [142:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'extensionReceiver' @ [142:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'getText' @ [142:60] ==> internal fun Receiver?.getText(): String defined in org.jetbrains.kotlin.resolve.calls[SimpleFunctionDescriptorImpl]

'call' @ [144:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'valueArguments' @ [144:35] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'!' @ [145:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'valueArguments' @ [145:14] ==> val valueArguments: List<(ValueArgument..ValueArgument?)> defined in org.jetbrains.kotlin.resolve.calls.renderToText.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [145:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'appendln' @ [146:13] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [147:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [148:13] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'valueArguments' @ [150:35] ==> val valueArguments: List<(ValueArgument..ValueArgument?)> defined in org.jetbrains.kotlin.resolve.calls.renderToText.<anonymous>[LocalVariableDescriptor]

'valueArgument' @ [151:36] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.renderToText.<anonymous>[LocalVariableDescriptor]

'getText' @ [151:52] ==> internal fun ValueArgument.getText(): String defined in org.jetbrains.kotlin.resolve.calls[SimpleFunctionDescriptorImpl]

'getArgumentMapping' @ [152:43] ==> @NotNull public abstract fun getArgumentMapping(@NotNull p0: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'valueArgument' @ [152:62] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.renderToText.<anonymous>[LocalVariableDescriptor]

'getText' @ [152:77] ==> internal fun ArgumentMapping.getText(): String defined in org.jetbrains.kotlin.resolve.calls[SimpleFunctionDescriptorImpl]

'appendln' @ [154:17] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'argumentMappingText' @ [154:28] ==> val argumentMappingText: String defined in org.jetbrains.kotlin.resolve.calls.renderToText.<anonymous>[LocalVariableDescriptor]

'argumentText' @ [154:49] ==> val argumentText: String defined in org.jetbrains.kotlin.resolve.calls.renderToText.<anonymous>[LocalVariableDescriptor]

