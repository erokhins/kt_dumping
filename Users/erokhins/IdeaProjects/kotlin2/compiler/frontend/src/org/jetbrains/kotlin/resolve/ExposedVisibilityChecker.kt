'DO_NOTHING' @ [29:68] ==> public final val DO_NOTHING: (DiagnosticSink..DiagnosticSink?) defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaPropertyDescriptor]

'checkSupertypes' @ [33:22] ==> private final fun checkSupertypes(klass: KtClassOrObject, classDescriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'klass' @ [33:38] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[ValueParameterDescriptorImpl]

'classDescriptor' @ [33:45] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[ValueParameterDescriptorImpl]

'result' @ [34:9] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[LocalVariableDescriptor]

'result' @ [34:18] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[LocalVariableDescriptor]

'checkParameterBounds' @ [34:29] ==> private final fun checkParameterBounds(klass: KtClassOrObject, classDescriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'klass' @ [34:50] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[ValueParameterDescriptorImpl]

'classDescriptor' @ [34:57] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[ValueParameterDescriptorImpl]

'klass' @ [36:27] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[ValueParameterDescriptorImpl]

'primaryConstructor' @ [36:33] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'result' @ [36:62] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[LocalVariableDescriptor]

'classDescriptor' @ [37:37] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[ValueParameterDescriptorImpl]

'unsubstitutedPrimaryConstructor' @ [37:53] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'result' @ [37:95] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[LocalVariableDescriptor]

'result' @ [38:16] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[LocalVariableDescriptor]

'checkFunction' @ [38:27] ==> public final fun checkFunction(function: KtFunction, functionDescriptor: FunctionDescriptor, visibility: Visibility = ...): Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'constructor' @ [38:41] ==> val constructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[LocalVariableDescriptor]

'constructorDescriptor' @ [38:54] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkClassHeader[LocalVariableDescriptor]

'when {
            modifierListOwner is KtFunction &&
            descriptor is FunctionDescriptor -> checkFunction(modifierListOwner, descriptor, visibility)

            modifierListOwner is KtProperty &&
            descriptor is PropertyDescriptor -> checkProperty(modifierListOwner, descriptor, visibility)

            else -> true
        }' @ [45:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'modifierListOwner' @ [46:13] ==> value-parameter modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkDeclarationWithVisibility[ValueParameterDescriptorImpl]

'descriptor' @ [47:13] ==> value-parameter descriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkDeclarationWithVisibility[ValueParameterDescriptorImpl]

'checkFunction' @ [47:49] ==> public final fun checkFunction(function: KtFunction, functionDescriptor: FunctionDescriptor, visibility: Visibility = ...): Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'modifierListOwner' @ [47:63] ==> value-parameter modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkDeclarationWithVisibility[ValueParameterDescriptorImpl]

'descriptor' @ [47:82] ==> value-parameter descriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkDeclarationWithVisibility[ValueParameterDescriptorImpl]

'visibility' @ [47:94] ==> value-parameter visibility: Visibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkDeclarationWithVisibility[ValueParameterDescriptorImpl]

'modifierListOwner' @ [49:13] ==> value-parameter modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkDeclarationWithVisibility[ValueParameterDescriptorImpl]

'descriptor' @ [50:13] ==> value-parameter descriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkDeclarationWithVisibility[ValueParameterDescriptorImpl]

'checkProperty' @ [50:49] ==> public final fun checkProperty(property: KtProperty, propertyDescriptor: PropertyDescriptor, visibility: Visibility = ...): Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'modifierListOwner' @ [50:63] ==> value-parameter modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkDeclarationWithVisibility[ValueParameterDescriptorImpl]

'descriptor' @ [50:82] ==> value-parameter descriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkDeclarationWithVisibility[ValueParameterDescriptorImpl]

'visibility' @ [50:94] ==> value-parameter visibility: Visibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkDeclarationWithVisibility[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [57:28] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkTypeAlias[ValueParameterDescriptorImpl]

'expandedType' @ [57:48] ==> public abstract val expandedType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'expandedType' @ [58:13] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkTypeAlias[LocalVariableDescriptor]

'isError' @ [58:26] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'typeAliasDescriptor' @ [60:35] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkTypeAlias[ValueParameterDescriptorImpl]

'effectiveVisibility' @ [60:55] ==> public fun DeclarationDescriptorWithVisibility.effectiveVisibility(visibility: Visibility = ..., checkPublishedApi: Boolean = ...): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'expandedType' @ [61:27] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkTypeAlias[LocalVariableDescriptor]

'leastPermissiveDescriptor' @ [61:40] ==> public fun KotlinType.leastPermissiveDescriptor(base: EffectiveVisibility): DescriptorWithRelation? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'typeAliasVisibility' @ [61:66] ==> val typeAliasVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkTypeAlias[LocalVariableDescriptor]

'restricting' @ [62:13] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkTypeAlias[LocalVariableDescriptor]

'trace' @ [63:13] ==> private final val trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[PropertyDescriptorImpl]

'report' @ [63:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXPOSED_TYPEALIAS_EXPANDED_TYPE' @ [63:33] ==> public final val EXPOSED_TYPEALIAS_EXPANDED_TYPE: (DiagnosticFactory3<(PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>..DiagnosticFactory3<(PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [63:65] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull a: EffectiveVisibility, @NotNull b: DescriptorWithRelation, @NotNull c: EffectiveVisibility): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'typeAlias' @ [63:68] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkTypeAlias[ValueParameterDescriptorImpl]

'nameIdentifier' @ [63:78] ==> public final val KtTypeAlias.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'typeAlias' @ [63:96] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkTypeAlias[ValueParameterDescriptorImpl]

'typeAliasVisibility' @ [64:21] ==> val typeAliasVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkTypeAlias[LocalVariableDescriptor]

'restricting' @ [64:42] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkTypeAlias[LocalVariableDescriptor]

'restricting' @ [64:55] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkTypeAlias[LocalVariableDescriptor]

'effectiveVisibility' @ [64:67] ==> public final fun effectiveVisibility(): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [71:48] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[ValueParameterDescriptorImpl]

'visibility' @ [71:67] ==> public final val FunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'functionDescriptor' @ [73:34] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[ValueParameterDescriptorImpl]

'effectiveVisibility' @ [73:53] ==> public fun DeclarationDescriptorWithVisibility.effectiveVisibility(visibility: Visibility = ..., checkPublishedApi: Boolean = ...): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'visibility' @ [73:73] ==> value-parameter visibility: Visibility = ... defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[ValueParameterDescriptorImpl]

'function' @ [75:13] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[ValueParameterDescriptorImpl]

'functionDescriptor' @ [76:31] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[ValueParameterDescriptorImpl]

'returnType' @ [76:50] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'leastPermissiveDescriptor' @ [76:62] ==> public fun KotlinType.leastPermissiveDescriptor(base: EffectiveVisibility): DescriptorWithRelation? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'functionVisibility' @ [76:88] ==> val functionVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[LocalVariableDescriptor]

'restricting' @ [77:17] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[LocalVariableDescriptor]

'trace' @ [78:17] ==> private final val trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[PropertyDescriptorImpl]

'report' @ [78:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXPOSED_FUNCTION_RETURN_TYPE' @ [78:37] ==> public final val EXPOSED_FUNCTION_RETURN_TYPE: (DiagnosticFactory3<(PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>..DiagnosticFactory3<(PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [78:66] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull a: EffectiveVisibility, @NotNull b: DescriptorWithRelation, @NotNull c: EffectiveVisibility): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'function' @ [78:69] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[ValueParameterDescriptorImpl]

'nameIdentifier' @ [78:78] ==> public final val KtFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'function' @ [78:96] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[ValueParameterDescriptorImpl]

'functionVisibility' @ [78:106] ==> val functionVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[LocalVariableDescriptor]

'restricting' @ [79:69] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[LocalVariableDescriptor]

'restricting' @ [79:82] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[LocalVariableDescriptor]

'effectiveVisibility' @ [79:94] ==> public final fun effectiveVisibility(): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[DeserializedSimpleFunctionDescriptor]

'result' @ [80:17] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[LocalVariableDescriptor]

'functionDescriptor' @ [83:9] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [83:28] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'forEachIndexed' @ [83:44] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEachIndexed(action: (index: Int, (ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'parameterDescriptor' @ [84:31] ==> value-parameter parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [84:51] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'leastPermissiveDescriptor' @ [84:56] ==> public fun KotlinType.leastPermissiveDescriptor(base: EffectiveVisibility): DescriptorWithRelation? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'functionVisibility' @ [84:82] ==> val functionVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[LocalVariableDescriptor]

'restricting' @ [85:17] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction.<anonymous>[LocalVariableDescriptor]

'i' @ [85:40] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction.<anonymous>[ValueParameterDescriptorImpl]

'function' @ [85:44] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [85:53] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'size' @ [85:69] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'trace' @ [86:17] ==> private final val trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[PropertyDescriptorImpl]

'report' @ [86:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXPOSED_PARAMETER_TYPE' @ [86:37] ==> public final val EXPOSED_PARAMETER_TYPE: (DiagnosticFactory3<(KtParameter..KtParameter?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>..DiagnosticFactory3<(KtParameter..KtParameter?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [86:60] ==> @NotNull public open fun on(@NotNull element: KtParameter, @NotNull a: EffectiveVisibility, @NotNull b: DescriptorWithRelation, @NotNull c: EffectiveVisibility): ParametrizedDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'function' @ [86:63] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [86:72] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'i' @ [86:88] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction.<anonymous>[ValueParameterDescriptorImpl]

'functionVisibility' @ [86:92] ==> val functionVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[LocalVariableDescriptor]

'restricting' @ [87:63] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction.<anonymous>[LocalVariableDescriptor]

'restricting' @ [87:76] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction.<anonymous>[LocalVariableDescriptor]

'effectiveVisibility' @ [87:88] ==> public final fun effectiveVisibility(): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[DeserializedSimpleFunctionDescriptor]

'result' @ [88:17] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[LocalVariableDescriptor]

'result' @ [91:16] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[LocalVariableDescriptor]

'checkMemberReceiver' @ [91:27] ==> private final fun checkMemberReceiver(typeReference: KtTypeReference?, memberDescriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'function' @ [91:47] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [91:56] ==> public final val KtFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'functionDescriptor' @ [91:79] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkFunction[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [97:48] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[ValueParameterDescriptorImpl]

'visibility' @ [97:67] ==> public final val PropertyDescriptor.visibility: Visibility[MyPropertyDescriptor]

'propertyDescriptor' @ [99:34] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[ValueParameterDescriptorImpl]

'effectiveVisibility' @ [99:53] ==> public fun DeclarationDescriptorWithVisibility.effectiveVisibility(visibility: Visibility = ..., checkPublishedApi: Boolean = ...): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'visibility' @ [99:73] ==> value-parameter visibility: Visibility = ... defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [100:27] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[ValueParameterDescriptorImpl]

'type' @ [100:46] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'leastPermissiveDescriptor' @ [100:51] ==> public fun KotlinType.leastPermissiveDescriptor(base: EffectiveVisibility): DescriptorWithRelation? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'propertyVisibility' @ [100:77] ==> val propertyVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[LocalVariableDescriptor]

'restricting' @ [102:13] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[LocalVariableDescriptor]

'trace' @ [103:13] ==> private final val trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[PropertyDescriptorImpl]

'report' @ [103:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXPOSED_PROPERTY_TYPE' @ [103:33] ==> public final val EXPOSED_PROPERTY_TYPE: (DiagnosticFactory3<(PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>..DiagnosticFactory3<(PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [103:55] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull a: EffectiveVisibility, @NotNull b: DescriptorWithRelation, @NotNull c: EffectiveVisibility): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'property' @ [103:58] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[ValueParameterDescriptorImpl]

'nameIdentifier' @ [103:67] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'property' @ [103:85] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[ValueParameterDescriptorImpl]

'propertyVisibility' @ [103:95] ==> val propertyVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[LocalVariableDescriptor]

'restricting' @ [104:58] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[LocalVariableDescriptor]

'restricting' @ [104:71] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[LocalVariableDescriptor]

'effectiveVisibility' @ [104:83] ==> public final fun effectiveVisibility(): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[DeserializedSimpleFunctionDescriptor]

'result' @ [105:13] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[LocalVariableDescriptor]

'result' @ [107:16] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[LocalVariableDescriptor]

'checkMemberReceiver' @ [107:27] ==> private final fun checkMemberReceiver(typeReference: KtTypeReference?, memberDescriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'property' @ [107:47] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [107:56] ==> public final val KtProperty.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'propertyDescriptor' @ [107:79] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkProperty[ValueParameterDescriptorImpl]

'typeReference' @ [111:13] ==> value-parameter typeReference: KtTypeReference? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkMemberReceiver[ValueParameterDescriptorImpl]

'memberDescriptor' @ [112:43] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkMemberReceiver[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [112:60] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'memberDescriptor' @ [113:32] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkMemberReceiver[ValueParameterDescriptorImpl]

'effectiveVisibility' @ [113:49] ==> public fun DeclarationDescriptorWithVisibility.effectiveVisibility(visibility: Visibility = ..., checkPublishedApi: Boolean = ...): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'receiverParameterDescriptor' @ [114:27] ==> val receiverParameterDescriptor: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkMemberReceiver[LocalVariableDescriptor]

'type' @ [114:55] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'leastPermissiveDescriptor' @ [114:60] ==> public fun KotlinType.leastPermissiveDescriptor(base: EffectiveVisibility): DescriptorWithRelation? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'memberVisibility' @ [114:86] ==> val memberVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkMemberReceiver[LocalVariableDescriptor]

'restricting' @ [115:13] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkMemberReceiver[LocalVariableDescriptor]

'trace' @ [116:13] ==> private final val trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[PropertyDescriptorImpl]

'report' @ [116:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXPOSED_RECEIVER_TYPE' @ [116:33] ==> public final val EXPOSED_RECEIVER_TYPE: (DiagnosticFactory3<(KtTypeReference..KtTypeReference?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>..DiagnosticFactory3<(KtTypeReference..KtTypeReference?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [116:55] ==> @NotNull public open fun on(@NotNull element: KtTypeReference, @NotNull a: EffectiveVisibility, @NotNull b: DescriptorWithRelation, @NotNull c: EffectiveVisibility): ParametrizedDiagnostic<(KtTypeReference..KtTypeReference?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'typeReference' @ [116:58] ==> value-parameter typeReference: KtTypeReference? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkMemberReceiver[ValueParameterDescriptorImpl]

'memberVisibility' @ [116:73] ==> val memberVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkMemberReceiver[LocalVariableDescriptor]

'restricting' @ [117:58] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkMemberReceiver[LocalVariableDescriptor]

'restricting' @ [117:71] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkMemberReceiver[LocalVariableDescriptor]

'effectiveVisibility' @ [117:83] ==> public final fun effectiveVisibility(): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [124:31] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[ValueParameterDescriptorImpl]

'effectiveVisibility' @ [124:47] ==> public fun ClassDescriptor.effectiveVisibility(checkPublishedApi: Boolean = ...): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [125:27] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[ValueParameterDescriptorImpl]

'kind' @ [125:43] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [125:61] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'klass' @ [126:30] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [126:36] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'classDescriptor' @ [128:9] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[ValueParameterDescriptorImpl]

'typeConstructor' @ [128:25] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [128:41] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'forEachIndexed' @ [128:52] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.forEachIndexed(action: (index: Int, (KotlinType..KotlinType?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'i' @ [129:17] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'delegationList' @ [129:22] ==> val delegationList: List<KtSuperTypeListEntry> defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[LocalVariableDescriptor]

'size' @ [129:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'result' @ [129:50] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[LocalVariableDescriptor]

'?:' @ [130:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptor?, right: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptor

'getClassDescriptor' @ [130:45] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'superType' @ [130:64] ==> value-parameter superType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'superDescriptor' @ [131:36] ==> val superDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes.<anonymous>[LocalVariableDescriptor]

'kind' @ [131:52] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [131:70] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'superIsInterface' @ [132:17] ==> val superIsInterface: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes.<anonymous>[LocalVariableDescriptor]

'isInterface' @ [132:37] ==> val isInterface: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[LocalVariableDescriptor]

'superType' @ [135:31] ==> value-parameter superType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'leastPermissiveDescriptor' @ [135:41] ==> public fun KotlinType.leastPermissiveDescriptor(base: EffectiveVisibility): DescriptorWithRelation? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'classVisibility' @ [135:67] ==> val classVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[LocalVariableDescriptor]

'restricting' @ [136:17] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes.<anonymous>[LocalVariableDescriptor]

'if (isInterface) {
                    trace.report(Errors.EXPOSED_SUPER_INTERFACE.on(delegationList[i], classVisibility,
                                                                   restricting, restricting.effectiveVisibility()))
                }
                else {
                    trace.report(Errors.EXPOSED_SUPER_CLASS.on(delegationList[i], classVisibility,
                                                               restricting, restricting.effectiveVisibility()))
                }' @ [137:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isInterface' @ [137:21] ==> val isInterface: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[LocalVariableDescriptor]

'trace' @ [138:21] ==> private final val trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[PropertyDescriptorImpl]

'report' @ [138:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXPOSED_SUPER_INTERFACE' @ [138:41] ==> public final val EXPOSED_SUPER_INTERFACE: (DiagnosticFactory3<(KtSuperTypeListEntry..KtSuperTypeListEntry?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>..DiagnosticFactory3<(KtSuperTypeListEntry..KtSuperTypeListEntry?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [138:65] ==> @NotNull public open fun on(@NotNull element: KtSuperTypeListEntry, @NotNull a: EffectiveVisibility, @NotNull b: DescriptorWithRelation, @NotNull c: EffectiveVisibility): ParametrizedDiagnostic<(KtSuperTypeListEntry..KtSuperTypeListEntry?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'delegationList' @ [138:68] ==> val delegationList: List<KtSuperTypeListEntry> defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[LocalVariableDescriptor]

'i' @ [138:83] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'classVisibility' @ [138:87] ==> val classVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[LocalVariableDescriptor]

'restricting' @ [139:68] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes.<anonymous>[LocalVariableDescriptor]

'restricting' @ [139:81] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes.<anonymous>[LocalVariableDescriptor]

'effectiveVisibility' @ [139:93] ==> public final fun effectiveVisibility(): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[DeserializedSimpleFunctionDescriptor]

'trace' @ [142:21] ==> private final val trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[PropertyDescriptorImpl]

'report' @ [142:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXPOSED_SUPER_CLASS' @ [142:41] ==> public final val EXPOSED_SUPER_CLASS: (DiagnosticFactory3<(KtSuperTypeListEntry..KtSuperTypeListEntry?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>..DiagnosticFactory3<(KtSuperTypeListEntry..KtSuperTypeListEntry?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [142:61] ==> @NotNull public open fun on(@NotNull element: KtSuperTypeListEntry, @NotNull a: EffectiveVisibility, @NotNull b: DescriptorWithRelation, @NotNull c: EffectiveVisibility): ParametrizedDiagnostic<(KtSuperTypeListEntry..KtSuperTypeListEntry?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'delegationList' @ [142:64] ==> val delegationList: List<KtSuperTypeListEntry> defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[LocalVariableDescriptor]

'i' @ [142:79] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'classVisibility' @ [142:83] ==> val classVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[LocalVariableDescriptor]

'restricting' @ [143:64] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes.<anonymous>[LocalVariableDescriptor]

'restricting' @ [143:77] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes.<anonymous>[LocalVariableDescriptor]

'effectiveVisibility' @ [143:89] ==> public final fun effectiveVisibility(): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[DeserializedSimpleFunctionDescriptor]

'result' @ [145:17] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[LocalVariableDescriptor]

'result' @ [148:16] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkSupertypes[LocalVariableDescriptor]

'classDescriptor' @ [152:31] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds[ValueParameterDescriptorImpl]

'effectiveVisibility' @ [152:47] ==> public fun ClassDescriptor.effectiveVisibility(checkPublishedApi: Boolean = ...): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'klass' @ [153:33] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds[ValueParameterDescriptorImpl]

'typeParameters' @ [153:39] ==> public final val KtClassOrObject.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'classDescriptor' @ [155:9] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [155:25] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'forEachIndexed' @ [155:48] ==> public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.forEachIndexed(action: (index: Int, (TypeParameterDescriptor..TypeParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'i' @ [156:17] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds.<anonymous>[ValueParameterDescriptorImpl]

'typeParameterList' @ [156:22] ==> val typeParameterList: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>) defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds[LocalVariableDescriptor]

'size' @ [156:40] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'result' @ [156:53] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds[LocalVariableDescriptor]

'typeParameterDescriptor' @ [157:32] ==> value-parameter typeParameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds.<anonymous>[ValueParameterDescriptorImpl]

'upperBounds' @ [157:56] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'upperBound' @ [158:35] ==> val upperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds.<anonymous>[LocalVariableDescriptor]

'leastPermissiveDescriptor' @ [158:46] ==> public fun KotlinType.leastPermissiveDescriptor(base: EffectiveVisibility): DescriptorWithRelation? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'classVisibility' @ [158:72] ==> val classVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds[LocalVariableDescriptor]

'restricting' @ [159:21] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds.<anonymous>[LocalVariableDescriptor]

'trace' @ [160:21] ==> private final val trace: DiagnosticSink defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[PropertyDescriptorImpl]

'report' @ [160:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXPOSED_TYPE_PARAMETER_BOUND' @ [160:41] ==> public final val EXPOSED_TYPE_PARAMETER_BOUND: (DiagnosticFactory3<(KtTypeParameter..KtTypeParameter?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>..DiagnosticFactory3<(KtTypeParameter..KtTypeParameter?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [160:70] ==> @NotNull public open fun on(@NotNull element: KtTypeParameter, @NotNull a: EffectiveVisibility, @NotNull b: DescriptorWithRelation, @NotNull c: EffectiveVisibility): ParametrizedDiagnostic<(KtTypeParameter..KtTypeParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'typeParameterList' @ [160:73] ==> val typeParameterList: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>) defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds[LocalVariableDescriptor]

'i' @ [160:91] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds.<anonymous>[ValueParameterDescriptorImpl]

'classVisibility' @ [160:95] ==> val classVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds[LocalVariableDescriptor]

'restricting' @ [161:73] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds.<anonymous>[LocalVariableDescriptor]

'restricting' @ [161:86] ==> val restricting: DescriptorWithRelation? defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds.<anonymous>[LocalVariableDescriptor]

'effectiveVisibility' @ [161:98] ==> public final fun effectiveVisibility(): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[DeserializedSimpleFunctionDescriptor]

'result' @ [162:21] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds[LocalVariableDescriptor]

'result' @ [167:16] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker.checkParameterBounds[LocalVariableDescriptor]

