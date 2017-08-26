'declaration' @ [36:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkDeclaration[ValueParameterDescriptorImpl]

'name' @ [36:25] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'descriptor' @ [37:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [38:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkDeclaration[ValueParameterDescriptorImpl]

'hasHidesMembersAnnotation' @ [38:24] ==> public fun CallableDescriptor.hasHidesMembersAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [39:37] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkDeclaration[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [39:48] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [39:76] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'extensionReceiverType' @ [40:13] ==> val extensionReceiverType: KotlinType defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkDeclaration[LocalVariableDescriptor]

'isError' @ [40:35] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'extensionReceiverType' @ [41:13] ==> val extensionReceiverType: KotlinType defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkDeclaration[LocalVariableDescriptor]

'isMarkedNullable' @ [41:35] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'when (descriptor) {
            is FunctionDescriptor ->
                checkShadowedExtensionFunction(declaration, descriptor, trace)
            is PropertyDescriptor ->
                checkShadowedExtensionProperty(declaration, descriptor, trace)
        }' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [43:15] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkDeclaration[ValueParameterDescriptorImpl]

'checkShadowedExtensionFunction' @ [45:17] ==> private final fun checkShadowedExtensionFunction(declaration: KtDeclaration, extensionFunction: FunctionDescriptor, trace: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [45:48] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [45:61] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkDeclaration[ValueParameterDescriptorImpl]

'trace' @ [45:73] ==> public final val trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[PropertyDescriptorImpl]

'checkShadowedExtensionProperty' @ [47:17] ==> private final fun checkShadowedExtensionProperty(declaration: KtDeclaration, extensionProperty: PropertyDescriptor, trace: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [47:48] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [47:61] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkDeclaration[ValueParameterDescriptorImpl]

'trace' @ [47:73] ==> public final val trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[PropertyDescriptorImpl]

'extensionFunction' @ [52:27] ==> value-parameter extensionFunction: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [52:45] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [52:73] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'memberScope' @ [52:79] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'memberScope' @ [54:32] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'getContributedFunctions' @ [54:44] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'extensionFunction' @ [54:68] ==> value-parameter extensionFunction: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'name' @ [54:86] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'WHEN_CHECK_DECLARATION_CONFLICTS' @ [54:109] ==> enum entry WHEN_CHECK_DECLARATION_CONFLICTS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'memberFunction' @ [55:17] ==> val memberFunction: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'isPublic' @ [55:32] ==> private final fun DeclarationDescriptorWithVisibility.isPublic(): Boolean defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'isExtensionFunctionShadowedByMemberFunction' @ [55:46] ==> private final fun isExtensionFunctionShadowedByMemberFunction(extension: FunctionDescriptor, member: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'extensionFunction' @ [55:90] ==> value-parameter extensionFunction: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'memberFunction' @ [55:109] ==> val memberFunction: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'trace' @ [56:17] ==> value-parameter trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'report' @ [56:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTENSION_SHADOWED_BY_MEMBER' @ [56:37] ==> public final val EXTENSION_SHADOWED_BY_MEMBER: (DiagnosticFactory1<(KtDeclaration..KtDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory1<(KtDeclaration..KtDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [56:66] ==> @NotNull public open fun on(@NotNull element: KtDeclaration, @NotNull argument: CallableMemberDescriptor): ParametrizedDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [56:69] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'memberFunction' @ [56:82] ==> val memberFunction: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'memberScope' @ [61:27] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'getContributedClassifier' @ [61:39] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'extensionFunction' @ [61:64] ==> value-parameter extensionFunction: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'name' @ [61:82] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'WHEN_CHECK_DECLARATION_CONFLICTS' @ [61:105] ==> enum entry WHEN_CHECK_DECLARATION_CONFLICTS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'nestedClass' @ [62:13] ==> val nestedClass: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'nestedClass' @ [62:47] ==> val nestedClass: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'isInner' @ [62:59] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'nestedClass' @ [62:70] ==> val nestedClass: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'isPublic' @ [62:82] ==> private final fun DeclarationDescriptorWithVisibility.isPublic(): Boolean defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'nestedClass' @ [63:33] ==> val nestedClass: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'constructors' @ [63:45] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'constructor' @ [64:21] ==> val constructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'isPublic' @ [64:33] ==> private final fun DeclarationDescriptorWithVisibility.isPublic(): Boolean defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'isExtensionFunctionShadowedByMemberFunction' @ [64:47] ==> private final fun isExtensionFunctionShadowedByMemberFunction(extension: FunctionDescriptor, member: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'extensionFunction' @ [64:91] ==> value-parameter extensionFunction: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'constructor' @ [64:110] ==> val constructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'trace' @ [65:21] ==> value-parameter trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'report' @ [65:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTENSION_FUNCTION_SHADOWED_BY_INNER_CLASS_CONSTRUCTOR' @ [65:41] ==> public final val EXTENSION_FUNCTION_SHADOWED_BY_INNER_CLASS_CONSTRUCTOR: (DiagnosticFactory1<(KtDeclaration..KtDeclaration?), (ConstructorDescriptor..ConstructorDescriptor?)>..DiagnosticFactory1<(KtDeclaration..KtDeclaration?), (ConstructorDescriptor..ConstructorDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [65:96] ==> @NotNull public open fun on(@NotNull element: KtDeclaration, @NotNull argument: ConstructorDescriptor): ParametrizedDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [65:99] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'constructor' @ [65:112] ==> val constructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'memberScope' @ [71:32] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'getContributedVariables' @ [71:44] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'extensionFunction' @ [71:68] ==> value-parameter extensionFunction: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'name' @ [71:86] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'WHEN_CHECK_DECLARATION_CONFLICTS' @ [71:109] ==> enum entry WHEN_CHECK_DECLARATION_CONFLICTS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'!' @ [72:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'memberProperty' @ [72:18] ==> val memberProperty: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'isPublic' @ [72:33] ==> private final fun DeclarationDescriptorWithVisibility.isPublic(): Boolean defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'getInvokeOperatorShadowingExtensionFunction' @ [74:34] ==> private final fun getInvokeOperatorShadowingExtensionFunction(extension: FunctionDescriptor, member: PropertyDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'extensionFunction' @ [74:78] ==> value-parameter extensionFunction: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'memberProperty' @ [74:97] ==> val memberProperty: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'invokeOperator' @ [75:17] ==> val invokeOperator: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'trace' @ [76:17] ==> value-parameter trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'report' @ [76:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTENSION_FUNCTION_SHADOWED_BY_MEMBER_PROPERTY_WITH_INVOKE' @ [76:37] ==> public final val EXTENSION_FUNCTION_SHADOWED_BY_MEMBER_PROPERTY_WITH_INVOKE: (DiagnosticFactory2<(KtDeclaration..KtDeclaration?), (PropertyDescriptor..PropertyDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>..DiagnosticFactory2<(KtDeclaration..KtDeclaration?), (PropertyDescriptor..PropertyDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [76:96] ==> @NotNull public open fun on(@NotNull element: KtDeclaration, @NotNull a: PropertyDescriptor, @NotNull b: FunctionDescriptor): ParametrizedDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'declaration' @ [76:99] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[ValueParameterDescriptorImpl]

'memberProperty' @ [76:112] ==> val memberProperty: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'invokeOperator' @ [76:128] ==> val invokeOperator: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionFunction[LocalVariableDescriptor]

'visibility' @ [83:13] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'normalize' @ [83:24] ==> public open fun normalize(): Visibility defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedSimpleFunctionDescriptor]

'PUBLIC' @ [83:52] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'extension' @ [92:13] ==> value-parameter extension: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isExtensionFunctionShadowedByMemberFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [92:23] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [92:39] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'member' @ [92:47] ==> value-parameter member: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isExtensionFunctionShadowedByMemberFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [92:54] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [92:70] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'extension' @ [93:13] ==> value-parameter extension: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isExtensionFunctionShadowedByMemberFunction[ValueParameterDescriptorImpl]

'varargParameterPosition' @ [93:23] ==> public fun CallableDescriptor.varargParameterPosition(): Int defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'member' @ [93:52] ==> value-parameter member: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isExtensionFunctionShadowedByMemberFunction[ValueParameterDescriptorImpl]

'varargParameterPosition' @ [93:59] ==> public fun CallableDescriptor.varargParameterPosition(): Int defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'extension' @ [94:13] ==> value-parameter extension: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isExtensionFunctionShadowedByMemberFunction[ValueParameterDescriptorImpl]

'isOperator' @ [94:23] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'!' @ [94:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [94:38] ==> value-parameter member: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isExtensionFunctionShadowedByMemberFunction[ValueParameterDescriptorImpl]

'isOperator' @ [94:45] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'extension' @ [95:13] ==> value-parameter extension: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isExtensionFunctionShadowedByMemberFunction[ValueParameterDescriptorImpl]

'isInfix' @ [95:23] ==> public final val FunctionDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'!' @ [95:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [95:35] ==> value-parameter member: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isExtensionFunctionShadowedByMemberFunction[ValueParameterDescriptorImpl]

'isInfix' @ [95:42] ==> public final val FunctionDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'FlatSignature' @ [97:34] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[FakeCallableDescriptorForObject]

'createForPossiblyShadowedExtension' @ [97:48] ==> public final fun <D : CallableDescriptor> createForPossiblyShadowedExtension(descriptor: FunctionDescriptor): FlatSignature<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> FunctionDescriptor

'extension' @ [97:83] ==> value-parameter extension: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isExtensionFunctionShadowedByMemberFunction[ValueParameterDescriptorImpl]

'FlatSignature' @ [98:31] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[FakeCallableDescriptorForObject]

'createFromCallableDescriptor' @ [98:45] ==> public final fun <D : CallableDescriptor> createFromCallableDescriptor(descriptor: FunctionDescriptor): FlatSignature<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> FunctionDescriptor

'member' @ [98:74] ==> value-parameter member: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isExtensionFunctionShadowedByMemberFunction[ValueParameterDescriptorImpl]

'isSignatureNotLessSpecific' @ [99:16] ==> private final fun isSignatureNotLessSpecific(extensionSignature: FlatSignature<FunctionDescriptor>, memberSignature: FlatSignature<FunctionDescriptor>): Boolean defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'extensionSignature' @ [99:43] ==> val extensionSignature: FlatSignature<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isExtensionFunctionShadowedByMemberFunction[LocalVariableDescriptor]

'memberSignature' @ [99:63] ==> val memberSignature: FlatSignature<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isExtensionFunctionShadowedByMemberFunction[LocalVariableDescriptor]

'member' @ [103:13] ==> value-parameter member: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.getInvokeOperatorShadowingExtensionFunction[ValueParameterDescriptorImpl]

'type' @ [103:20] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'memberScope' @ [103:25] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [103:37] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'OperatorNameConventions' @ [103:61] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [103:85] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'WHEN_CHECK_DECLARATION_CONFLICTS' @ [103:110] ==> enum entry WHEN_CHECK_DECLARATION_CONFLICTS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'firstOrNull' @ [104:22] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.firstOrNull(predicate: (SimpleFunctionDescriptor) -> Boolean): SimpleFunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'it' @ [104:36] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.getInvokeOperatorShadowingExtensionFunction.<anonymous>[ValueParameterDescriptorImpl]

'isPublic' @ [104:39] ==> private final fun DeclarationDescriptorWithVisibility.isPublic(): Boolean defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'it' @ [104:53] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.getInvokeOperatorShadowingExtensionFunction.<anonymous>[ValueParameterDescriptorImpl]

'isOperator' @ [104:56] ==> public final val SimpleFunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'isExtensionFunctionShadowedByMemberFunction' @ [104:70] ==> private final fun isExtensionFunctionShadowedByMemberFunction(extension: FunctionDescriptor, member: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'extension' @ [104:114] ==> value-parameter extension: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.getInvokeOperatorShadowingExtensionFunction[ValueParameterDescriptorImpl]

'it' @ [104:125] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.getInvokeOperatorShadowingExtensionFunction.<anonymous>[ValueParameterDescriptorImpl]

'ConstraintSystemBuilderImpl' @ [107:13] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[FakeCallableDescriptorForObject]

'forSpecificity' @ [107:41] ==> public final fun forSpecificity(): SimpleConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Companion[SimpleFunctionDescriptorImpl]

'isSignatureNotLessSpecific' @ [107:58] ==> public fun <T> SimpleConstraintSystem.isSignatureNotLessSpecific(specific: FlatSignature<FunctionDescriptor>, general: FlatSignature<FunctionDescriptor>, callbacks: SpecificityComparisonCallbacks, specificityComparator: TypeSpecificityComparator): Boolean defined in org.jetbrains.kotlin.resolve.calls.results[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'extensionSignature' @ [108:21] ==> value-parameter extensionSignature: FlatSignature<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isSignatureNotLessSpecific[ValueParameterDescriptorImpl]

'memberSignature' @ [109:21] ==> value-parameter memberSignature: FlatSignature<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.isSignatureNotLessSpecific[ValueParameterDescriptorImpl]

'OverloadabilitySpecificityCallbacks' @ [110:21] ==> public object OverloadabilitySpecificityCallbacks : SpecificityComparisonCallbacks defined in org.jetbrains.kotlin.resolve in file OverloadChecker.kt[FakeCallableDescriptorForObject]

'typeSpecificityComparator' @ [111:21] ==> public final val typeSpecificityComparator: TypeSpecificityComparator defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[PropertyDescriptorImpl]

'extensionProperty' @ [115:27] ==> value-parameter extensionProperty: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionProperty[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [115:45] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [115:73] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'memberScope' @ [115:79] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'memberScope' @ [117:9] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionProperty[LocalVariableDescriptor]

'getContributedVariables' @ [117:21] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'extensionProperty' @ [117:45] ==> value-parameter extensionProperty: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionProperty[ValueParameterDescriptorImpl]

'name' @ [117:63] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'WHEN_CHECK_DECLARATION_CONFLICTS' @ [117:86] ==> enum entry WHEN_CHECK_DECLARATION_CONFLICTS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'firstOrNull' @ [118:18] ==> public inline fun <T> Iterable<PropertyDescriptor>.firstOrNull(predicate: (PropertyDescriptor) -> Boolean): PropertyDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'it' @ [118:32] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionProperty.<anonymous>[ValueParameterDescriptorImpl]

'isPublic' @ [118:35] ==> private final fun DeclarationDescriptorWithVisibility.isPublic(): Boolean defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'!' @ [118:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [118:50] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionProperty.<anonymous>[ValueParameterDescriptorImpl]

'isExtension' @ [118:53] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'let' @ [119:19] ==> @InlineOnly public inline fun <T, R> PropertyDescriptor.let(block: (PropertyDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor
    <R> -> Unit

'trace' @ [120:21] ==> value-parameter trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionProperty[ValueParameterDescriptorImpl]

'report' @ [120:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTENSION_SHADOWED_BY_MEMBER' @ [120:41] ==> public final val EXTENSION_SHADOWED_BY_MEMBER: (DiagnosticFactory1<(KtDeclaration..KtDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory1<(KtDeclaration..KtDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [120:70] ==> @NotNull public open fun on(@NotNull element: KtDeclaration, @NotNull argument: CallableMemberDescriptor): ParametrizedDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [120:73] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionProperty[ValueParameterDescriptorImpl]

'memberProperty' @ [120:86] ==> value-parameter memberProperty: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker.checkShadowedExtensionProperty.<anonymous>[ValueParameterDescriptorImpl]

