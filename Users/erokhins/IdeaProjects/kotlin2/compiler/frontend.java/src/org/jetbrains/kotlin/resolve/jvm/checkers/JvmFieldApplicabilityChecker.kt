'' @ [37:18] ==> private constructor Problem(errorMessage: String) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[ClassConstructorDescriptorImpl]

'' @ [38:16] ==> private constructor Problem(errorMessage: String) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[ClassConstructorDescriptorImpl]

'' @ [39:24] ==> private constructor Problem(errorMessage: String) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[ClassConstructorDescriptorImpl]

'' @ [40:18] ==> private constructor Problem(errorMessage: String) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[ClassConstructorDescriptorImpl]

'' @ [41:17] ==> private constructor Problem(errorMessage: String) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[ClassConstructorDescriptorImpl]

'' @ [42:14] ==> private constructor Problem(errorMessage: String) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[ClassConstructorDescriptorImpl]

'' @ [43:38] ==> private constructor Problem(errorMessage: String) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[ClassConstructorDescriptorImpl]

'' @ [44:47] ==> private constructor Problem(errorMessage: String) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[ClassConstructorDescriptorImpl]

'JvmFileClassUtil' @ [44:125] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses in file JvmFileClassUtil.kt[FakeCallableDescriptorForObject]

'JVM_MULTIFILE_CLASS_SHORT' @ [44:142] ==> public final val JVM_MULTIFILE_CLASS_SHORT: String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[PropertyDescriptorImpl]

'' @ [45:17] ==> private constructor Problem(errorMessage: String) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[ClassConstructorDescriptorImpl]

'descriptor' @ [54:26] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'findJvmFieldAnnotation' @ [54:37] ==> public fun DeclarationDescriptor.findJvmFieldAnnotation(): AnnotationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.annotations[SimpleFunctionDescriptorImpl]

'when {
            descriptor !is PropertyDescriptor -> return
            declaration is KtProperty && declaration.hasDelegate() -> DELEGATE
            !descriptor.hasBackingField(bindingContext) -> return
            descriptor.isOverridable -> NOT_FINAL
            Visibilities.isPrivate(descriptor.visibility) -> PRIVATE
            descriptor.hasCustomAccessor() -> CUSTOM_ACCESSOR
            descriptor.overriddenDescriptors.isNotEmpty() -> OVERRIDES
            descriptor.isLateInit -> LATEINIT
            descriptor.isConst -> CONST
            descriptor.isInsideCompanionObjectOfInterface() -> INSIDE_COMPANION_OF_INTERFACE
            DescriptorUtils.isTopLevelDeclaration(descriptor) && declaration.isInsideJvmMultifileClassFile() ->
                TOP_LEVEL_PROPERTY_OF_MULTIFILE_FACADE
            else -> return
        }' @ [56:23] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JvmFieldApplicabilityChecker.Problem, entry1: JvmFieldApplicabilityChecker.Problem, entry2: JvmFieldApplicabilityChecker.Problem, entry3: JvmFieldApplicabilityChecker.Problem, entry4: JvmFieldApplicabilityChecker.Problem, entry5: JvmFieldApplicabilityChecker.Problem, entry6: JvmFieldApplicabilityChecker.Problem, entry7: JvmFieldApplicabilityChecker.Problem, entry8: JvmFieldApplicabilityChecker.Problem, entry9: JvmFieldApplicabilityChecker.Problem, entry10: JvmFieldApplicabilityChecker.Problem, entry11: JvmFieldApplicabilityChecker.Problem): JvmFieldApplicabilityChecker.Problem[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Problem

