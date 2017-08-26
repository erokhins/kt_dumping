'AbstractAnnotationDescriptorResolveTest' @ [35:59] ==> public constructor AbstractAnnotationDescriptorResolveTest() defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationDescriptorResolveTest[JavaClassConstructorDescriptor]

'doTest' @ [39:9] ==> private final fun doTest(path: String, getValueToTest: (VariableDescriptor, BindingContext) -> String): Unit defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest[SimpleFunctionDescriptorImpl]

'path' @ [39:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doConstantTest[ValueParameterDescriptorImpl]

'property' @ [41:39] ==> value-parameter property: VariableDescriptor defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doConstantTest.<anonymous>[ValueParameterDescriptorImpl]

'compileTimeInitializer' @ [41:48] ==> public final val VariableDescriptor.compileTimeInitializer: ConstantValue<*>?[MyPropertyDescriptor]

'if (compileTimeConstant is StringValue) {
                "\\\"${compileTimeConstant.value}\\\""
            } else {
                "$compileTimeConstant"
            }' @ [42:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'compileTimeConstant' @ [42:17] ==> val compileTimeConstant: ConstantValue<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doConstantTest.<anonymous>[LocalVariableDescriptor]

'compileTimeConstant' @ [43:24] ==> val compileTimeConstant: ConstantValue<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doConstantTest.<anonymous>[LocalVariableDescriptor]

'value' @ [43:44] ==> public open val value: String defined in org.jetbrains.kotlin.resolve.constants.StringValue[DeserializedPropertyDescriptor]

'compileTimeConstant' @ [45:19] ==> val compileTimeConstant: ConstantValue<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doConstantTest.<anonymous>[LocalVariableDescriptor]

'doTest' @ [52:9] ==> private final fun doTest(path: String, getValueToTest: (VariableDescriptor, BindingContext) -> String): Unit defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest[SimpleFunctionDescriptorImpl]

'path' @ [52:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doIsPureTest[ValueParameterDescriptorImpl]

'evaluateInitializer' @ [54:13] ==> private final fun evaluateInitializer(context: BindingContext, property: VariableDescriptor): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest[SimpleFunctionDescriptorImpl]

'context' @ [54:33] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doIsPureTest.<anonymous>[ValueParameterDescriptorImpl]

'property' @ [54:42] ==> value-parameter property: VariableDescriptor defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doIsPureTest.<anonymous>[ValueParameterDescriptorImpl]

'isPure' @ [54:53] ==> public open val isPure: Boolean defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedPropertyDescriptor]

'toString' @ [54:60] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'doTest' @ [60:9] ==> private final fun doTest(path: String, getValueToTest: (VariableDescriptor, BindingContext) -> String): Unit defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest[SimpleFunctionDescriptorImpl]

'path' @ [60:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doUsesVariableAsConstantTest[ValueParameterDescriptorImpl]

'evaluateInitializer' @ [62:13] ==> private final fun evaluateInitializer(context: BindingContext, property: VariableDescriptor): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest[SimpleFunctionDescriptorImpl]

'context' @ [62:33] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doUsesVariableAsConstantTest.<anonymous>[ValueParameterDescriptorImpl]

'property' @ [62:42] ==> value-parameter property: VariableDescriptor defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doUsesVariableAsConstantTest.<anonymous>[ValueParameterDescriptorImpl]

'usesVariableAsConstant' @ [62:53] ==> public open val usesVariableAsConstant: Boolean defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedPropertyDescriptor]

'toString' @ [62:76] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'DescriptorToSourceUtils' @ [67:35] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [67:59] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'property' @ [67:83] ==> value-parameter property: VariableDescriptor defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.evaluateInitializer[ValueParameterDescriptorImpl]

