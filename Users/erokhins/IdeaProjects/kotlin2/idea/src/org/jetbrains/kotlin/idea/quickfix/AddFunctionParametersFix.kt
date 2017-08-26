'ChangeFunctionSignatureFix' @ [42:51] ==> public constructor ChangeFunctionSignatureFix(element: PsiElement, functionDescriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix[ClassConstructorDescriptorImpl]

'callElement' @ [42:78] ==> value-parameter callElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.<init>[ValueParameterDescriptorImpl]

'functionDescriptor' @ [42:91] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.<init>[ValueParameterDescriptorImpl]

'element' @ [44:17] ==> protected final val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'ArrayList' @ [46:34] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'callElement' @ [49:27] ==> private final val callElement: KtCallElement? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'functionDescriptor' @ [51:26] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'valueParameters' @ [51:45] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'callElement' @ [52:25] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getText[LocalVariableDescriptor]

'valueArguments' @ [52:37] ==> public final val KtCallElement.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'arguments' @ [53:32] ==> val arguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getText[LocalVariableDescriptor]

'size' @ [53:42] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parameters' @ [53:49] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getText[LocalVariableDescriptor]

'size' @ [53:60] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'assert' @ [54:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'newParametersCnt' @ [54:16] ==> val newParametersCnt: Int defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getText[LocalVariableDescriptor]

'if (newParametersCnt > 1) "s" else ""' @ [56:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'newParametersCnt' @ [56:33] ==> val newParametersCnt: Int defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getText[LocalVariableDescriptor]

'if (isConstructor()) {
            val className = functionDescriptor.containingDeclaration.name.asString()
            "constructor '$className'"
        }
        else {
            val functionName = functionDescriptor.name.asString()
            "function '$functionName'"
        }' @ [58:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isConstructor' @ [58:39] ==> private final fun isConstructor(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [59:29] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'containingDeclaration' @ [59:48] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'name' @ [59:70] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [59:75] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'className' @ [60:28] ==> val className: String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getText[LocalVariableDescriptor]

'functionDescriptor' @ [63:32] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'name' @ [63:51] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [63:56] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'functionName' @ [64:25] ==> val functionName: String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getText[LocalVariableDescriptor]

'if (hasTypeMismatches)
            "Change the signature of $callableDescription"
        else
            "Add parameter$subjectSuffix to $callableDescription"' @ [67:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'hasTypeMismatches' @ [67:20] ==> private final val hasTypeMismatches: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'callableDescription' @ [68:39] ==> val callableDescription: String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getText[LocalVariableDescriptor]

'subjectSuffix' @ [70:28] ==> val subjectSuffix: String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getText[LocalVariableDescriptor]

'callableDescription' @ [70:46] ==> val callableDescription: String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getText[LocalVariableDescriptor]

'callElement' @ [74:27] ==> private final val callElement: KtCallElement? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'!' @ [75:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'super' @ [75:14] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [75:20] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix[SimpleFunctionDescriptorImpl]

'project' @ [75:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [75:41] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [75:49] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.isAvailable[ValueParameterDescriptorImpl]

'callElement' @ [78:32] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.isAvailable[LocalVariableDescriptor]

'valueArguments' @ [78:44] ==> public final val KtCallElement.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'size' @ [78:59] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'functionDescriptor' @ [78:66] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'valueParameters' @ [78:85] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [78:101] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'newParametersCnt' @ [79:16] ==> val newParametersCnt: Int defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.isAvailable[LocalVariableDescriptor]

'callElement' @ [83:27] ==> private final val callElement: KtCallElement? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'runChangeSignature' @ [84:9] ==> public fun runChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'project' @ [84:28] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.invoke[ValueParameterDescriptorImpl]

'functionDescriptor' @ [84:37] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'addParameterConfiguration' @ [84:57] ==> private final fun addParameterConfiguration(): KotlinChangeSignatureConfiguration defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[SimpleFunctionDescriptorImpl]

'callElement' @ [84:86] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.invoke[LocalVariableDescriptor]

'text' @ [84:99] ==> public final val AddFunctionParametersFix.text: String[MyPropertyDescriptor]

'originalDescriptor' @ [90:24] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure[ValueParameterDescriptorImpl]

'modify' @ [90:43] ==> public fun KotlinMethodDescriptor.modify(action: (KotlinMutableMethodDescriptor) -> Unit): KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature[SimpleFunctionDescriptorImpl]

'callElement' @ [91:39] ==> private final val callElement: KtCallElement? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'functionDescriptor' @ [92:38] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'valueParameters' @ [92:57] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'callElement' @ [93:37] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'valueArguments' @ [93:49] ==> public final val KtCallElement.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'CollectingNameValidator' @ [94:37] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'arguments' @ [96:31] ==> val arguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'indices' @ [96:41] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'arguments' @ [97:40] ==> val arguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'i' @ [97:50] ==> val i: Int defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'argument' @ [98:42] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'getArgumentExpression' @ [98:51] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'if (i < parameters.size) {
                            validator.addName(parameters[i].name.asString())
                            val argumentType = expression?.let {
                                val bindingContext = it.analyze()
                                bindingContext[BindingContext.SMARTCAST, it]?.defaultType ?: bindingContext.getType(it)
                            }
                            val parameterType = parameters[i].type

                            if (argumentType != null && !KotlinTypeChecker.DEFAULT.isSubtypeOf(argumentType, parameterType)) {
                                it.parameters[i].currentTypeInfo = KotlinTypeInfo(false, argumentType)
                                typesToShorten.add(argumentType)
                            }
                        }
                        else {
                            val parameterInfo = getNewParameterInfo(
                                    originalDescriptor.baseDescriptor as FunctionDescriptor,
                                    argument,
                                    validator
                            )
                            parameterInfo.originalTypeInfo.type?.let { typesToShorten.add(it) }

                            if (expression != null) {
                                parameterInfo.defaultValueForCall = expression
                            }

                            it.addParameter(parameterInfo)
                        }' @ [100:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'i' @ [100:29] ==> val i: Int defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'parameters' @ [100:33] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'size' @ [100:44] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'validator' @ [101:29] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'addName' @ [101:39] ==> public final fun addName(name: String): Unit defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedSimpleFunctionDescriptor]

'parameters' @ [101:47] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'i' @ [101:58] ==> val i: Int defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'name' @ [101:61] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [101:66] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'expression' @ [102:48] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'let' @ [102:60] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'it' @ [103:54] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [103:57] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [104:33] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>.<anonymous>[LocalVariableDescriptor]

'SMARTCAST' @ [104:63] ==> public final val SMARTCAST: (WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>..WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [104:74] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [104:79] ==> public abstract val defaultType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.ExplicitSmartCasts[DeserializedPropertyDescriptor]

'bindingContext' @ [104:94] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getType' @ [104:109] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'it' @ [104:117] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [106:49] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'i' @ [106:60] ==> val i: Int defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'type' @ [106:63] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'argumentType' @ [108:33] ==> val argumentType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'!' @ [108:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [108:76] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [108:84] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'argumentType' @ [108:96] ==> val argumentType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'parameterType' @ [108:110] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'it' @ [109:33] ==> value-parameter it: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [109:36] ==> public final val KotlinMutableMethodDescriptor.parameters: (MutableList<(KotlinParameterInfo..KotlinParameterInfo?)>..List<(KotlinParameterInfo..KotlinParameterInfo?)>?)[MyPropertyDescriptor]

'i' @ [109:47] ==> val i: Int defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'currentTypeInfo' @ [109:50] ==> public final var currentTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'KotlinTypeInfo' @ [109:68] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'argumentType' @ [109:90] ==> val argumentType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'typesToShorten' @ [110:33] ==> private final val typesToShorten: ArrayList<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'add' @ [110:48] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'argumentType' @ [110:52] ==> val argumentType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'getNewParameterInfo' @ [114:49] ==> private final fun getNewParameterInfo(functionDescriptor: FunctionDescriptor, argument: ValueArgument, validator: (String) -> Boolean): KotlinParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[SimpleFunctionDescriptorImpl]

'originalDescriptor' @ [115:37] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure[ValueParameterDescriptorImpl]

'baseDescriptor' @ [115:56] ==> public abstract val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'argument' @ [116:37] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'validator' @ [117:37] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'parameterInfo' @ [119:29] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'originalTypeInfo' @ [119:43] ==> public final val originalTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'type' @ [119:60] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'let' @ [119:66] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Boolean

'typesToShorten' @ [119:72] ==> private final val typesToShorten: ArrayList<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'add' @ [119:87] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [119:91] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [121:33] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'parameterInfo' @ [122:33] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'defaultValueForCall' @ [122:47] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'expression' @ [122:69] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'it' @ [125:29] ==> value-parameter it: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'addParameter' @ [125:32] ==> public final fun addParameter(parameter: KotlinParameterInfo): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[SimpleFunctionDescriptorImpl]

'parameterInfo' @ [125:45] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'affectedFunctions' @ [132:36] ==> value-parameter affectedFunctions: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.performSilently[ValueParameterDescriptorImpl]

'singleOrNull' @ [132:54] ==> public fun <T> Iterable<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'!' @ [133:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasTypeMismatches' @ [133:25] ==> private final val hasTypeMismatches: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'!' @ [133:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isConstructor' @ [133:47] ==> private final fun isConstructor(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[SimpleFunctionDescriptorImpl]

'!' @ [133:66] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasOtherUsages' @ [133:67] ==> private final fun hasOtherUsages(function: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[SimpleFunctionDescriptorImpl]

'onlyFunction' @ [133:82] ==> val onlyFunction: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.addParameterConfiguration.<no name provided>.performSilently[LocalVariableDescriptor]

'getNewArgumentName' @ [143:20] ==> protected final fun getNewArgumentName(argument: ValueArgument, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[SimpleFunctionDescriptorImpl]

'argument' @ [143:39] ==> value-parameter argument: ValueArgument defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getNewParameterInfo[ValueParameterDescriptorImpl]

'validator' @ [143:49] ==> value-parameter validator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getNewParameterInfo[ValueParameterDescriptorImpl]

'argument' @ [144:26] ==> value-parameter argument: ValueArgument defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getNewParameterInfo[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [144:35] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'expression' @ [145:20] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getNewParameterInfo[LocalVariableDescriptor]

'let' @ [145:32] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'it' @ [145:38] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getNewParameterInfo.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [145:41] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getType' @ [145:51] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'it' @ [145:59] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getNewParameterInfo.<anonymous>[ValueParameterDescriptorImpl]

'functionDescriptor' @ [145:68] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getNewParameterInfo[ValueParameterDescriptorImpl]

'builtIns' @ [145:87] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'nullableAnyType' @ [145:96] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'KotlinParameterInfo' @ [146:16] ==> @JvmOverloads public constructor KotlinParameterInfo(callableDescriptor: CallableDescriptor, originalIndex: Int = ..., name: String, originalTypeInfo: KotlinTypeInfo = ..., defaultValueForParameter: KtExpression? = ..., defaultValueForCall: KtExpression? = ..., valOrVar: KotlinValVar = ..., modifierList: KtModifierList? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[ClassConstructorDescriptorImpl]

'functionDescriptor' @ [146:36] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getNewParameterInfo[ValueParameterDescriptorImpl]

'-' @ [146:56] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'name' @ [146:60] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getNewParameterInfo[LocalVariableDescriptor]

'KotlinTypeInfo' @ [146:66] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'apply' @ [147:18] ==> @InlineOnly public inline fun <T> KotlinParameterInfo.apply(block: KotlinParameterInfo.() -> Unit): KotlinParameterInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo

'currentTypeInfo' @ [147:26] ==> public final var currentTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'KotlinTypeInfo' @ [147:44] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'type' @ [147:66] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.getNewParameterInfo[LocalVariableDescriptor]

'search' @ [151:33] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'function' @ [151:40] ==> value-parameter function: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.hasOtherUsages[ValueParameterDescriptorImpl]

'any' @ [151:50] ==> public inline fun <T> Iterable<(PsiReference..PsiReference?)>.any(predicate: ((PsiReference..PsiReference?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'it' @ [152:24] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.hasOtherUsages.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [152:27] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfType' @ [152:35] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'call' @ [153:13] ==> val call: KtCallElement? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.hasOtherUsages.<anonymous>[LocalVariableDescriptor]

'callElement' @ [153:29] ==> private final val callElement: KtCallElement? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

'call' @ [153:44] ==> val call: KtCallElement? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix.hasOtherUsages.<anonymous>[LocalVariableDescriptor]

'functionDescriptor' @ [157:35] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[PropertyDescriptorImpl]

