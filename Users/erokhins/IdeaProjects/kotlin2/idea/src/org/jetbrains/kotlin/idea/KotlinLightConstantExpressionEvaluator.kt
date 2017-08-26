'if (constantValue is ArrayValue) {
            val items = constantValue.value.map { evalConstantValue(it) }
            items.singleOrNull() ?: items
        }
        else constantValue.value' @ [36:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'constantValue' @ [36:20] ==> value-parameter constantValue: ConstantValue<*> defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.evalConstantValue[ValueParameterDescriptorImpl]

'constantValue' @ [37:25] ==> value-parameter constantValue: ConstantValue<*> defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.evalConstantValue[ValueParameterDescriptorImpl]

'value' @ [37:39] ==> public open val value: List<ConstantValue<*>> defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[DeserializedPropertyDescriptor]

'map' @ [37:45] ==> public inline fun <T, R> Iterable<ConstantValue<*>>.map(transform: (ConstantValue<*>) -> Any?): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstantValue<*>
    <R> -> Any?

'evalConstantValue' @ [37:51] ==> private final fun evalConstantValue(constantValue: ConstantValue<*>): Any? defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator[SimpleFunctionDescriptorImpl]

'it' @ [37:69] ==> value-parameter it: ConstantValue<*> defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.evalConstantValue.<anonymous>[ValueParameterDescriptorImpl]

'items' @ [38:13] ==> val items: List<Any?> defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.evalConstantValue[LocalVariableDescriptor]

'singleOrNull' @ [38:19] ==> public fun <T> List<Any?>.singleOrNull(): Any? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'items' @ [38:37] ==> val items: List<Any?> defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.evalConstantValue[LocalVariableDescriptor]

'constantValue' @ [40:14] ==> value-parameter constantValue: ConstantValue<*> defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.evalConstantValue[ValueParameterDescriptorImpl]

'value' @ [40:28] ==> public open val value: Any? defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[DeserializedPropertyDescriptor]

'computeExpression' @ [44:16] ==> public open fun computeExpression(expression: PsiElement, throwExceptionOnOverflow: Boolean, auxEvaluator: PsiConstantEvaluationHelper.AuxEvaluator?): Any? defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator[SimpleFunctionDescriptorImpl]

'expression' @ [44:34] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeConstantExpression[ValueParameterDescriptorImpl]

'throwExceptionOnOverflow' @ [44:46] ==> value-parameter throwExceptionOnOverflow: Boolean defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeConstantExpression[ValueParameterDescriptorImpl]

'expression' @ [52:13] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[ValueParameterDescriptorImpl]

'expression' @ [53:35] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[ValueParameterDescriptorImpl]

'originalExpression' @ [53:46] ==> public final val originalExpression: PsiElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightAnnotationForSourceEntry.LightExpressionValue[DeserializedPropertyDescriptor]

'when (expressionToCompute) {
            is KtExpression -> {
                val resolutionFacade = expressionToCompute.getResolutionFacade()
                val evaluator = FrontendConstantExpressionEvaluator(resolutionFacade.moduleDescriptor.builtIns,
                                                                    expressionToCompute.languageVersionSettings)
                val evaluatorTrace = DelegatingBindingTrace(resolutionFacade.analyze(expressionToCompute), "Evaluating annotation argument")

                val constant = evaluator.evaluateExpression(expressionToCompute, evaluatorTrace) ?: return null
                if (constant.isError) return null
                evalConstantValue(constant.toConstantValue(TypeUtils.NO_EXPECTED_TYPE))
            }

            is PsiExpression -> {
                JavaPsiFacade.getInstance(expressionToCompute.project)
                        .constantEvaluationHelper
                        .computeExpression(expression, throwExceptionOnOverflow, auxEvaluator)
            }

            else -> null
        }' @ [54:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'expressionToCompute' @ [54:22] ==> val expressionToCompute: PsiElement defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[LocalVariableDescriptor]

