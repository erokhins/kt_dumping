'resolveQualifierReferenceTarget' @ [30:27] ==> private fun resolveQualifierReferenceTarget(qualifier: Qualifier, selector: DeclarationDescriptor?, context: ExpressionTypingContext): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve in file QualifiedExpressionResolveUtil.kt[SimpleFunctionDescriptorImpl]

'qualifier' @ [30:59] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierAsReceiverInExpression[ValueParameterDescriptorImpl]

'selector' @ [30:70] ==> value-parameter selector: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.resolveQualifierAsReceiverInExpression[ValueParameterDescriptorImpl]

'context' @ [30:80] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.resolveQualifierAsReceiverInExpression[ValueParameterDescriptorImpl]

'referenceTarget' @ [32:9] ==> val referenceTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierAsReceiverInExpression[LocalVariableDescriptor]

'context' @ [33:9] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.resolveQualifierAsReceiverInExpression[ValueParameterDescriptorImpl]

'trace' @ [33:17] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [33:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPE_PARAMETER_ON_LHS_OF_DOT' @ [33:37] ==> public final val TYPE_PARAMETER_ON_LHS_OF_DOT: (DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (TypeParameterDescriptor..TypeParameterDescriptor?)>..DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (TypeParameterDescriptor..TypeParameterDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [33:66] ==> @NotNull public open fun on(@NotNull element: KtSimpleNameExpression, @NotNull argument: TypeParameterDescriptor): ParametrizedDiagnostic<(KtSimpleNameExpression..KtSimpleNameExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'qualifier' @ [33:69] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierAsReceiverInExpression[ValueParameterDescriptorImpl]

'referenceExpression' @ [33:79] ==> public abstract val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[PropertyDescriptorImpl]

'referenceTarget' @ [33:100] ==> val referenceTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierAsReceiverInExpression[LocalVariableDescriptor]

'referenceTarget' @ [36:12] ==> val referenceTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierAsReceiverInExpression[LocalVariableDescriptor]

'resolveQualifierReferenceTarget' @ [42:27] ==> private fun resolveQualifierReferenceTarget(qualifier: Qualifier, selector: DeclarationDescriptor?, context: ExpressionTypingContext): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve in file QualifiedExpressionResolveUtil.kt[SimpleFunctionDescriptorImpl]

'qualifier' @ [42:59] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[ValueParameterDescriptorImpl]

'context' @ [42:76] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[ValueParameterDescriptorImpl]

'when (referenceTarget) {
        is TypeAliasDescriptor -> {
            referenceTarget.classDescriptor?.let { classDescriptor ->
                if (!classDescriptor.kind.isSingleton) {
                    context.trace.report(Errors.NO_COMPANION_OBJECT.on(qualifier.referenceExpression, referenceTarget))
                }
            }
        }
        is TypeParameterDescriptor -> {
            context.trace.report(Errors.TYPE_PARAMETER_IS_NOT_AN_EXPRESSION.on(qualifier.referenceExpression, referenceTarget))
        }
        is ClassDescriptor -> {
            if (!referenceTarget.kind.isSingleton) {
                context.trace.report(Errors.NO_COMPANION_OBJECT.on(qualifier.referenceExpression, referenceTarget))
            }
        }
        is PackageViewDescriptor -> {
            context.trace.report(Errors.EXPRESSION_EXPECTED_PACKAGE_FOUND.on(qualifier.referenceExpression))
        }
    }' @ [44:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?, entry2: Unit?, entry3: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'referenceTarget' @ [44:11] ==> val referenceTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[LocalVariableDescriptor]

'referenceTarget' @ [46:13] ==> val referenceTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[LocalVariableDescriptor]

'classDescriptor' @ [46:29] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'let' @ [46:46] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> Unit

