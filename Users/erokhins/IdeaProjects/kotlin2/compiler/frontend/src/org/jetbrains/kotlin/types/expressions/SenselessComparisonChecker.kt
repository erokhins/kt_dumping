'JvmStatic' @ [32:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when {
                    KtPsiUtil.isNullConstant(left) -> right
                    KtPsiUtil.isNullConstant(right) -> left
                    else -> return
                }' @ [41:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression, entry2: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'isNullConstant' @ [42:31] ==> public open fun isNullConstant(@NotNull expression: KtExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'left' @ [42:46] ==> value-parameter left: KtExpression defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[ValueParameterDescriptorImpl]

'right' @ [42:55] ==> value-parameter right: KtExpression defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[ValueParameterDescriptorImpl]

'isNullConstant' @ [43:31] ==> public open fun isNullConstant(@NotNull expression: KtExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'right' @ [43:46] ==> value-parameter right: KtExpression defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[ValueParameterDescriptorImpl]

'left' @ [43:56] ==> value-parameter left: KtExpression defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[ValueParameterDescriptorImpl]

'invoke' @ [47:20] ==> public abstract operator fun invoke(p1: KtExpression): KotlinType? defined in kotlin.Function1[FunctionInvokeDescriptor]

'expr' @ [47:28] ==> val expr: KtExpression defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[LocalVariableDescriptor]

'type' @ [48:13] ==> val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[LocalVariableDescriptor]

'type' @ [48:29] ==> val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[LocalVariableDescriptor]

'isError' @ [48:34] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'expression' @ [50:29] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[ValueParameterDescriptorImpl]

'operationReference' @ [50:40] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'DataFlowValueFactory' @ [51:21] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [51:42] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'expr' @ [51:62] ==> val expr: KtExpression defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[LocalVariableDescriptor]

'type' @ [51:68] ==> val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[LocalVariableDescriptor]

'context' @ [51:74] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[ValueParameterDescriptorImpl]

'operationSign' @ [53:24] ==> val operationSign: KtOperationReferenceExpression defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[LocalVariableDescriptor]

'getReferencedNameElementType' @ [53:38] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[SimpleFunctionDescriptorImpl]

'EQEQ' @ [53:81] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operationSign' @ [53:89] ==> val operationSign: KtOperationReferenceExpression defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[LocalVariableDescriptor]

'getReferencedNameElementType' @ [53:103] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[SimpleFunctionDescriptorImpl]

'EQEQEQ' @ [53:146] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'invoke' @ [54:27] ==> public abstract operator fun invoke(p1: DataFlowValue): Nullability defined in kotlin.Function1[FunctionInvokeDescriptor]

'value' @ [54:42] ==> val value: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[LocalVariableDescriptor]

'when (nullability) {
                    Nullability.NULL -> equality
                    Nullability.NOT_NULL -> !equality
                    Nullability.IMPOSSIBLE -> false
                    else -> return
                }' @ [57:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'nullability' @ [57:23] ==> val nullability: Nullability defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[LocalVariableDescriptor]

'NULL' @ [58:33] ==> enum entry NULL defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[FakeCallableDescriptorForObject]

'equality' @ [58:41] ==> val equality: Boolean defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[LocalVariableDescriptor]

'NOT_NULL' @ [59:33] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[FakeCallableDescriptorForObject]

'!' @ [59:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equality' @ [59:46] ==> val equality: Boolean defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[LocalVariableDescriptor]

'IMPOSSIBLE' @ [60:33] ==> enum entry IMPOSSIBLE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[FakeCallableDescriptorForObject]

'context' @ [64:9] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[ValueParameterDescriptorImpl]

'trace' @ [64:17] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'report' @ [64:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'SENSELESS_COMPARISON' @ [64:37] ==> public final val SENSELESS_COMPARISON: (DiagnosticFactory2<(KtBinaryExpression..KtBinaryExpression?), (KtBinaryExpression..KtBinaryExpression?), (Boolean..Boolean?)>..DiagnosticFactory2<(KtBinaryExpression..KtBinaryExpression?), (KtBinaryExpression..KtBinaryExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [64:58] ==> @NotNull public open fun on(@NotNull element: KtBinaryExpression, @NotNull a: KtBinaryExpression, @NotNull b: Boolean): ParametrizedDiagnostic<(KtBinaryExpression..KtBinaryExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'expression' @ [64:61] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[ValueParameterDescriptorImpl]

'expression' @ [64:73] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[ValueParameterDescriptorImpl]

'expressionIsAlways' @ [64:85] ==> val expressionIsAlways: Boolean defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker.checkSenselessComparisonWithNull[LocalVariableDescriptor]

