'JvmField' @ [45:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'createErrorType' @ [46:57] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'resolveTypeNullable' @ [57:9] ==> public final fun resolveTypeNullable(variableDescriptor: VariableDescriptorWithInitializerImpl, scopeForInitializer: LexicalScope, variable: KtVariableDeclaration, dataFlowInfo: DataFlowInfo, trace: BindingTrace, local: Boolean): KotlinType? defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [57:29] ==> value-parameter variableDescriptor: VariableDescriptorWithInitializerImpl defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveType[ValueParameterDescriptorImpl]

'scopeForInitializer' @ [57:49] ==> value-parameter scopeForInitializer: LexicalScope defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveType[ValueParameterDescriptorImpl]

'variable' @ [57:70] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveType[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [57:80] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveType[ValueParameterDescriptorImpl]

'trace' @ [57:94] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveType[ValueParameterDescriptorImpl]

'local' @ [57:101] ==> value-parameter local: Boolean defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveType[ValueParameterDescriptorImpl]

'let' @ [57:109] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Nothing

'it' @ [57:122] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveType.<anonymous>[ValueParameterDescriptorImpl]

'local' @ [59:13] ==> value-parameter local: Boolean defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveType[ValueParameterDescriptorImpl]

'trace' @ [60:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveType[ValueParameterDescriptorImpl]

'report' @ [60:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'VARIABLE_WITH_NO_TYPE_NO_INITIALIZER' @ [60:26] ==> public final val VARIABLE_WITH_NO_TYPE_NO_INITIALIZER: (DiagnosticFactory0<(KtVariableDeclaration..KtVariableDeclaration?)>..DiagnosticFactory0<(KtVariableDeclaration..KtVariableDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [60:63] ==> @NotNull public open fun on(@NotNull element: KtVariableDeclaration): SimpleDiagnostic<(KtVariableDeclaration..KtVariableDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'variable' @ [60:66] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveType[ValueParameterDescriptorImpl]

'STUB_FOR_PROPERTY_WITHOUT_TYPE' @ [63:16] ==> @JvmField public final val STUB_FOR_PROPERTY_WITHOUT_TYPE: SimpleType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.Companion[PropertyDescriptorImpl]

'variable' @ [74:31] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'typeReference' @ [74:40] ==> public final var KtVariableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'when {
            propertyTypeRef != null -> typeResolver.resolveType(scopeForInitializer, propertyTypeRef, trace, true)

            !variable.hasInitializer() && variable is KtProperty && variableDescriptor is VariableDescriptorWithAccessors &&
                 variable.hasDelegateExpression() ->
                    resolveDelegatedPropertyType(variable, variableDescriptor, scopeForInitializer, dataFlowInfo, trace, local)

            variable.hasInitializer() -> when {
                !local ->
                    wrappedTypeFactory.createRecursionIntolerantDeferredType(
                            trace
                    ) {
                        PreliminaryDeclarationVisitor.createForDeclaration(variable, trace,
                                                                           expressionTypingServices.languageVersionSettings)
                        val initializerType = resolveInitializerType(scopeForInitializer, variable.initializer!!, dataFlowInfo, trace, local)
                        transformAnonymousTypeIfNeeded(variableDescriptor, variable, initializerType, trace)
                    }

                else -> resolveInitializerType(scopeForInitializer, variable.initializer!!, dataFlowInfo, trace, local)
            }
            else -> null
        }' @ [75:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType?, entry1: KotlinType?, entry2: KotlinType?, entry3: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType?

'propertyTypeRef' @ [76:13] ==> val propertyTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[LocalVariableDescriptor]

'typeResolver' @ [76:40] ==> private final val typeResolver: TypeResolver defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[PropertyDescriptorImpl]

'resolveType' @ [76:53] ==> public final fun resolveType(scope: LexicalScope, typeReference: KtTypeReference, trace: BindingTrace, checkBounds: Boolean): KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'scopeForInitializer' @ [76:65] ==> value-parameter scopeForInitializer: LexicalScope defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'propertyTypeRef' @ [76:86] ==> val propertyTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[LocalVariableDescriptor]

'trace' @ [76:103] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'!' @ [78:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'variable' @ [78:14] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'hasInitializer' @ [78:23] ==> public abstract fun hasInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtVariableDeclaration[JavaMethodDescriptor]

'variable' @ [78:43] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'variableDescriptor' @ [78:69] ==> value-parameter variableDescriptor: VariableDescriptorWithInitializerImpl defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'variable' @ [79:18] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'hasDelegateExpression' @ [79:27] ==> public open fun hasDelegateExpression(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'resolveDelegatedPropertyType' @ [80:21] ==> private final fun resolveDelegatedPropertyType(property: KtProperty, variableDescriptor: VariableDescriptorWithAccessors, scopeForInitializer: LexicalScope, dataFlowInfo: DataFlowInfo, trace: BindingTrace, local: Boolean): KotlinType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[SimpleFunctionDescriptorImpl]

'variable' @ [80:50] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'variableDescriptor' @ [80:60] ==> value-parameter variableDescriptor: VariableDescriptorWithInitializerImpl defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'scopeForInitializer' @ [80:80] ==> value-parameter scopeForInitializer: LexicalScope defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [80:101] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'trace' @ [80:115] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'local' @ [80:122] ==> value-parameter local: Boolean defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'variable' @ [82:13] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'hasInitializer' @ [82:22] ==> public abstract fun hasInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtVariableDeclaration[JavaMethodDescriptor]

'when {
                !local ->
                    wrappedTypeFactory.createRecursionIntolerantDeferredType(
                            trace
                    ) {
                        PreliminaryDeclarationVisitor.createForDeclaration(variable, trace,
                                                                           expressionTypingServices.languageVersionSettings)
                        val initializerType = resolveInitializerType(scopeForInitializer, variable.initializer!!, dataFlowInfo, trace, local)
                        transformAnonymousTypeIfNeeded(variableDescriptor, variable, initializerType, trace)
                    }

                else -> resolveInitializerType(scopeForInitializer, variable.initializer!!, dataFlowInfo, trace, local)
            }' @ [82:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType, entry1: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType

'!' @ [83:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'local' @ [83:18] ==> value-parameter local: Boolean defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'wrappedTypeFactory' @ [84:21] ==> private final val wrappedTypeFactory: WrappedTypeFactory defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[PropertyDescriptorImpl]

'createRecursionIntolerantDeferredType' @ [84:40] ==> public open fun createRecursionIntolerantDeferredType(trace: BindingTrace, computation: () -> KotlinType): KotlinType defined in org.jetbrains.kotlin.types.WrappedTypeFactory[SimpleFunctionDescriptorImpl]

'trace' @ [85:29] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'PreliminaryDeclarationVisitor' @ [87:25] ==> public companion object defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor[FakeCallableDescriptorForObject]

'createForDeclaration' @ [87:55] ==> public final fun createForDeclaration(declaration: KtDeclaration, trace: BindingTrace, languageVersionSettings: LanguageVersionSettings): Unit defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion[SimpleFunctionDescriptorImpl]

'variable' @ [87:76] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'trace' @ [87:86] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'expressionTypingServices' @ [88:76] ==> private final val expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[PropertyDescriptorImpl]

'languageVersionSettings' @ [88:101] ==> public final val ExpressionTypingServices.languageVersionSettings: LanguageVersionSettings[MyPropertyDescriptor]

'resolveInitializerType' @ [89:47] ==> private final fun resolveInitializerType(scope: LexicalScope, initializer: KtExpression, dataFlowInfo: DataFlowInfo, trace: BindingTrace, local: Boolean): KotlinType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[SimpleFunctionDescriptorImpl]

'scopeForInitializer' @ [89:70] ==> value-parameter scopeForInitializer: LexicalScope defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'variable' @ [89:91] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'initializer' @ [89:100] ==> public final val KtVariableDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'dataFlowInfo' @ [89:115] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'trace' @ [89:129] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'local' @ [89:136] ==> value-parameter local: Boolean defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'transformAnonymousTypeIfNeeded' @ [90:25] ==> @NotNull public/*package*/ open fun transformAnonymousTypeIfNeeded(@NotNull descriptor: DeclarationDescriptorWithVisibility, @NotNull declaration: KtDeclaration, @NotNull type: KotlinType, @NotNull trace: BindingTrace): KotlinType defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'variableDescriptor' @ [90:56] ==> value-parameter variableDescriptor: VariableDescriptorWithInitializerImpl defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'variable' @ [90:76] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'initializerType' @ [90:86] ==> val initializerType: KotlinType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable.<anonymous>[LocalVariableDescriptor]

'trace' @ [90:103] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'resolveInitializerType' @ [93:25] ==> private final fun resolveInitializerType(scope: LexicalScope, initializer: KtExpression, dataFlowInfo: DataFlowInfo, trace: BindingTrace, local: Boolean): KotlinType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[SimpleFunctionDescriptorImpl]

'scopeForInitializer' @ [93:48] ==> value-parameter scopeForInitializer: LexicalScope defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'variable' @ [93:69] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'initializer' @ [93:78] ==> public final val KtVariableDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'dataFlowInfo' @ [93:93] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'trace' @ [93:107] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'local' @ [93:114] ==> value-parameter local: Boolean defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveTypeNullable[ValueParameterDescriptorImpl]

'!' @ [107:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'variable' @ [107:14] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'hasInitializer' @ [107:23] ==> public abstract fun hasInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtVariableDeclaration[JavaMethodDescriptor]

'variable' @ [107:43] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'isVar' @ [107:52] ==> public final val KtVariableDeclaration.isVar: Boolean[MyPropertyDescriptor]

'variableDescriptor' @ [108:9] ==> value-parameter variableDescriptor: VariableDescriptorWithInitializerImpl defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'setCompileTimeInitializer' @ [108:28] ==> public open fun setCompileTimeInitializer(@NotNull p0: NullableLazyValue<(ConstantValue<*>..ConstantValue<*>?)>): Unit defined in org.jetbrains.kotlin.descriptors.impl.VariableDescriptorWithInitializerImpl[JavaMethodDescriptor]

'storageManager' @ [109:17] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[PropertyDescriptorImpl]

'createRecursionTolerantNullableLazyValue' @ [109:32] ==> public abstract fun <T : Any> createRecursionTolerantNullableLazyValue(computable: () -> ConstantValue<Any?>?, onRecursiveCall: ConstantValue<Any?>?): NullableLazyValue<ConstantValue<Any?>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ConstantValue<Any?>

'!' @ [111:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldRecordInitializerForProperty' @ [111:50] ==> public open fun shouldRecordInitializerForProperty(@NotNull p0: VariableDescriptor, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'variableDescriptor' @ [111:85] ==> value-parameter variableDescriptor: VariableDescriptorWithInitializerImpl defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'variableType' @ [111:105] ==> value-parameter variableType: KotlinType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'variable' @ [113:47] ==> value-parameter variable: KtVariableDeclaration defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'initializer' @ [113:56] ==> public final val KtVariableDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'expressionTypingServices' @ [114:51] ==> private final val expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[PropertyDescriptorImpl]

'safeGetType' @ [114:76] ==> @NotNull public open fun safeGetType(@NotNull scope: LexicalScope, @NotNull expression: KtExpression, @NotNull expectedType: KotlinType, @NotNull dataFlowInfo: DataFlowInfo, @NotNull trace: BindingTrace): KotlinType defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingServices[JavaMethodDescriptor]

'scope' @ [114:88] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'initializer' @ [114:95] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded.<anonymous>[LocalVariableDescriptor]

'variableType' @ [114:110] ==> value-parameter variableType: KotlinType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [114:124] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'trace' @ [114:138] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'constantExpressionEvaluator' @ [115:44] ==> private final val constantExpressionEvaluator: ConstantExpressionEvaluator defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[PropertyDescriptorImpl]

'evaluateExpression' @ [115:72] ==> public final fun evaluateExpression(expression: KtExpression, trace: BindingTrace, expectedType: KotlinType? = ...): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[SimpleFunctionDescriptorImpl]

'initializer' @ [115:91] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded.<anonymous>[LocalVariableDescriptor]

'trace' @ [115:104] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'initializerType' @ [115:111] ==> val initializerType: KotlinType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded.<anonymous>[LocalVariableDescriptor]

'constant' @ [118:33] ==> val constant: CompileTimeConstant<Any?> defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded.<anonymous>[LocalVariableDescriptor]

'usesNonConstValAsConstant' @ [118:42] ==> public open val usesNonConstValAsConstant: Boolean defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedPropertyDescriptor]

'variableDescriptor' @ [118:71] ==> value-parameter variableDescriptor: VariableDescriptorWithInitializerImpl defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'isConst' @ [118:90] ==> public final val VariableDescriptorWithInitializerImpl.isConst: Boolean[MyPropertyDescriptor]

'trace' @ [119:33] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded[ValueParameterDescriptorImpl]

'report' @ [119:39] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NON_CONST_VAL_USED_IN_CONSTANT_EXPRESSION' @ [119:53] ==> public final val NON_CONST_VAL_USED_IN_CONSTANT_EXPRESSION: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [119:95] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'initializer' @ [119:98] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded.<anonymous>[LocalVariableDescriptor]

'constant' @ [122:29] ==> val constant: CompileTimeConstant<Any?> defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded.<anonymous>[LocalVariableDescriptor]

'toConstantValue' @ [122:38] ==> public abstract fun toConstantValue(expectedType: KotlinType): ConstantValue<Any?> defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedSimpleFunctionDescriptor]

'initializerType' @ [122:54] ==> val initializerType: KotlinType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.setConstantForVariableIfNeeded.<anonymous>[LocalVariableDescriptor]

'wrappedTypeFactory' @ [136:9] ==> private final val wrappedTypeFactory: WrappedTypeFactory defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[PropertyDescriptorImpl]

'createRecursionIntolerantDeferredType' @ [136:28] ==> public open fun createRecursionIntolerantDeferredType(trace: BindingTrace, computation: () -> KotlinType): KotlinType defined in org.jetbrains.kotlin.types.WrappedTypeFactory[SimpleFunctionDescriptorImpl]

'trace' @ [136:66] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType[ValueParameterDescriptorImpl]

'property' @ [137:34] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType[ValueParameterDescriptorImpl]

'delegateExpression' @ [137:43] ==> public final val KtProperty.delegateExpression: KtExpression?[MyPropertyDescriptor]

'delegatedPropertyResolver' @ [138:20] ==> private final val delegatedPropertyResolver: DelegatedPropertyResolver defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[PropertyDescriptorImpl]

'resolveDelegateExpression' @ [138:46] ==> public final fun resolveDelegateExpression(delegateExpression: KtExpression, property: KtProperty, variableDescriptor: VariableDescriptorWithAccessors, scopeForDelegate: LexicalScope, trace: BindingTrace, dataFlowInfo: DataFlowInfo): KotlinType defined in org.jetbrains.kotlin.resolve.DelegatedPropertyResolver[SimpleFunctionDescriptorImpl]

'delegateExpression' @ [139:17] ==> val delegateExpression: KtExpression defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType.<anonymous>[LocalVariableDescriptor]

'property' @ [139:37] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType[ValueParameterDescriptorImpl]

'variableDescriptor' @ [139:47] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType[ValueParameterDescriptorImpl]

'scopeForInitializer' @ [139:67] ==> value-parameter scopeForInitializer: LexicalScope defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType[ValueParameterDescriptorImpl]

'trace' @ [139:88] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [139:95] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType[ValueParameterDescriptorImpl]

'delegatedPropertyResolver' @ [141:32] ==> private final val delegatedPropertyResolver: DelegatedPropertyResolver defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[PropertyDescriptorImpl]

'getGetValueMethodReturnType' @ [141:58] ==> public final fun getGetValueMethodReturnType(variableDescriptor: VariableDescriptorWithAccessors, delegateExpression: KtExpression, byExpressionType: KotlinType, trace: BindingTrace, initializerScope: LexicalScope, dataFlowInfo: DataFlowInfo): KotlinType? defined in org.jetbrains.kotlin.resolve.DelegatedPropertyResolver[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [142:17] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType[ValueParameterDescriptorImpl]

'delegateExpression' @ [142:37] ==> val delegateExpression: KtExpression defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType.<anonymous>[LocalVariableDescriptor]

'type' @ [142:57] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType.<anonymous>[LocalVariableDescriptor]

'trace' @ [142:63] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType[ValueParameterDescriptorImpl]

'scopeForInitializer' @ [142:70] ==> value-parameter scopeForInitializer: LexicalScope defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [142:91] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType[ValueParameterDescriptorImpl]

'getterReturnType' @ [145:9] ==> val getterReturnType: KotlinType? defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType.<anonymous>[LocalVariableDescriptor]

'let' @ [145:27] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> UnwrappedType): UnwrappedType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> UnwrappedType

'approximateType' @ [145:33] ==> private final fun approximateType(type: KotlinType, local: Boolean): UnwrappedType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[SimpleFunctionDescriptorImpl]

'it' @ [145:49] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'local' @ [145:53] ==> value-parameter local: Boolean defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveDelegatedPropertyType[ValueParameterDescriptorImpl]

'createErrorType' @ [145:76] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'approximateType' @ [155:16] ==> private final fun approximateType(type: KotlinType, local: Boolean): UnwrappedType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[SimpleFunctionDescriptorImpl]

'expressionTypingServices' @ [155:32] ==> private final val expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[PropertyDescriptorImpl]

'safeGetType' @ [155:57] ==> @NotNull public open fun safeGetType(@NotNull scope: LexicalScope, @NotNull expression: KtExpression, @NotNull expectedType: KotlinType, @NotNull dataFlowInfo: DataFlowInfo, @NotNull trace: BindingTrace): KotlinType defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingServices[JavaMethodDescriptor]

'scope' @ [155:69] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveInitializerType[ValueParameterDescriptorImpl]

'initializer' @ [155:76] ==> value-parameter initializer: KtExpression defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveInitializerType[ValueParameterDescriptorImpl]

'NO_EXPECTED_TYPE' @ [155:99] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'dataFlowInfo' @ [155:117] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveInitializerType[ValueParameterDescriptorImpl]

'trace' @ [155:131] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveInitializerType[ValueParameterDescriptorImpl]

'local' @ [155:139] ==> value-parameter local: Boolean defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.resolveInitializerType[ValueParameterDescriptorImpl]

'typeApproximator' @ [158:84] ==> private final val typeApproximator: TypeApproximator defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver[PropertyDescriptorImpl]

'approximateDeclarationType' @ [158:101] ==> public final fun approximateDeclarationType(baseType: KotlinType, local: Boolean): UnwrappedType defined in org.jetbrains.kotlin.types.TypeApproximator[DeserializedSimpleFunctionDescriptor]

'type' @ [158:128] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.approximateType[ValueParameterDescriptorImpl]

'local' @ [158:134] ==> value-parameter local: Boolean defined in org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver.approximateType[ValueParameterDescriptorImpl]