'descriptor' @ [57:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [58:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [58:42] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'hasDelegate' @ [58:54] ==> public open fun hasDelegate(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'DELEGATE' @ [58:71] ==> enum entry DELEGATE defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[FakeCallableDescriptorForObject]

'!' @ [59:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [59:14] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'hasBackingField' @ [59:25] ==> private final fun PropertyDescriptor.hasBackingField(bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker[SimpleFunctionDescriptorImpl]

'bindingContext' @ [59:41] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [60:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'isOverridable' @ [60:24] ==> public val CallableMemberDescriptor.isOverridable: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'NOT_FINAL' @ [60:41] ==> enum entry NOT_FINAL defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[FakeCallableDescriptorForObject]

'isPrivate' @ [61:26] ==> public open fun isPrivate(@NotNull p0: Visibility): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'descriptor' @ [61:36] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'visibility' @ [61:47] ==> public final val PropertyDescriptor.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE' @ [61:62] ==> enum entry PRIVATE defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[FakeCallableDescriptorForObject]

'descriptor' @ [62:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'hasCustomAccessor' @ [62:24] ==> private final fun PropertyDescriptor.hasCustomAccessor(): Boolean defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker[SimpleFunctionDescriptorImpl]

'CUSTOM_ACCESSOR' @ [62:47] ==> enum entry CUSTOM_ACCESSOR defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[FakeCallableDescriptorForObject]

'descriptor' @ [63:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [63:24] ==> public final var PropertyDescriptor.overriddenDescriptors: (MutableCollection<out (PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [63:46] ==> @InlineOnly public inline fun <T> Collection<(PropertyDescriptor..PropertyDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'OVERRIDES' @ [63:62] ==> enum entry OVERRIDES defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[FakeCallableDescriptorForObject]

'descriptor' @ [64:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'isLateInit' @ [64:24] ==> public final val PropertyDescriptor.isLateInit: Boolean[MyPropertyDescriptor]

'LATEINIT' @ [64:38] ==> enum entry LATEINIT defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[FakeCallableDescriptorForObject]

'descriptor' @ [65:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'isConst' @ [65:24] ==> public final val PropertyDescriptor.isConst: Boolean[MyPropertyDescriptor]

'CONST' @ [65:35] ==> enum entry CONST defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[FakeCallableDescriptorForObject]

'descriptor' @ [66:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'isInsideCompanionObjectOfInterface' @ [66:24] ==> private final fun PropertyDescriptor.isInsideCompanionObjectOfInterface(): Boolean defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker[SimpleFunctionDescriptorImpl]

'INSIDE_COMPANION_OF_INTERFACE' @ [66:64] ==> enum entry INSIDE_COMPANION_OF_INTERFACE defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[FakeCallableDescriptorForObject]

'isTopLevelDeclaration' @ [67:29] ==> public open fun isTopLevelDeclaration(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [67:51] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [67:66] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'isInsideJvmMultifileClassFile' @ [67:78] ==> public fun KtDeclaration.isInsideJvmMultifileClassFile(): Boolean defined in org.jetbrains.kotlin.fileClasses[SimpleFunctionDescriptorImpl]

'TOP_LEVEL_PROPERTY_OF_MULTIFILE_FACADE' @ [68:17] ==> enum entry TOP_LEVEL_PROPERTY_OF_MULTIFILE_FACADE defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[FakeCallableDescriptorForObject]

'DescriptorToSourceUtils' @ [72:31] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromAnnotation' @ [72:55] ==> @JvmStatic public final fun getSourceFromAnnotation(descriptor: AnnotationDescriptor): KtAnnotationEntry? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'annotation' @ [72:79] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[LocalVariableDescriptor]

'diagnosticHolder' @ [73:9] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[ValueParameterDescriptorImpl]

'report' @ [73:26] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'INAPPLICABLE_JVM_FIELD' @ [73:43] ==> public final val INAPPLICABLE_JVM_FIELD: (DiagnosticFactory1<(KtAnnotationEntry..KtAnnotationEntry?), (String..String?)>..DiagnosticFactory1<(KtAnnotationEntry..KtAnnotationEntry?), (String..String?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [73:66] ==> @NotNull public open fun on(@NotNull p0: KtAnnotationEntry, @NotNull p1: String): ParametrizedDiagnostic<(KtAnnotationEntry..KtAnnotationEntry?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'annotationEntry' @ [73:69] ==> val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[LocalVariableDescriptor]

'problem' @ [73:86] ==> val problem: JvmFieldApplicabilityChecker.Problem defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.check[LocalVariableDescriptor]

'errorMessage' @ [73:94] ==> public final val errorMessage: String defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.Problem[PropertyDescriptorImpl]

'!' @ [77:15] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getter' @ [77:17] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'isDefault' @ [77:25] ==> public final val PropertyGetterDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'!' @ [77:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'setter' @ [77:49] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'isDefault' @ [77:57] ==> public final val PropertySetterDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'bindingContext' @ [80:15] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.hasBackingField[ValueParameterDescriptorImpl]

'get' @ [80:30] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), p1: (PropertyDescriptor..PropertyDescriptor?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor
    <V : (Any..Any?)> -> Boolean

'BACKING_FIELD_REQUIRED' @ [80:49] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [80:73] ==> <this> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.hasBackingField[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [83:31] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'!' @ [84:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCompanionObject' @ [84:30] ==> public open fun isCompanionObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingClass' @ [84:48] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.isInsideCompanionObjectOfInterface[LocalVariableDescriptor]

'containingClass' @ [86:35] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.isInsideCompanionObjectOfInterface[LocalVariableDescriptor]

'containingDeclaration' @ [86:51] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'isInterface' @ [87:32] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'outerClassForObject' @ [87:44] ==> val outerClassForObject: ClassDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmFieldApplicabilityChecker.isInsideCompanionObjectOfInterface[LocalVariableDescriptor]