'ConstantExpressionEvaluator' @ [68:35] ==> public constructor ConstantExpressionEvaluator(builtIns: KotlinBuiltIns, languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[DeserializedClassConstructorDescriptor]

'property' @ [68:63] ==> value-parameter property: VariableDescriptor defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.evaluateInitializer[ValueParameterDescriptorImpl]

'builtIns' @ [68:72] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'DEFAULT' @ [68:110] ==> @field:JvmField public final val DEFAULT: LanguageVersionSettingsImpl defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl.Companion[DeserializedPropertyDescriptor]

'evaluateExpression' @ [68:119] ==> public final fun evaluateExpression(expression: KtExpression, trace: BindingTrace, expectedType: KotlinType? = ...): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[DeserializedSimpleFunctionDescriptor]

'propertyDeclaration' @ [69:17] ==> val propertyDeclaration: KtProperty defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.evaluateInitializer[LocalVariableDescriptor]

'initializer' @ [69:37] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'DelegatingBindingTrace' @ [70:17] ==> public constructor DelegatingBindingTrace(parentContext: BindingContext, name: String, withParentDiagnostics: Boolean = ..., filter: BindingTraceFilter = ..., allowSliceRewrite: Boolean = ...) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[DeserializedClassConstructorDescriptor]

'context' @ [70:40] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.evaluateInitializer[ValueParameterDescriptorImpl]

'property' @ [71:17] ==> value-parameter property: VariableDescriptor defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.evaluateInitializer[ValueParameterDescriptorImpl]

'type' @ [71:26] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'compileTimeConstant' @ [73:16] ==> val compileTimeConstant: CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.evaluateInitializer[LocalVariableDescriptor]

'File' @ [77:22] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [77:27] ==> value-parameter path: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[ValueParameterDescriptorImpl]

'loadFile' @ [78:33] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'myFile' @ [78:42] ==> val myFile: File defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'getPackage' @ [79:27] ==> @NotNull protected/*protected and package*/ open fun getPackage(@NotNull content: String): PackageFragmentDescriptor defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest[JavaMethodDescriptor]

'fileText' @ [79:38] ==> val fileText: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'getObjectsToTest' @ [81:33] ==> public final fun getObjectsToTest(fileText: String): List<String> defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest[SimpleFunctionDescriptorImpl]

'fileText' @ [81:50] ==> val fileText: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'arrayListOf' @ [83:30] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Pair<String, String>> /* = ArrayList<Pair<String, String>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>

'propertiesForTest' @ [85:30] ==> val propertiesForTest: List<String> defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'propertyName' @ [86:52] ==> val propertyName: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'findStringWithPrefixes' @ [87:50] ==> @Nullable public open fun findStringWithPrefixes(fileText: (String..String?), vararg prefixes: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [87:73] ==> val fileText: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'expectedPropertyPrefix' @ [87:83] ==> val expectedPropertyPrefix: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'assertNotNull' @ [88:13] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationDescriptorResolveTest[JavaMethodDescriptor]

'expected' @ [88:27] ==> val expected: String? defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'expectedPropertyPrefix' @ [88:74] ==> val expectedPropertyPrefix: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'?:' @ [90:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: VariableDescriptor?, right: VariableDescriptor): VariableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> VariableDescriptor

'getPropertyDescriptor' @ [90:68] ==> @Nullable protected/*protected static*/ open fun getPropertyDescriptor(@NotNull packageView: PackageFragmentDescriptor, @NotNull name: String, failOnMissing: Boolean): PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationDescriptorResolveTest[JavaMethodDescriptor]

'packageView' @ [90:90] ==> val packageView: PackageFragmentDescriptor defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'propertyName' @ [90:103] ==> val propertyName: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'getLocalVarDescriptor' @ [91:56] ==> @NotNull protected/*protected static*/ open fun getLocalVarDescriptor(@NotNull context: BindingContext, @NotNull name: String): VariableDescriptor defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationDescriptorResolveTest[JavaMethodDescriptor]

'context' @ [91:78] ==> protected/*protected and package*/ final var context: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest[JavaPropertyDescriptor]

'propertyName' @ [91:89] ==> val propertyName: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'invoke' @ [93:32] ==> public abstract operator fun invoke(p1: VariableDescriptor, p2: BindingContext): String defined in kotlin.Function2[FunctionInvokeDescriptor]

'property' @ [93:47] ==> val property: VariableDescriptor defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'context' @ [93:57] ==> protected/*protected and package*/ final var context: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest[JavaPropertyDescriptor]

'expectedActual' @ [94:13] ==> val expectedActual: ArrayList<Pair<String, String>> /* = ArrayList<Pair<String, String>> */ defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'add' @ [94:28] ==> public open fun add(element: Pair<String, String>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expectedPropertyPrefix' @ [94:32] ==> val expectedPropertyPrefix: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'expected' @ [94:57] ==> val expected: String? defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'expectedPropertyPrefix' @ [94:71] ==> val expectedPropertyPrefix: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'testedObject' @ [94:96] ==> val testedObject: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'fileText' @ [97:30] ==> val fileText: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'component1' @ [98:15] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [98:25] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'expectedActual' @ [98:36] ==> val expectedActual: ArrayList<Pair<String, String>> /* = ArrayList<Pair<String, String>> */ defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'assert' @ [99:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'actualFileText' @ [99:20] ==> var actualFileText: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'contains' @ [99:35] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expected' @ [99:44] ==> val expected: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'expected' @ [99:84] ==> val expected: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'actualFileText' @ [100:13] ==> var actualFileText: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'actualFileText' @ [100:30] ==> var actualFileText: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'replace' @ [100:45] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expected' @ [100:53] ==> val expected: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'actual' @ [100:63] ==> val actual: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'assertEqualsToFile' @ [103:25] ==> public open fun assertEqualsToFile(@NotNull expectedFile: File, @NotNull actual: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'myFile' @ [103:44] ==> val myFile: File defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'actualFileText' @ [103:52] ==> var actualFileText: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.doTest[LocalVariableDescriptor]

'findListWithPrefixes' @ [107:38] ==> @NotNull public open fun findListWithPrefixes(@NotNull fileText: String, @NotNull vararg prefixes: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [107:59] ==> value-parameter fileText: String defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.getObjectsToTest[ValueParameterDescriptorImpl]

'map' @ [107:79] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> String

'pattern' @ [108:27] ==> public final val pattern: (Pattern..Pattern?) defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.Companion[PropertyDescriptorImpl]

'matcher' @ [108:35] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'it' @ [108:43] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.getObjectsToTest.<anonymous>[ValueParameterDescriptorImpl]

'if (matcher.find()) {
                matcher.group(0) ?: "Couldn't match tested object $it"
            } else "Couldn't match tested object $it"' @ [109:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'matcher' @ [109:17] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.getObjectsToTest.<anonymous>[LocalVariableDescriptor]

'find' @ [109:25] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [110:17] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.getObjectsToTest.<anonymous>[LocalVariableDescriptor]

'group' @ [110:25] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'it' @ [110:68] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.getObjectsToTest.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [111:51] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.resolve.constants.evaluate.AbstractCompileTimeConstantEvaluatorTest.getObjectsToTest.<anonymous>[ValueParameterDescriptorImpl]

'compile' @ [116:31] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

