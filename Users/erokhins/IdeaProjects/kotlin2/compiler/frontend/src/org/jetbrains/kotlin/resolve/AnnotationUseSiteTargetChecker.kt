'trace' @ [31:9] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[ValueParameterDescriptorImpl]

'checkDeclaration' @ [31:15] ==> private final fun BindingTrace.checkDeclaration(annotated: KtAnnotated, descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker[SimpleFunctionDescriptorImpl]

'annotated' @ [31:32] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [31:43] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[ValueParameterDescriptorImpl]

'annotated' @ [33:13] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[ValueParameterDescriptorImpl]

'annotated' @ [34:31] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[ValueParameterDescriptorImpl]

'valueParameters' @ [34:41] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'parameter' @ [35:21] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[LocalVariableDescriptor]

'hasValOrVar' @ [35:31] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'trace' @ [36:43] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[ValueParameterDescriptorImpl]

'bindingContext' @ [36:49] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'VALUE_PARAMETER' @ [36:79] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parameter' @ [36:96] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[LocalVariableDescriptor]

'trace' @ [37:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[ValueParameterDescriptorImpl]

'checkDeclaration' @ [37:23] ==> private final fun BindingTrace.checkDeclaration(annotated: KtAnnotated, descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker[SimpleFunctionDescriptorImpl]

'parameter' @ [37:40] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[LocalVariableDescriptor]

'parameterDescriptor' @ [37:51] ==> val parameterDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[LocalVariableDescriptor]

'descriptor' @ [41:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[ValueParameterDescriptorImpl]

'trace' @ [41:47] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[ValueParameterDescriptorImpl]

'checkReceiverAnnotations' @ [41:53] ==> private final fun BindingTrace.checkReceiverAnnotations(descriptor: CallableDescriptor): Unit defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker[SimpleFunctionDescriptorImpl]

'descriptor' @ [41:78] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [45:33] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkReceiverAnnotations[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [45:44] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'extensionReceiver' @ [46:38] ==> val extensionReceiver: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkReceiverAnnotations[LocalVariableDescriptor]

'type' @ [46:56] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'annotations' @ [46:61] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getUseSiteTargetedAnnotations' @ [46:73] ==> public abstract fun getUseSiteTargetedAnnotations(): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'annotationWithTarget' @ [47:26] ==> val annotationWithTarget: AnnotationWithTarget defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkReceiverAnnotations[LocalVariableDescriptor]

'target' @ [47:47] ==> public final val target: AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedPropertyDescriptor]

'DescriptorToSourceUtils' @ [48:37] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'getSourceFromAnnotation' @ [48:61] ==> @JvmStatic public final fun getSourceFromAnnotation(descriptor: AnnotationDescriptor): KtAnnotationEntry? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'annotationWithTarget' @ [48:85] ==> val annotationWithTarget: AnnotationWithTarget defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkReceiverAnnotations[LocalVariableDescriptor]

'annotation' @ [48:106] ==> public final val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedPropertyDescriptor]

'when (target) {
                AnnotationUseSiteTarget.RECEIVER -> {}
                AnnotationUseSiteTarget.FIELD,
                AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD,
                AnnotationUseSiteTarget.PROPERTY,
                AnnotationUseSiteTarget.PROPERTY_GETTER,
                AnnotationUseSiteTarget.PROPERTY_SETTER,
                AnnotationUseSiteTarget.SETTER_PARAMETER -> {
                    annotationEntry()?.let { report(INAPPLICABLE_TARGET_ON_PROPERTY.on(it, target.renderName)) }
                }
                AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER -> annotationEntry()?.let { report(INAPPLICABLE_PARAM_TARGET.on(it)) }
                AnnotationUseSiteTarget.FILE -> {
                    annotationEntry()?.useSiteTarget?.let { reportDiagnosticOnce(INAPPLICABLE_FILE_TARGET.on(it)) }
                }
            }' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?, entry2: Unit?, entry3: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'target' @ [50:19] ==> val target: AnnotationUseSiteTarget defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkReceiverAnnotations[LocalVariableDescriptor]

'AnnotationUseSiteTarget' @ [51:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'RECEIVER' @ [51:41] ==> enum entry RECEIVER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'AnnotationUseSiteTarget' @ [52:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'FIELD' @ [52:41] ==> enum entry FIELD defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'AnnotationUseSiteTarget' @ [53:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'PROPERTY_DELEGATE_FIELD' @ [53:41] ==> enum entry PROPERTY_DELEGATE_FIELD defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'AnnotationUseSiteTarget' @ [54:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'PROPERTY' @ [54:41] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'AnnotationUseSiteTarget' @ [55:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'PROPERTY_GETTER' @ [55:41] ==> enum entry PROPERTY_GETTER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'AnnotationUseSiteTarget' @ [56:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'PROPERTY_SETTER' @ [56:41] ==> enum entry PROPERTY_SETTER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'AnnotationUseSiteTarget' @ [57:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'SETTER_PARAMETER' @ [57:41] ==> enum entry SETTER_PARAMETER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'annotationEntry' @ [58:21] ==> local final fun annotationEntry(): KtAnnotationEntry? defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkReceiverAnnotations[SimpleFunctionDescriptorImpl]

'let' @ [58:40] ==> @InlineOnly public inline fun <T, R> KtAnnotationEntry.let(block: (KtAnnotationEntry) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry
    <R> -> Unit

'report' @ [58:46] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_TARGET_ON_PROPERTY' @ [58:53] ==> public final val INAPPLICABLE_TARGET_ON_PROPERTY: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [58:85] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [58:88] ==> value-parameter it: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkReceiverAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [58:92] ==> val target: AnnotationUseSiteTarget defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkReceiverAnnotations[LocalVariableDescriptor]

'renderName' @ [58:99] ==> public final val renderName: String defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[DeserializedPropertyDescriptor]

'AnnotationUseSiteTarget' @ [60:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'CONSTRUCTOR_PARAMETER' @ [60:41] ==> enum entry CONSTRUCTOR_PARAMETER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'annotationEntry' @ [60:66] ==> local final fun annotationEntry(): KtAnnotationEntry? defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkReceiverAnnotations[SimpleFunctionDescriptorImpl]

'let' @ [60:85] ==> @InlineOnly public inline fun <T, R> KtAnnotationEntry.let(block: (KtAnnotationEntry) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry
    <R> -> Unit

'report' @ [60:91] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_PARAM_TARGET' @ [60:98] ==> public final val INAPPLICABLE_PARAM_TARGET: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [60:124] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'it' @ [60:127] ==> value-parameter it: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkReceiverAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'AnnotationUseSiteTarget' @ [61:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'FILE' @ [61:41] ==> enum entry FILE defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'annotationEntry' @ [62:21] ==> local final fun annotationEntry(): KtAnnotationEntry? defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkReceiverAnnotations[SimpleFunctionDescriptorImpl]

'useSiteTarget' @ [62:40] ==> public final val KtAnnotationEntry.useSiteTarget: KtAnnotationUseSiteTarget?[MyPropertyDescriptor]

'let' @ [62:55] ==> @InlineOnly public inline fun <T, R> KtAnnotationUseSiteTarget.let(block: (KtAnnotationUseSiteTarget) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationUseSiteTarget
    <R> -> Unit

'reportDiagnosticOnce' @ [62:61] ==> public fun BindingTrace.reportDiagnosticOnce(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics in file diagnosticUtils.kt[SimpleFunctionDescriptorImpl]

'INAPPLICABLE_FILE_TARGET' @ [62:82] ==> public final val INAPPLICABLE_FILE_TARGET: (DiagnosticFactory0<(KtAnnotationUseSiteTarget..KtAnnotationUseSiteTarget?)>..DiagnosticFactory0<(KtAnnotationUseSiteTarget..KtAnnotationUseSiteTarget?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [62:107] ==> @NotNull public open fun on(@NotNull element: KtAnnotationUseSiteTarget): SimpleDiagnostic<(KtAnnotationUseSiteTarget..KtAnnotationUseSiteTarget?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'it' @ [62:110] ==> value-parameter it: KtAnnotationUseSiteTarget defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkReceiverAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'annotated' @ [69:28] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[ValueParameterDescriptorImpl]

'annotationEntries' @ [69:38] ==> public final val KtAnnotated.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'annotation' @ [70:33] ==> val annotation: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'useSiteTarget' @ [70:44] ==> public final val KtAnnotationEntry.useSiteTarget: KtAnnotationUseSiteTarget?[MyPropertyDescriptor]

'useSiteTarget' @ [71:26] ==> val useSiteTarget: KtAnnotationUseSiteTarget? defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'getAnnotationUseSiteTarget' @ [71:41] ==> public final fun getAnnotationUseSiteTarget(): AnnotationUseSiteTarget defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget[SimpleFunctionDescriptorImpl]

'when (target) {
                AnnotationUseSiteTarget.FIELD -> checkIfHasBackingField(annotated, descriptor, annotation)
                AnnotationUseSiteTarget.PROPERTY,
                AnnotationUseSiteTarget.PROPERTY_GETTER -> {}
                AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD -> checkIfDelegatedProperty(annotated, annotation)
                AnnotationUseSiteTarget.PROPERTY_SETTER -> checkIfMutableProperty(annotated, annotation)
                AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER -> {
                    if (annotated !is KtParameter) {
                        report(INAPPLICABLE_PARAM_TARGET.on(annotation))
                    }
                    else {
                        val containingDeclaration = bindingContext[BindingContext.VALUE_PARAMETER, annotated]?.containingDeclaration
                        if (containingDeclaration !is ConstructorDescriptor || !containingDeclaration.isPrimary) {
                            report(INAPPLICABLE_PARAM_TARGET.on(annotation))
                        }
                        else if (!annotated.hasValOrVar()) {
                            report(REDUNDANT_ANNOTATION_TARGET.on(annotation, target.renderName))
                        }
                    }
                }
                AnnotationUseSiteTarget.SETTER_PARAMETER -> checkIfMutableProperty(annotated, annotation)
                AnnotationUseSiteTarget.FILE -> reportDiagnosticOnce(INAPPLICABLE_FILE_TARGET.on(useSiteTarget))
                AnnotationUseSiteTarget.RECEIVER -> report(INAPPLICABLE_RECEIVER_TARGET.on(annotation))
            }' @ [73:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit, entry6: Unit, entry7: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'target' @ [73:19] ==> val target: AnnotationUseSiteTarget defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'AnnotationUseSiteTarget' @ [74:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'FIELD' @ [74:41] ==> enum entry FIELD defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'checkIfHasBackingField' @ [74:50] ==> private final fun BindingTrace.checkIfHasBackingField(annotated: KtAnnotated, descriptor: DeclarationDescriptor, annotation: KtAnnotationEntry): Unit defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker[SimpleFunctionDescriptorImpl]

'annotated' @ [74:73] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [74:84] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[ValueParameterDescriptorImpl]

'annotation' @ [74:96] ==> val annotation: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'AnnotationUseSiteTarget' @ [75:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'PROPERTY' @ [75:41] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'AnnotationUseSiteTarget' @ [76:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'PROPERTY_GETTER' @ [76:41] ==> enum entry PROPERTY_GETTER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'AnnotationUseSiteTarget' @ [77:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'PROPERTY_DELEGATE_FIELD' @ [77:41] ==> enum entry PROPERTY_DELEGATE_FIELD defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'checkIfDelegatedProperty' @ [77:68] ==> private final fun BindingTrace.checkIfDelegatedProperty(annotated: KtAnnotated, annotation: KtAnnotationEntry): Unit defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker[SimpleFunctionDescriptorImpl]

'annotated' @ [77:93] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[ValueParameterDescriptorImpl]

'annotation' @ [77:104] ==> val annotation: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'AnnotationUseSiteTarget' @ [78:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'PROPERTY_SETTER' @ [78:41] ==> enum entry PROPERTY_SETTER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'checkIfMutableProperty' @ [78:60] ==> private final fun BindingTrace.checkIfMutableProperty(annotated: KtAnnotated, annotation: KtAnnotationEntry): Unit defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker[SimpleFunctionDescriptorImpl]

'annotated' @ [78:83] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[ValueParameterDescriptorImpl]

'annotation' @ [78:94] ==> val annotation: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'AnnotationUseSiteTarget' @ [79:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'CONSTRUCTOR_PARAMETER' @ [79:41] ==> enum entry CONSTRUCTOR_PARAMETER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'if (annotated !is KtParameter) {
                        report(INAPPLICABLE_PARAM_TARGET.on(annotation))
                    }
                    else {
                        val containingDeclaration = bindingContext[BindingContext.VALUE_PARAMETER, annotated]?.containingDeclaration
                        if (containingDeclaration !is ConstructorDescriptor || !containingDeclaration.isPrimary) {
                            report(INAPPLICABLE_PARAM_TARGET.on(annotation))
                        }
                        else if (!annotated.hasValOrVar()) {
                            report(REDUNDANT_ANNOTATION_TARGET.on(annotation, target.renderName))
                        }
                    }' @ [80:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'annotated' @ [80:25] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[ValueParameterDescriptorImpl]

'report' @ [81:25] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_PARAM_TARGET' @ [81:32] ==> public final val INAPPLICABLE_PARAM_TARGET: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [81:58] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'annotation' @ [81:61] ==> val annotation: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'bindingContext' @ [84:53] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'VALUE_PARAMETER' @ [84:83] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'annotated' @ [84:100] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[ValueParameterDescriptorImpl]

'containingDeclaration' @ [84:112] ==> public final val VariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'if (containingDeclaration !is ConstructorDescriptor || !containingDeclaration.isPrimary) {
                            report(INAPPLICABLE_PARAM_TARGET.on(annotation))
                        }
                        else if (!annotated.hasValOrVar()) {
                            report(REDUNDANT_ANNOTATION_TARGET.on(annotation, target.renderName))
                        }' @ [85:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'containingDeclaration' @ [85:29] ==> val containingDeclaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'!' @ [85:80] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [85:81] ==> val containingDeclaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'isPrimary' @ [85:103] ==> public final val ConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'report' @ [86:29] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_PARAM_TARGET' @ [86:36] ==> public final val INAPPLICABLE_PARAM_TARGET: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [86:62] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'annotation' @ [86:65] ==> val annotation: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'!' @ [88:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'annotated' @ [88:35] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[ValueParameterDescriptorImpl]

'hasValOrVar' @ [88:45] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'report' @ [89:29] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'REDUNDANT_ANNOTATION_TARGET' @ [89:36] ==> public final val REDUNDANT_ANNOTATION_TARGET: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [89:64] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'annotation' @ [89:67] ==> val annotation: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'target' @ [89:79] ==> val target: AnnotationUseSiteTarget defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'renderName' @ [89:86] ==> public final val renderName: String defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[DeserializedPropertyDescriptor]

'AnnotationUseSiteTarget' @ [93:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'SETTER_PARAMETER' @ [93:41] ==> enum entry SETTER_PARAMETER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'checkIfMutableProperty' @ [93:61] ==> private final fun BindingTrace.checkIfMutableProperty(annotated: KtAnnotated, annotation: KtAnnotationEntry): Unit defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker[SimpleFunctionDescriptorImpl]

'annotated' @ [93:84] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[ValueParameterDescriptorImpl]

'annotation' @ [93:95] ==> val annotation: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'AnnotationUseSiteTarget' @ [94:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'FILE' @ [94:41] ==> enum entry FILE defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'reportDiagnosticOnce' @ [94:49] ==> public fun BindingTrace.reportDiagnosticOnce(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics in file diagnosticUtils.kt[SimpleFunctionDescriptorImpl]

'INAPPLICABLE_FILE_TARGET' @ [94:70] ==> public final val INAPPLICABLE_FILE_TARGET: (DiagnosticFactory0<(KtAnnotationUseSiteTarget..KtAnnotationUseSiteTarget?)>..DiagnosticFactory0<(KtAnnotationUseSiteTarget..KtAnnotationUseSiteTarget?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [94:95] ==> @NotNull public open fun on(@NotNull element: KtAnnotationUseSiteTarget): SimpleDiagnostic<(KtAnnotationUseSiteTarget..KtAnnotationUseSiteTarget?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'useSiteTarget' @ [94:98] ==> val useSiteTarget: KtAnnotationUseSiteTarget? defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'AnnotationUseSiteTarget' @ [95:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'RECEIVER' @ [95:41] ==> enum entry RECEIVER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'report' @ [95:53] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_RECEIVER_TARGET' @ [95:60] ==> public final val INAPPLICABLE_RECEIVER_TARGET: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [95:89] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'annotation' @ [95:92] ==> val annotation: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkDeclaration[LocalVariableDescriptor]

'annotated' @ [101:13] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfDelegatedProperty[ValueParameterDescriptorImpl]

'!' @ [101:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'annotated' @ [101:41] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfDelegatedProperty[ValueParameterDescriptorImpl]

'hasDelegate' @ [101:51] ==> public open fun hasDelegate(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'annotated' @ [101:68] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfDelegatedProperty[ValueParameterDescriptorImpl]

'annotated' @ [101:96] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfDelegatedProperty[ValueParameterDescriptorImpl]

'hasValOrVar' @ [101:106] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'report' @ [102:13] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_TARGET_PROPERTY_HAS_NO_DELEGATE' @ [102:20] ==> public final val INAPPLICABLE_TARGET_PROPERTY_HAS_NO_DELEGATE: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [102:65] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'annotation' @ [102:68] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfDelegatedProperty[ValueParameterDescriptorImpl]

'annotated' @ [107:13] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfHasBackingField[ValueParameterDescriptorImpl]

'annotated' @ [107:40] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfHasBackingField[ValueParameterDescriptorImpl]

'hasDelegate' @ [107:50] ==> public open fun hasDelegate(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'descriptor' @ [108:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfHasBackingField[ValueParameterDescriptorImpl]

'get' @ [108:49] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), key: (PropertyDescriptor..PropertyDescriptor?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)
    <V : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'BACKING_FIELD_REQUIRED' @ [108:68] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'descriptor' @ [108:92] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfHasBackingField[ValueParameterDescriptorImpl]

'report' @ [109:13] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_TARGET_PROPERTY_HAS_NO_BACKING_FIELD' @ [109:20] ==> public final val INAPPLICABLE_TARGET_PROPERTY_HAS_NO_BACKING_FIELD: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [109:70] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'annotation' @ [109:73] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfHasBackingField[ValueParameterDescriptorImpl]

'useSiteTarget' @ [114:13] ==> public final val KtAnnotationEntry.useSiteTarget: KtAnnotationUseSiteTarget?[MyPropertyDescriptor]

'getAnnotationUseSiteTarget' @ [114:28] ==> public final fun getAnnotationUseSiteTarget(): AnnotationUseSiteTarget defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget[SimpleFunctionDescriptorImpl]

'renderName' @ [114:58] ==> public final val renderName: String defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[DeserializedPropertyDescriptor]

'!' @ [117:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkIfProperty' @ [117:14] ==> private final fun BindingTrace.checkIfProperty(annotated: KtAnnotated, annotation: KtAnnotationEntry): Boolean defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker[SimpleFunctionDescriptorImpl]

'annotated' @ [117:30] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfMutableProperty[ValueParameterDescriptorImpl]

'annotation' @ [117:41] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfMutableProperty[ValueParameterDescriptorImpl]

'when (annotated) {
            is KtProperty -> annotated.isVar
            is KtParameter -> annotated.isMutable
            else -> false
        }' @ [119:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'annotated' @ [119:31] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfMutableProperty[ValueParameterDescriptorImpl]

'annotated' @ [120:30] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfMutableProperty[ValueParameterDescriptorImpl]

'isVar' @ [120:40] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'annotated' @ [121:31] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfMutableProperty[ValueParameterDescriptorImpl]

'isMutable' @ [121:41] ==> public final val KtParameter.isMutable: Boolean[MyPropertyDescriptor]

'!' @ [125:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isMutable' @ [125:14] ==> val isMutable: Boolean defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfMutableProperty[LocalVariableDescriptor]

'report' @ [126:13] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_TARGET_PROPERTY_IMMUTABLE' @ [126:20] ==> public final val INAPPLICABLE_TARGET_PROPERTY_IMMUTABLE: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [126:59] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'annotation' @ [126:62] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfMutableProperty[ValueParameterDescriptorImpl]

'annotation' @ [126:74] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfMutableProperty[ValueParameterDescriptorImpl]

'useSiteDescription' @ [126:85] ==> private final fun KtAnnotationEntry.useSiteDescription(): String defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker[SimpleFunctionDescriptorImpl]

'when (annotated) {
            is KtProperty -> !annotated.isLocal
            is KtParameter -> annotated.hasValOrVar()
            else -> false
        }' @ [131:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'annotated' @ [131:32] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfProperty[ValueParameterDescriptorImpl]

'!' @ [132:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'annotated' @ [132:31] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfProperty[ValueParameterDescriptorImpl]

'isLocal' @ [132:41] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'annotated' @ [133:31] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfProperty[ValueParameterDescriptorImpl]

'hasValOrVar' @ [133:41] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'!' @ [137:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isProperty' @ [137:14] ==> val isProperty: Boolean defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfProperty[LocalVariableDescriptor]

'report' @ [137:26] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_TARGET_ON_PROPERTY' @ [137:33] ==> public final val INAPPLICABLE_TARGET_ON_PROPERTY: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [137:65] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'annotation' @ [137:68] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfProperty[ValueParameterDescriptorImpl]

'annotation' @ [137:80] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfProperty[ValueParameterDescriptorImpl]

'useSiteDescription' @ [137:91] ==> private final fun KtAnnotationEntry.useSiteDescription(): String defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker[SimpleFunctionDescriptorImpl]

'isProperty' @ [138:16] ==> val isProperty: Boolean defined in org.jetbrains.kotlin.resolve.AnnotationUseSiteTargetChecker.checkIfProperty[LocalVariableDescriptor]

