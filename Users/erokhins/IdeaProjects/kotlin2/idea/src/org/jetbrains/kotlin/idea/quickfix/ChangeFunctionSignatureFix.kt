'KotlinQuickFixAction<PsiElement>' @ [50:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> PsiElement

'element' @ [50:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.<init>[ValueParameterDescriptorImpl]

'FAMILY_NAME' @ [51:36] ==> public final val FAMILY_NAME: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion[PropertyDescriptorImpl]

'!' @ [56:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'super' @ [56:14] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [56:20] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [56:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [56:41] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [56:49] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.isAvailable[ValueParameterDescriptorImpl]

'DescriptorToSourceUtilsIde' @ [58:28] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAllDeclarations' @ [58:55] ==> public final fun getAllDeclarations(project: Project, targetDescriptor: DeclarationDescriptor, builtInsSearchScope: GlobalSearchScope? = ...): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [58:74] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.isAvailable[ValueParameterDescriptorImpl]

'functionDescriptor' @ [58:83] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix[PropertyDescriptorImpl]

'declarations' @ [59:16] ==> val declarations: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.isAvailable[LocalVariableDescriptor]

'isNotEmpty' @ [59:29] ==> @InlineOnly public inline fun <T> Collection<PsiElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'declarations' @ [59:45] ==> val declarations: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.isAvailable[LocalVariableDescriptor]

'all' @ [59:58] ==> public inline fun <T> Iterable<PsiElement>.all(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [59:64] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.isAvailable.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [59:67] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'it' @ [59:78] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.isAvailable.<anonymous>[ValueParameterDescriptorImpl]

'canRefactor' @ [59:81] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'argument' @ [63:28] ==> value-parameter argument: ValueArgument defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.getNewArgumentName[ValueParameterDescriptorImpl]

'getArgumentName' @ [63:37] ==> public abstract fun getArgumentName(): ValueArgumentName? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'argument' @ [64:26] ==> value-parameter argument: ValueArgument defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.getNewArgumentName[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [64:35] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'when {
            argumentName != null -> KotlinNameSuggester.suggestNameByName(argumentName.asName.asString(), validator)
            expression != null -> {
                val bindingContext = expression.analyze(BodyResolveMode.PARTIAL)
                KotlinNameSuggester.suggestNamesByExpressionAndType(expression, null, bindingContext, validator, "param").first()
            }
            else -> KotlinNameSuggester.suggestNameByName("param", validator)
        }' @ [66:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'argumentName' @ [67:13] ==> val argumentName: ValueArgumentName? defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.getNewArgumentName[LocalVariableDescriptor]

'KotlinNameSuggester' @ [67:37] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNameByName' @ [67:57] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'argumentName' @ [67:75] ==> val argumentName: ValueArgumentName? defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.getNewArgumentName[LocalVariableDescriptor]

'asName' @ [67:88] ==> public abstract val asName: Name defined in org.jetbrains.kotlin.psi.ValueArgumentName[DeserializedPropertyDescriptor]

'asString' @ [67:95] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'validator' @ [67:107] ==> value-parameter validator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.getNewArgumentName[ValueParameterDescriptorImpl]

'expression' @ [68:13] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.getNewArgumentName[LocalVariableDescriptor]

'expression' @ [69:38] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.getNewArgumentName[LocalVariableDescriptor]

'analyze' @ [69:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [69:73] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'KotlinNameSuggester' @ [70:17] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesByExpressionAndType' @ [70:37] ==> public final fun suggestNamesByExpressionAndType(expression: KtExpression, type: KotlinType?, bindingContext: BindingContext?, validator: (String) -> Boolean, defaultName: String?): Collection<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'expression' @ [70:69] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.getNewArgumentName[LocalVariableDescriptor]

'bindingContext' @ [70:87] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.getNewArgumentName[LocalVariableDescriptor]

'validator' @ [70:103] ==> value-parameter validator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.getNewArgumentName[ValueParameterDescriptorImpl]

'first' @ [70:123] ==> public fun <T> Iterable<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'KotlinNameSuggester' @ [72:21] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNameByName' @ [72:41] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'validator' @ [72:68] ==> value-parameter validator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.getNewArgumentName[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactoryWithDelegate<KtCallElement, CallableDescriptor>' @ [76:24] ==> public constructor KotlinSingleIntentionActionFactoryWithDelegate<E : KtElement, D : Any>(actionPriority: IntentionActionPriority = ...) defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactoryWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtCallElement
    <D : Any> -> CallableDescriptor

'diagnostic' @ [78:20] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [78:31] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [78:42] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'cast' @ [82:38] ==> @NotNull public open fun <D : (Diagnostic..Diagnostic?)> cast(@NotNull p0: Diagnostic, @NotNull vararg p1: (DiagnosticFactory<out (DiagnosticWithParameters1<out (PsiElement..PsiElement?), out (CallableDescriptor..CallableDescriptor?)>..DiagnosticWithParameters1<out (PsiElement..PsiElement?), out (CallableDescriptor..CallableDescriptor?)>?)>..DiagnosticFactory<out (DiagnosticWithParameters1<out (PsiElement..PsiElement?), out (CallableDescriptor..CallableDescriptor?)>..DiagnosticWithParameters1<out (PsiElement..PsiElement?), out (CallableDescriptor..CallableDescriptor?)>?)>?)): DiagnosticWithParameters1<out (PsiElement..PsiElement?), out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory[JavaMethodDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> DiagnosticWithParameters1<out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>

'diagnostic' @ [82:43] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.extractFixData[ValueParameterDescriptorImpl]

'TOO_MANY_ARGUMENTS' @ [82:62] ==> public final val TOO_MANY_ARGUMENTS: (DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'NO_VALUE_FOR_PARAMETER' @ [82:89] ==> public final val NO_VALUE_FOR_PARAMETER: (DiagnosticFactory1<(KtElement..KtElement?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..DiagnosticFactory1<(KtElement..KtElement?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'a' @ [82:113] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<out (PsiElement..PsiElement?), out (CallableDescriptor..CallableDescriptor?)>.a: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'data' @ [86:38] ==> value-parameter data: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[ValueParameterDescriptorImpl]

'data' @ [87:42] ==> value-parameter data: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[ValueParameterDescriptorImpl]

'containingDeclaration' @ [87:78] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'functionDescriptor' @ [90:17] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[LocalVariableDescriptor]

'kind' @ [90:36] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'SYNTHESIZED' @ [90:44] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'if (data is ValueParameterDescriptor) {
                return RemoveParameterFix(originalElement, functionDescriptor, data)
            }
            else {
                val parameters = functionDescriptor.valueParameters
                val arguments = originalElement.valueArguments

                if (arguments.size > parameters.size) {
                    val bindingContext = originalElement.analyze()
                    val call = originalElement.getCall(bindingContext) ?: return null
                    val argumentToParameter = call.mapArgumentsToParameters(functionDescriptor)
                    val hasTypeMismatches = argumentToParameter.any {
                        val (argument, parameter) = it
                        val argumentType = argument.getArgumentExpression()?.let { bindingContext.getType(it) }
                        argumentType == null || !KotlinTypeChecker.DEFAULT.isSubtypeOf(argumentType, parameter.type)
                    }
                    return AddFunctionParametersFix(originalElement, functionDescriptor, hasTypeMismatches)
                }
            }' @ [92:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'data' @ [92:17] ==> value-parameter data: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[ValueParameterDescriptorImpl]

'RemoveParameterFix' @ [93:24] ==> public constructor RemoveParameterFix(element: PsiElement, functionDescriptor: FunctionDescriptor, parameterToRemove: ValueParameterDescriptor) defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.RemoveParameterFix[ClassConstructorDescriptorImpl]

'originalElement' @ [93:43] ==> value-parameter originalElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[ValueParameterDescriptorImpl]

'functionDescriptor' @ [93:60] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[LocalVariableDescriptor]

'data' @ [93:80] ==> value-parameter data: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[ValueParameterDescriptorImpl]

'functionDescriptor' @ [96:34] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[LocalVariableDescriptor]

'valueParameters' @ [96:53] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'originalElement' @ [97:33] ==> value-parameter originalElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[ValueParameterDescriptorImpl]

'valueArguments' @ [97:49] ==> public final val KtCallElement.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'arguments' @ [99:21] ==> val arguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[LocalVariableDescriptor]

'size' @ [99:31] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parameters' @ [99:38] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[LocalVariableDescriptor]

'size' @ [99:49] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'originalElement' @ [100:42] ==> value-parameter originalElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[ValueParameterDescriptorImpl]

'analyze' @ [100:58] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'originalElement' @ [101:32] ==> value-parameter originalElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[ValueParameterDescriptorImpl]

'getCall' @ [101:48] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [101:56] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[LocalVariableDescriptor]

'call' @ [102:47] ==> val call: Call defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[LocalVariableDescriptor]

'mapArgumentsToParameters' @ [102:52] ==> public fun Call.mapArgumentsToParameters(targetDescriptor: CallableDescriptor): Map<ValueArgument, ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [102:77] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[LocalVariableDescriptor]

'argumentToParameter' @ [103:45] ==> val argumentToParameter: Map<ValueArgument, ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[LocalVariableDescriptor]

'any' @ [103:65] ==> public inline fun <K, V> Map<out ValueArgument, ValueParameterDescriptor>.any(predicate: (Map.Entry<ValueArgument, ValueParameterDescriptor>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueArgument
    <V> -> ValueParameterDescriptor

'component1' @ [104:30] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueArgument, ValueParameterDescriptor>.component1(): ValueArgument defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueArgument
    <V> -> ValueParameterDescriptor

'component2' @ [104:40] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueArgument, ValueParameterDescriptor>.component2(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueArgument
    <V> -> ValueParameterDescriptor

'it' @ [104:53] ==> value-parameter it: Map.Entry<ValueArgument, ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix.<anonymous>[ValueParameterDescriptorImpl]

'argument' @ [105:44] ==> val argument: ValueArgument defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix.<anonymous>[LocalVariableDescriptor]

'getArgumentExpression' @ [105:53] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'let' @ [105:78] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'bindingContext' @ [105:84] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[LocalVariableDescriptor]

'getType' @ [105:99] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'it' @ [105:107] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'argumentType' @ [106:25] ==> val argumentType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix.<anonymous>[LocalVariableDescriptor]

'!' @ [106:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [106:68] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [106:76] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'argumentType' @ [106:88] ==> val argumentType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix.<anonymous>[LocalVariableDescriptor]

'parameter' @ [106:102] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix.<anonymous>[LocalVariableDescriptor]

'type' @ [106:112] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'AddFunctionParametersFix' @ [108:28] ==> public constructor AddFunctionParametersFix(callElement: KtCallElement, functionDescriptor: FunctionDescriptor, hasTypeMismatches: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix[ClassConstructorDescriptorImpl]

'originalElement' @ [108:53] ==> value-parameter originalElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[ValueParameterDescriptorImpl]

'functionDescriptor' @ [108:70] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[LocalVariableDescriptor]

'hasTypeMismatches' @ [108:90] ==> val hasTypeMismatches: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.createFix[LocalVariableDescriptor]

'ChangeFunctionSignatureFix' @ [119:13] ==> public constructor ChangeFunctionSignatureFix(element: PsiElement, functionDescriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix[ClassConstructorDescriptorImpl]

'element' @ [119:40] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.RemoveParameterFix.<init>[ValueParameterDescriptorImpl]

'functionDescriptor' @ [119:49] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.RemoveParameterFix.<init>[ValueParameterDescriptorImpl]

'parameterToRemove' @ [121:59] ==> private final val parameterToRemove: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.RemoveParameterFix[PropertyDescriptorImpl]

'name' @ [121:77] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [121:82] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'runRemoveParameter' @ [124:17] ==> public final fun runRemoveParameter(parameterDescriptor: ValueParameterDescriptor, context: PsiElement): Unit defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion[SimpleFunctionDescriptorImpl]

'parameterToRemove' @ [124:36] ==> private final val parameterToRemove: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.RemoveParameterFix[PropertyDescriptorImpl]

'element' @ [124:55] ==> protected final val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.RemoveParameterFix[PropertyDescriptorImpl]

'parameterDescriptor' @ [131:38] ==> value-parameter parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.runRemoveParameter[ValueParameterDescriptorImpl]

'containingDeclaration' @ [131:58] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'runChangeSignature' @ [132:13] ==> public fun runChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'context' @ [133:21] ==> value-parameter context: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.runRemoveParameter[ValueParameterDescriptorImpl]

'project' @ [133:29] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'functionDescriptor' @ [134:21] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.runRemoveParameter[LocalVariableDescriptor]

'originalDescriptor' @ [137:36] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.runRemoveParameter.<no name provided>.configure[ValueParameterDescriptorImpl]

'modify' @ [137:55] ==> public fun KotlinMethodDescriptor.modify(action: (KotlinMutableMethodDescriptor) -> Unit): KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature[SimpleFunctionDescriptorImpl]

'if (descriptor.receiver != null) parameterDescriptor.index + 1 else parameterDescriptor.index' @ [138:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'descriptor' @ [138:49] ==> value-parameter descriptor: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.runRemoveParameter.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'receiver' @ [138:60] ==> public open var receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[PropertyDescriptorImpl]

'parameterDescriptor' @ [138:78] ==> value-parameter parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.runRemoveParameter[ValueParameterDescriptorImpl]

'index' @ [138:98] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'parameterDescriptor' @ [138:113] ==> value-parameter parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.runRemoveParameter[ValueParameterDescriptorImpl]

'index' @ [138:133] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [139:33] ==> value-parameter descriptor: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.runRemoveParameter.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'removeParameter' @ [139:44] ==> public final fun removeParameter(index: Int): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[SimpleFunctionDescriptorImpl]

'index' @ [139:60] ==> val index: Int defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.runRemoveParameter.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'context' @ [146:21] ==> value-parameter context: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.runRemoveParameter[ValueParameterDescriptorImpl]

'parameterDescriptor' @ [147:42] ==> value-parameter parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix.Companion.runRemoveParameter[ValueParameterDescriptorImpl]

'name' @ [147:62] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [147:67] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