'expressionToCompute' @ [56:40] ==> val expressionToCompute: PsiElement defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[LocalVariableDescriptor]

'getResolutionFacade' @ [56:60] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FrontendConstantExpressionEvaluator' @ [57:33] ==> public constructor ConstantExpressionEvaluator(builtIns: KotlinBuiltIns, languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[DeserializedClassConstructorDescriptor]

'resolutionFacade' @ [57:69] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[LocalVariableDescriptor]

'moduleDescriptor' @ [57:86] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'builtIns' @ [57:103] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'expressionToCompute' @ [58:69] ==> val expressionToCompute: PsiElement defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[LocalVariableDescriptor]

'languageVersionSettings' @ [58:89] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'DelegatingBindingTrace' @ [59:38] ==> public constructor DelegatingBindingTrace(parentContext: BindingContext, name: String, withParentDiagnostics: Boolean = ..., filter: BindingTraceFilter = ..., allowSliceRewrite: Boolean = ...) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[DeserializedClassConstructorDescriptor]

'resolutionFacade' @ [59:61] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[LocalVariableDescriptor]

'analyze' @ [59:78] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expressionToCompute' @ [59:86] ==> val expressionToCompute: PsiElement defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[LocalVariableDescriptor]

'evaluator' @ [61:32] ==> val evaluator: ConstantExpressionEvaluator defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[LocalVariableDescriptor]

'evaluateExpression' @ [61:42] ==> public final fun evaluateExpression(expression: KtExpression, trace: BindingTrace, expectedType: KotlinType? = ...): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[DeserializedSimpleFunctionDescriptor]

'expressionToCompute' @ [61:61] ==> val expressionToCompute: PsiElement defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[LocalVariableDescriptor]

'evaluatorTrace' @ [61:82] ==> val evaluatorTrace: DelegatingBindingTrace defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[LocalVariableDescriptor]

'constant' @ [62:21] ==> val constant: CompileTimeConstant<*> defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[LocalVariableDescriptor]

'isError' @ [62:30] ==> public open val isError: Boolean defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedPropertyDescriptor]

'evalConstantValue' @ [63:17] ==> private final fun evalConstantValue(constantValue: ConstantValue<*>): Any? defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator[SimpleFunctionDescriptorImpl]

'constant' @ [63:35] ==> val constant: CompileTimeConstant<*> defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[LocalVariableDescriptor]

'toConstantValue' @ [63:44] ==> public abstract fun toConstantValue(expectedType: KotlinType): ConstantValue<Any?> defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedSimpleFunctionDescriptor]

'NO_EXPECTED_TYPE' @ [63:70] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'getInstance' @ [67:31] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'expressionToCompute' @ [67:43] ==> val expressionToCompute: PsiElement defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[LocalVariableDescriptor]

'project' @ [67:63] ==> public final val PsiExpression.project: Project[MyPropertyDescriptor]

'constantEvaluationHelper' @ [68:26] ==> public final val JavaPsiFacade.constantEvaluationHelper: PsiConstantEvaluationHelper[MyPropertyDescriptor]

'computeExpression' @ [69:26] ==> public abstract fun computeExpression(@Nullable p0: PsiExpression?, p1: Boolean, @Nullable p2: PsiConstantEvaluationHelper.AuxEvaluator?): (Any..Any?) defined in com.intellij.psi.PsiConstantEvaluationHelper[JavaMethodDescriptor]

'expression' @ [69:44] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[ValueParameterDescriptorImpl]

'throwExceptionOnOverflow' @ [69:56] ==> value-parameter throwExceptionOnOverflow: Boolean defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[ValueParameterDescriptorImpl]

'auxEvaluator' @ [69:82] ==> value-parameter auxEvaluator: PsiConstantEvaluationHelper.AuxEvaluator? defined in org.jetbrains.kotlin.idea.KotlinLightConstantExpressionEvaluator.computeExpression[ValueParameterDescriptorImpl]

