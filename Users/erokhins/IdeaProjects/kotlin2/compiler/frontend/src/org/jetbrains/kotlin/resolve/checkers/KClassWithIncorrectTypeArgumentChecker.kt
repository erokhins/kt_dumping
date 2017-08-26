'descriptor' @ [33:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [33:56] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[ValueParameterDescriptorImpl]

'visibility' @ [33:67] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'LOCAL' @ [33:94] ==> @NotNull public final val LOCAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'declaration' @ [35:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [35:54] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[ValueParameterDescriptorImpl]

'typeReference' @ [35:66] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'descriptor' @ [38:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [40:26] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[ValueParameterDescriptorImpl]

'returnType' @ [40:37] ==> public final val CallableMemberDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'returnType' @ [43:9] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[LocalVariableDescriptor]

'contains' @ [43:20] ==> public fun KotlinType.contains(predicate: (UnwrappedType) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'type' @ [44:41] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'isKClassWithBadArgument' @ [44:46] ==> private final fun UnwrappedType.isKClassWithBadArgument(): Boolean defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker[SimpleFunctionDescriptorImpl]

'kClassWithBadArgument' @ [45:17] ==> val kClassWithBadArgument: Boolean defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check.<anonymous>[LocalVariableDescriptor]

'type' @ [46:17] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [46:22] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'singleOrNull' @ [46:32] ==> public fun <T> List<TypeProjection>.singleOrNull(): TypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'type' @ [46:48] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [46:54] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [46:67] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'let' @ [46:90] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> Unit

'it' @ [47:25] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [47:58] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [47:61] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [47:86] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[ValueParameterDescriptorImpl]

'typeParameterWithoutNotNullableUpperBound' @ [48:25] ==> var typeParameterWithoutNotNullableUpperBound: TypeParameterDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[LocalVariableDescriptor]

'it' @ [48:69] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'kClassWithBadArgument' @ [52:13] ==> val kClassWithBadArgument: Boolean defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check.<anonymous>[LocalVariableDescriptor]

'typeParameterWithoutNotNullableUpperBound' @ [55:13] ==> var typeParameterWithoutNotNullableUpperBound: TypeParameterDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[LocalVariableDescriptor]

'diagnosticHolder' @ [56:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[ValueParameterDescriptorImpl]

'report' @ [56:30] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'KCLASS_WITH_NULLABLE_TYPE_PARAMETER_IN_SIGNATURE' @ [56:44] ==> public final val KCLASS_WITH_NULLABLE_TYPE_PARAMETER_IN_SIGNATURE: (DiagnosticFactory1<(KtNamedDeclaration..KtNamedDeclaration?), (TypeParameterDescriptor..TypeParameterDescriptor?)>..DiagnosticFactory1<(KtNamedDeclaration..KtNamedDeclaration?), (TypeParameterDescriptor..TypeParameterDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [56:93] ==> @NotNull public open fun on(@NotNull element: KtNamedDeclaration, @NotNull argument: TypeParameterDescriptor): ParametrizedDiagnostic<(KtNamedDeclaration..KtNamedDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [56:96] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[ValueParameterDescriptorImpl]

'typeParameterWithoutNotNullableUpperBound' @ [56:109] ==> var typeParameterWithoutNotNullableUpperBound: TypeParameterDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.check[LocalVariableDescriptor]

'arguments' @ [61:28] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'singleOrNull' @ [61:38] ==> public fun <T> List<TypeProjection>.singleOrNull(): TypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'let' @ [61:54] ==> @InlineOnly public inline fun <T, R> TypeProjection.let(block: (TypeProjection) -> UnwrappedType?): UnwrappedType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> UnwrappedType?

'if (it.isStarProjection) null else it.type.unwrap()' @ [61:60] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType?, elseBranch: UnwrappedType?): UnwrappedType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType?

'it' @ [61:64] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.isKClassWithBadArgument.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [61:67] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'it' @ [61:95] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.isKClassWithBadArgument.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [61:98] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [61:103] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'constructor' @ [62:21] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [62:33] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'isKClass' @ [64:31] ==> public open fun isKClass(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'klass' @ [64:40] ==> val klass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.isKClassWithBadArgument[LocalVariableDescriptor]

'!' @ [64:50] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'argumentType' @ [64:51] ==> val argumentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.isKClassWithBadArgument[LocalVariableDescriptor]

'isSubtypeOf' @ [64:64] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'argumentType' @ [64:76] ==> val argumentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.checkers.KClassWithIncorrectTypeArgumentChecker.isKClassWithBadArgument[LocalVariableDescriptor]

'builtIns' @ [64:89] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'anyType' @ [64:98] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

