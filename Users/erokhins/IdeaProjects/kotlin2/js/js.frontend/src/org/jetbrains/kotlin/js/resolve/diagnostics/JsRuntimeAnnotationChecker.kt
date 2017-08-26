'component1' @ [39:15] ==> public final operator fun component1(): AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedSimpleFunctionDescriptor]

'component2' @ [39:37] ==> public final operator fun component2(): AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [39:43] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsRuntimeAnnotationChecker.check[ValueParameterDescriptorImpl]

'annotations' @ [39:54] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedPropertyDescriptor]

'getAllAnnotations' @ [39:66] ==> public abstract fun getAllAnnotations(): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'annotationDescriptor' @ [40:35] ==> val annotationDescriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsRuntimeAnnotationChecker.check[LocalVariableDescriptor]

'annotationClass' @ [40:56] ==> public val AnnotationDescriptor.annotationClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'annotationClass' @ [41:17] ==> val annotationClass: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsRuntimeAnnotationChecker.check[LocalVariableDescriptor]

'getAnnotationRetention' @ [41:33] ==> public fun Annotated.getAnnotationRetention(): KotlinRetention? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'RUNTIME' @ [41:77] ==> enum entry RUNTIME defined in org.jetbrains.kotlin.descriptors.annotations.KotlinRetention[FakeCallableDescriptorForObject]

'?:' @ [43:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'annotationDescriptor' @ [43:34] ==> val annotationDescriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsRuntimeAnnotationChecker.check[LocalVariableDescriptor]

'source' @ [43:55] ==> public abstract val source: SourceElement defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'psi' @ [43:85] ==> public abstract val psi: PsiElement? defined in org.jetbrains.kotlin.resolve.source.PsiSourceElement[DeserializedPropertyDescriptor]

'declaration' @ [43:92] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsRuntimeAnnotationChecker.check[ValueParameterDescriptorImpl]

'if (descriptor is MemberDescriptor && descriptor.isEffectivelyExternal()) {
                diagnosticHolder.report(ErrorsJs.RUNTIME_ANNOTATION_ON_EXTERNAL_DECLARATION.on(annotationPsi))
            }
            else {
                diagnosticHolder.report(ErrorsJs.RUNTIME_ANNOTATION_NOT_SUPPORTED.on(annotationPsi))
            }' @ [45:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [45:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsRuntimeAnnotationChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [45:51] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsRuntimeAnnotationChecker.check[ValueParameterDescriptorImpl]

'isEffectivelyExternal' @ [45:62] ==> public fun MemberDescriptor.isEffectivelyExternal(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'diagnosticHolder' @ [46:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsRuntimeAnnotationChecker.check[ValueParameterDescriptorImpl]

'report' @ [46:34] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'RUNTIME_ANNOTATION_ON_EXTERNAL_DECLARATION' @ [46:50] ==> public final val RUNTIME_ANNOTATION_ON_EXTERNAL_DECLARATION: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [46:93] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'annotationPsi' @ [46:96] ==> val annotationPsi: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsRuntimeAnnotationChecker.check[LocalVariableDescriptor]

'diagnosticHolder' @ [49:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsRuntimeAnnotationChecker.check[ValueParameterDescriptorImpl]

'report' @ [49:34] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'RUNTIME_ANNOTATION_NOT_SUPPORTED' @ [49:50] ==> public final val RUNTIME_ANNOTATION_NOT_SUPPORTED: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [49:83] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'annotationPsi' @ [49:86] ==> val annotationPsi: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsRuntimeAnnotationChecker.check[LocalVariableDescriptor]