'!' @ [47:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [47:22] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [47:38] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [47:43] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'context' @ [48:21] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[ValueParameterDescriptorImpl]

'trace' @ [48:29] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [48:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NO_COMPANION_OBJECT' @ [48:49] ==> public final val NO_COMPANION_OBJECT: (DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (ClassifierDescriptor..ClassifierDescriptor?)>..DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (ClassifierDescriptor..ClassifierDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [48:69] ==> @NotNull public open fun on(@NotNull element: KtSimpleNameExpression, @NotNull argument: ClassifierDescriptor): ParametrizedDiagnostic<(KtSimpleNameExpression..KtSimpleNameExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'qualifier' @ [48:72] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[ValueParameterDescriptorImpl]

'referenceExpression' @ [48:82] ==> public abstract val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[PropertyDescriptorImpl]

'referenceTarget' @ [48:103] ==> val referenceTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[LocalVariableDescriptor]

'context' @ [53:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[ValueParameterDescriptorImpl]

'trace' @ [53:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [53:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPE_PARAMETER_IS_NOT_AN_EXPRESSION' @ [53:41] ==> public final val TYPE_PARAMETER_IS_NOT_AN_EXPRESSION: (DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (TypeParameterDescriptor..TypeParameterDescriptor?)>..DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (TypeParameterDescriptor..TypeParameterDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [53:77] ==> @NotNull public open fun on(@NotNull element: KtSimpleNameExpression, @NotNull argument: TypeParameterDescriptor): ParametrizedDiagnostic<(KtSimpleNameExpression..KtSimpleNameExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'qualifier' @ [53:80] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[ValueParameterDescriptorImpl]

'referenceExpression' @ [53:90] ==> public abstract val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[PropertyDescriptorImpl]

'referenceTarget' @ [53:111] ==> val referenceTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[LocalVariableDescriptor]

'!' @ [56:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'referenceTarget' @ [56:18] ==> val referenceTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[LocalVariableDescriptor]

'kind' @ [56:34] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [56:39] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'context' @ [57:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[ValueParameterDescriptorImpl]

'trace' @ [57:25] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [57:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NO_COMPANION_OBJECT' @ [57:45] ==> public final val NO_COMPANION_OBJECT: (DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (ClassifierDescriptor..ClassifierDescriptor?)>..DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (ClassifierDescriptor..ClassifierDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [57:65] ==> @NotNull public open fun on(@NotNull element: KtSimpleNameExpression, @NotNull argument: ClassifierDescriptor): ParametrizedDiagnostic<(KtSimpleNameExpression..KtSimpleNameExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'qualifier' @ [57:68] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[ValueParameterDescriptorImpl]

'referenceExpression' @ [57:78] ==> public abstract val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[PropertyDescriptorImpl]

'referenceTarget' @ [57:99] ==> val referenceTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[LocalVariableDescriptor]

'context' @ [61:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[ValueParameterDescriptorImpl]

'trace' @ [61:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [61:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'EXPRESSION_EXPECTED_PACKAGE_FOUND' @ [61:41] ==> public final val EXPRESSION_EXPECTED_PACKAGE_FOUND: (DiagnosticFactory0<(KtSimpleNameExpression..KtSimpleNameExpression?)>..DiagnosticFactory0<(KtSimpleNameExpression..KtSimpleNameExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [61:75] ==> @NotNull public open fun on(@NotNull element: KtSimpleNameExpression): SimpleDiagnostic<(KtSimpleNameExpression..KtSimpleNameExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'qualifier' @ [61:78] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[ValueParameterDescriptorImpl]

'referenceExpression' @ [61:88] ==> public abstract val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[PropertyDescriptorImpl]

'referenceTarget' @ [65:12] ==> val referenceTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierAsStandaloneExpression[LocalVariableDescriptor]

'qualifier' @ [73:9] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'qualifier' @ [74:16] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'descriptor' @ [74:26] ==> public open val descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.TypeParameterQualifier[PropertyDescriptorImpl]

'when (selector) {
        is ConstructorDescriptor ->
            selector.containingDeclaration.containingDeclaration
        else ->
            selector?.containingDeclaration
    }' @ [77:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'selector' @ [77:35] ==> value-parameter selector: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'selector' @ [79:13] ==> value-parameter selector: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'containingDeclaration' @ [79:22] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'containingDeclaration' @ [79:44] ==> public final val ClassifierDescriptorWithTypeParameters.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'selector' @ [81:13] ==> value-parameter selector: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'containingDeclaration' @ [81:23] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'qualifier' @ [84:9] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'selectorContainer' @ [85:10] ==> val selectorContainer: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[LocalVariableDescriptor]

'selectorContainer' @ [85:60] ==> val selectorContainer: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[LocalVariableDescriptor]

'==' @ [86:9] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'getFqName' @ [86:25] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'qualifier' @ [86:35] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'descriptor' @ [86:45] ==> public open val descriptor: PackageViewDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.PackageQualifier[PropertyDescriptorImpl]

'getFqName' @ [86:76] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'selectorContainer' @ [86:86] ==> val selectorContainer: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[LocalVariableDescriptor]

'qualifier' @ [88:16] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'descriptor' @ [88:26] ==> public open val descriptor: PackageViewDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.PackageQualifier[PropertyDescriptorImpl]

'qualifier' @ [92:9] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'qualifier' @ [93:26] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'descriptor' @ [93:36] ==> public abstract val descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.scopes.receivers.ClassifierQualifier[PropertyDescriptorImpl]

'selector' @ [94:34] ==> value-parameter selector: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'selector' @ [95:35] ==> value-parameter selector: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [95:44] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'selector' @ [95:81] ==> value-parameter selector: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [95:90] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'classifier' @ [100:36] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[LocalVariableDescriptor]

'classValueDescriptor' @ [100:47] ==> public val ClassifierDescriptorWithTypeParameters.classValueDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'selectorIsCallable' @ [101:13] ==> val selectorIsCallable: Boolean defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[LocalVariableDescriptor]

'classValueDescriptor' @ [101:35] ==> val classValueDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[LocalVariableDescriptor]

'classifier' @ [102:44] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[LocalVariableDescriptor]

'classValueTypeDescriptor' @ [102:55] ==> public val ClassifierDescriptorWithTypeParameters.classValueTypeDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'context' @ [103:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'trace' @ [103:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'record' @ [103:27] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?), value: (DeclarationDescriptor..DeclarationDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [103:49] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'qualifier' @ [103:67] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'referenceExpression' @ [103:77] ==> public abstract val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[PropertyDescriptorImpl]

'classValueDescriptor' @ [103:98] ==> val classValueDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[LocalVariableDescriptor]

'context' @ [104:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'trace' @ [104:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'recordType' @ [104:27] ==> public abstract fun recordType(@NotNull expression: KtExpression, @Nullable type: KotlinType?): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'qualifier' @ [104:38] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'expression' @ [104:48] ==> public val Qualifier.expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers in file Qualifier.kt[PropertyDescriptorImpl]

'classValueTypeDescriptor' @ [104:60] ==> val classValueTypeDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[LocalVariableDescriptor]

'defaultType' @ [104:85] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'classifier' @ [105:17] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[LocalVariableDescriptor]

'hasCompanionObject' @ [105:28] ==> public val ClassifierDescriptorWithTypeParameters.hasCompanionObject: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'context' @ [106:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'trace' @ [106:25] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'record' @ [106:31] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>?), key: (KtReferenceExpression..KtReferenceExpression?), value: (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> ClassifierDescriptorWithTypeParameters

'SHORT_REFERENCE_TO_COMPANION_OBJECT' @ [106:53] ==> public final val SHORT_REFERENCE_TO_COMPANION_OBJECT: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'qualifier' @ [106:90] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'referenceExpression' @ [106:100] ==> public abstract val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[PropertyDescriptorImpl]

'classifier' @ [106:121] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[LocalVariableDescriptor]

'classValueTypeDescriptor' @ [108:20] ==> val classValueTypeDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[LocalVariableDescriptor]

'qualifier' @ [112:12] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.resolveQualifierReferenceTarget[ValueParameterDescriptorImpl]

'descriptor' @ [112:22] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[DeserializedPropertyDescriptor]

