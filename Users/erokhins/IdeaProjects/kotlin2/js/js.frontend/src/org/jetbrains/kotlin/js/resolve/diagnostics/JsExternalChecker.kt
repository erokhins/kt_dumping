'setOf' @ [37:45] ==> public fun <T> setOf(vararg elements: FqNameUnsafe): Set<FqNameUnsafe> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqNameUnsafe

'FqNameUnsafe' @ [37:51] ==> public constructor FqNameUnsafe(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaClassConstructorDescriptor]

'FqNameUnsafe' @ [37:85] ==> public constructor FqNameUnsafe(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaClassConstructorDescriptor]

'!' @ [41:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNativeObject' @ [41:31] ==> public open fun isNativeObject(@NotNull descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'descriptor' @ [41:46] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'!' @ [43:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTopLevelDeclaration' @ [43:30] ==> public open fun isTopLevelDeclaration(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [43:52] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'isDirectlyExternal' @ [44:17] ==> private final fun isDirectlyExternal(declaration: KtDeclaration, descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [44:36] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [44:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [44:64] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [45:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [45:34] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'NESTED_EXTERNAL_DECLARATION' @ [45:50] ==> public final val NESTED_EXTERNAL_DECLARATION: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [45:78] ==> @NotNull public open fun on(@NotNull p0: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [45:81] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'if (DescriptorUtils.isAnnotationClass(descriptor)) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "annotation class"))
        }
        else if (descriptor is ClassDescriptor && descriptor.isData) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "data class"))
        }
        else if (descriptor is PropertyAccessorDescriptor && isDirectlyExternal(declaration, descriptor)) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "property accessor"))
        }
        else if (descriptor is ClassDescriptor && descriptor.isInner) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "inner class"))
        }
        else if (isPrivateMemberOfExternalClass(descriptor)) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "private member of class"))
        }' @ [49:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isAnnotationClass' @ [49:29] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [49:47] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [50:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [50:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'WRONG_EXTERNAL_DECLARATION' @ [50:46] ==> public final val WRONG_EXTERNAL_DECLARATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [50:73] ==> @NotNull public open fun on(@NotNull p0: KtExpression, @NotNull p1: String): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [50:76] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'if (descriptor is ClassDescriptor && descriptor.isData) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "data class"))
        }
        else if (descriptor is PropertyAccessorDescriptor && isDirectlyExternal(declaration, descriptor)) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "property accessor"))
        }
        else if (descriptor is ClassDescriptor && descriptor.isInner) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "inner class"))
        }
        else if (isPrivateMemberOfExternalClass(descriptor)) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "private member of class"))
        }' @ [52:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [52:18] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [52:51] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'isData' @ [52:62] ==> public final val ClassDescriptor.isData: Boolean[MyPropertyDescriptor]

'diagnosticHolder' @ [53:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [53:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'WRONG_EXTERNAL_DECLARATION' @ [53:46] ==> public final val WRONG_EXTERNAL_DECLARATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [53:73] ==> @NotNull public open fun on(@NotNull p0: KtExpression, @NotNull p1: String): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [53:76] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'if (descriptor is PropertyAccessorDescriptor && isDirectlyExternal(declaration, descriptor)) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "property accessor"))
        }
        else if (descriptor is ClassDescriptor && descriptor.isInner) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "inner class"))
        }
        else if (isPrivateMemberOfExternalClass(descriptor)) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "private member of class"))
        }' @ [55:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [55:18] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'isDirectlyExternal' @ [55:62] ==> private final fun isDirectlyExternal(declaration: KtDeclaration, descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [55:81] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [55:94] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [56:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [56:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'WRONG_EXTERNAL_DECLARATION' @ [56:46] ==> public final val WRONG_EXTERNAL_DECLARATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [56:73] ==> @NotNull public open fun on(@NotNull p0: KtExpression, @NotNull p1: String): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [56:76] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'if (descriptor is ClassDescriptor && descriptor.isInner) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "inner class"))
        }
        else if (isPrivateMemberOfExternalClass(descriptor)) {
            diagnosticHolder.report(ErrorsJs.WRONG_EXTERNAL_DECLARATION.on(declaration, "private member of class"))
        }' @ [58:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [58:18] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [58:51] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'isInner' @ [58:62] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'diagnosticHolder' @ [59:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [59:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'WRONG_EXTERNAL_DECLARATION' @ [59:46] ==> public final val WRONG_EXTERNAL_DECLARATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [59:73] ==> @NotNull public open fun on(@NotNull p0: KtExpression, @NotNull p1: String): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [59:76] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'isPrivateMemberOfExternalClass' @ [61:18] ==> private final fun isPrivateMemberOfExternalClass(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'descriptor' @ [61:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [62:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [62:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'WRONG_EXTERNAL_DECLARATION' @ [62:46] ==> public final val WRONG_EXTERNAL_DECLARATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [62:73] ==> @NotNull public open fun on(@NotNull p0: KtExpression, @NotNull p1: String): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [62:76] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [65:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [65:46] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'kind' @ [65:57] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [65:75] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'descriptor' @ [66:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'containingDeclaration' @ [66:24] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'let' @ [66:46] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Boolean

'it' @ [66:52] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [66:77] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [66:80] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [66:98] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'diagnosticHolder' @ [68:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [68:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'NESTED_CLASS_IN_EXTERNAL_INTERFACE' @ [68:46] ==> public final val NESTED_CLASS_IN_EXTERNAL_INTERFACE: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [68:81] ==> @NotNull public open fun on(@NotNull p0: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [68:84] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [71:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [71:58] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'isExtension' @ [71:69] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'when (descriptor) {
                is FunctionDescriptor -> "extension function"
                is PropertyDescriptor -> "extension property"
                else -> "extension member"
            }' @ [72:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'descriptor' @ [72:32] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [77:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [77:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'WRONG_EXTERNAL_DECLARATION' @ [77:46] ==> public final val WRONG_EXTERNAL_DECLARATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [77:73] ==> @NotNull public open fun on(@NotNull p0: KtExpression, @NotNull p1: String): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [77:76] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'target' @ [77:89] ==> val target: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[LocalVariableDescriptor]

'descriptor' @ [80:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [80:46] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'kind' @ [80:57] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ANNOTATION_CLASS' @ [80:75] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'listOfNotNull' @ [81:33] ==> public fun <T : Any> listOfNotNull(element: ClassDescriptor?): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassDescriptor

'descriptor' @ [81:47] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'getSuperClassNotAny' @ [81:58] ==> public fun ClassDescriptor.getSuperClassNotAny(): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [81:83] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'getSuperInterfaces' @ [81:94] ==> public fun ClassDescriptor.getSuperInterfaces(): List<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'toMutableSet' @ [81:116] ==> public fun <T> Iterable<ClassDescriptor>.toMutableSet(): MutableSet<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'descriptor' @ [82:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'kind' @ [82:28] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [82:46] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'descriptor' @ [82:60] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'kind' @ [82:71] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_ENTRY' @ [82:89] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'superClasses' @ [83:17] ==> val superClasses: MutableSet<ClassDescriptor> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[LocalVariableDescriptor]

'removeAll' @ [83:30] ==> public fun <T> MutableIterable<ClassDescriptor>.removeAll(predicate: (ClassDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'it' @ [83:42] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'fqNameUnsafe' @ [83:45] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'FQ_NAMES' @ [83:76] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'_enum' @ [83:85] ==> public final val _enum: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'superClasses' @ [85:17] ==> val superClasses: MutableSet<ClassDescriptor> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[LocalVariableDescriptor]

'any' @ [85:30] ==> public inline fun <T> Iterable<ClassDescriptor>.any(predicate: (ClassDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'!' @ [85:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNativeObject' @ [85:54] ==> public open fun isNativeObject(@NotNull descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'it' @ [85:69] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [85:76] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'fqNameSafe' @ [85:79] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'FQ_NAMES' @ [85:108] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'throwable' @ [85:117] ==> public final val throwable: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'diagnosticHolder' @ [86:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [86:34] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_TYPE_EXTENDS_NON_EXTERNAL_TYPE' @ [86:50] ==> public final val EXTERNAL_TYPE_EXTENDS_NON_EXTERNAL_TYPE: (DiagnosticFactory0<(KtElement..KtElement?)>..DiagnosticFactory0<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [86:90] ==> @NotNull public open fun on(@NotNull p0: KtElement): SimpleDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [86:93] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [90:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [90:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'isInline' @ [90:60] ==> public final val FunctionDescriptor.isInline: Boolean[MyPropertyDescriptor]

'diagnosticHolder' @ [91:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [91:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'INLINE_EXTERNAL_DECLARATION' @ [91:46] ==> public final val INLINE_EXTERNAL_DECLARATION: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [91:74] ==> @NotNull public open fun on(@NotNull p0: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [91:77] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [94:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'!' @ [94:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [94:57] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [94:101] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'isDefault' @ [94:112] ==> public final val PropertyAccessorDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'descriptor' @ [95:23] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'valueParameters' @ [95:34] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'p' @ [96:22] ==> val p: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[LocalVariableDescriptor]

'varargElementType' @ [96:24] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'p' @ [96:45] ==> val p: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[LocalVariableDescriptor]

'type' @ [96:47] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'isExtensionFunctionType' @ [96:53] ==> public val KotlinType.isExtensionFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'p' @ [97:35] ==> val p: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[LocalVariableDescriptor]

'source' @ [97:37] ==> public final val ValueParameterDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [97:44] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'declaration' @ [97:72] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [98:21] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [98:38] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION' @ [98:54] ==> public final val EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [98:97] ==> @NotNull public open fun on(@NotNull p0: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'ktParam' @ [98:100] ==> val ktParam: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[LocalVariableDescriptor]

'descriptor' @ [103:47] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'!' @ [104:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [104:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'getter' @ [104:60] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'isDefault' @ [104:68] ==> public final val PropertyGetterDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'descriptor' @ [104:89] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'setter' @ [104:100] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'isDefault' @ [104:108] ==> public final val PropertySetterDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'!' @ [106:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyWithCustomAccessors' @ [106:18] ==> val propertyWithCustomAccessors: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[LocalVariableDescriptor]

'descriptor' @ [106:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'returnType' @ [106:60] ==> public final val CallableMemberDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'isExtensionFunctionType' @ [106:72] ==> public val KotlinType.isExtensionFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'diagnosticHolder' @ [107:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [107:34] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION' @ [107:50] ==> public final val EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [107:93] ==> @NotNull public open fun on(@NotNull p0: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [107:96] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [111:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [111:55] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'isNonAbstractMemberOfInterface' @ [111:66] ==> private final fun CallableMemberDescriptor.isNonAbstractMemberOfInterface(): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'!' @ [112:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [112:14] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'isNullableProperty' @ [112:25] ==> private final fun CallableMemberDescriptor.isNullableProperty(): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'diagnosticHolder' @ [114:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'report' @ [114:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE' @ [114:46] ==> public final val NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [114:88] ==> @NotNull public open fun on(@NotNull p0: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [114:91] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'checkBody' @ [117:9] ==> private final fun checkBody(declaration: KtDeclaration, descriptor: DeclarationDescriptor, diagnosticHolder: DiagnosticSink, bindingContext: BindingContext): Unit defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [117:19] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [117:32] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [117:44] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'bindingContext' @ [117:62] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'checkDelegation' @ [118:9] ==> private final fun checkDelegation(declaration: KtDeclaration, descriptor: DeclarationDescriptor, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [118:25] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [118:38] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [118:50] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'checkAnonymousInitializer' @ [119:9] ==> private final fun checkAnonymousInitializer(declaration: KtDeclaration, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [119:35] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [119:48] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'checkEnumEntry' @ [120:9] ==> private final fun checkEnumEntry(declaration: KtDeclaration, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [120:24] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [120:37] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'checkConstructorPropertyParam' @ [121:9] ==> private final fun checkConstructorPropertyParam(declaration: KtDeclaration, descriptor: DeclarationDescriptor, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [121:39] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [121:52] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [121:64] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [128:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'descriptor' @ [128:42] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'if (declaration is KtDeclarationWithBody && !declaration.hasValidExternalBody(bindingContext)) {
            diagnosticHolder.report(ErrorsJs.WRONG_BODY_OF_EXTERNAL_DECLARATION.on(declaration.bodyExpression!!))
        }
        else if (declaration is KtDeclarationWithInitializer &&
                 declaration.initializer?.isDefinedExternallyExpression(bindingContext) == false
        ) {
            diagnosticHolder.report(ErrorsJs.WRONG_INITIALIZER_OF_EXTERNAL_DECLARATION.on(declaration.initializer!!))
        }' @ [130:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [130:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'!' @ [130:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [130:54] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'hasValidExternalBody' @ [130:66] ==> private final fun KtDeclarationWithBody.hasValidExternalBody(bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'bindingContext' @ [130:87] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [131:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'report' @ [131:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'WRONG_BODY_OF_EXTERNAL_DECLARATION' @ [131:46] ==> public final val WRONG_BODY_OF_EXTERNAL_DECLARATION: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [131:81] ==> @NotNull public open fun on(@NotNull p0: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [131:84] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'bodyExpression' @ [131:96] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'declaration' @ [133:18] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'declaration' @ [134:18] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'initializer' @ [134:30] ==> public final val KtDeclarationWithInitializer.initializer: KtExpression?[MyPropertyDescriptor]

'isDefinedExternallyExpression' @ [134:43] ==> private final fun KtExpression.isDefinedExternallyExpression(bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'bindingContext' @ [134:73] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [136:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'report' @ [136:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'WRONG_INITIALIZER_OF_EXTERNAL_DECLARATION' @ [136:46] ==> public final val WRONG_INITIALIZER_OF_EXTERNAL_DECLARATION: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [136:88] ==> @NotNull public open fun on(@NotNull p0: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [136:91] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'initializer' @ [136:103] ==> public final val KtDeclarationWithInitializer.initializer: KtExpression?[MyPropertyDescriptor]

'declaration' @ [138:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'declaration' @ [139:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'valueParameters' @ [139:46] ==> public final val KtCallableDeclaration.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'mapNotNull' @ [139:62] ==> public inline fun <T, R : Any> Iterable<(KtParameter..KtParameter?)>.mapNotNull(transform: ((KtParameter..KtParameter?)) -> KtExpression?): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <R : Any> -> KtExpression

'it' @ [139:75] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody.<anonymous>[ValueParameterDescriptorImpl]

'defaultValue' @ [139:78] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'!' @ [140:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'defaultValue' @ [140:22] ==> val defaultValue: KtExpression defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[LocalVariableDescriptor]

'isDefinedExternallyExpression' @ [140:35] ==> private final fun KtExpression.isDefinedExternallyExpression(bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'bindingContext' @ [140:65] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [141:21] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[ValueParameterDescriptorImpl]

'report' @ [141:38] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER' @ [141:54] ==> public final val WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [141:101] ==> @NotNull public open fun on(@NotNull p0: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'defaultValue' @ [141:104] ==> val defaultValue: KtExpression defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkBody[LocalVariableDescriptor]

'descriptor' @ [148:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'!' @ [148:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [148:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'isEffectivelyExternal' @ [148:60] ==> public fun MemberDescriptor.isEffectivelyExternal(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'if (declaration is KtClassOrObject) {
            for (superTypeEntry in declaration.superTypeListEntries) {
                when (superTypeEntry) {
                    is KtSuperTypeCallEntry -> {
                        diagnosticHolder.report(ErrorsJs.EXTERNAL_DELEGATED_CONSTRUCTOR_CALL.on(superTypeEntry.valueArgumentList!!))
                    }
                    is KtDelegatedSuperTypeEntry -> {
                        diagnosticHolder.report(ErrorsJs.EXTERNAL_DELEGATION.on(superTypeEntry))
                    }
                }
            }
        }
        else if (declaration is KtSecondaryConstructor) {
            val delegationCall = declaration.getDelegationCall()
            if (!delegationCall.isImplicit) {
                diagnosticHolder.report(ErrorsJs.EXTERNAL_DELEGATED_CONSTRUCTOR_CALL.on(delegationCall))
            }
        }
        else if (declaration is KtProperty && descriptor !is PropertyAccessorDescriptor) {
            declaration.delegate?.let { delegate ->
                diagnosticHolder.report(ErrorsJs.EXTERNAL_DELEGATION.on(delegate))
            }
        }' @ [150:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [150:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'declaration' @ [151:36] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [151:48] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'when (superTypeEntry) {
                    is KtSuperTypeCallEntry -> {
                        diagnosticHolder.report(ErrorsJs.EXTERNAL_DELEGATED_CONSTRUCTOR_CALL.on(superTypeEntry.valueArgumentList!!))
                    }
                    is KtDelegatedSuperTypeEntry -> {
                        diagnosticHolder.report(ErrorsJs.EXTERNAL_DELEGATION.on(superTypeEntry))
                    }
                }' @ [152:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'superTypeEntry' @ [152:23] ==> val superTypeEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[LocalVariableDescriptor]

'diagnosticHolder' @ [154:25] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'report' @ [154:42] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_DELEGATED_CONSTRUCTOR_CALL' @ [154:58] ==> public final val EXTERNAL_DELEGATED_CONSTRUCTOR_CALL: (DiagnosticFactory0<(KtElement..KtElement?)>..DiagnosticFactory0<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [154:94] ==> @NotNull public open fun on(@NotNull p0: KtElement): SimpleDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'superTypeEntry' @ [154:97] ==> val superTypeEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[LocalVariableDescriptor]

'valueArgumentList' @ [154:112] ==> public final val KtSuperTypeCallEntry.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'diagnosticHolder' @ [157:25] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'report' @ [157:42] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_DELEGATION' @ [157:58] ==> public final val EXTERNAL_DELEGATION: (DiagnosticFactory0<(KtElement..KtElement?)>..DiagnosticFactory0<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [157:78] ==> @NotNull public open fun on(@NotNull p0: KtElement): SimpleDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'superTypeEntry' @ [157:81] ==> val superTypeEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[LocalVariableDescriptor]

'if (declaration is KtSecondaryConstructor) {
            val delegationCall = declaration.getDelegationCall()
            if (!delegationCall.isImplicit) {
                diagnosticHolder.report(ErrorsJs.EXTERNAL_DELEGATED_CONSTRUCTOR_CALL.on(delegationCall))
            }
        }
        else if (declaration is KtProperty && descriptor !is PropertyAccessorDescriptor) {
            declaration.delegate?.let { delegate ->
                diagnosticHolder.report(ErrorsJs.EXTERNAL_DELEGATION.on(delegate))
            }
        }' @ [162:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [162:18] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'declaration' @ [163:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'getDelegationCall' @ [163:46] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'!' @ [164:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'delegationCall' @ [164:18] ==> val delegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[LocalVariableDescriptor]

'isImplicit' @ [164:33] ==> public final val KtConstructorDelegationCall.isImplicit: Boolean[MyPropertyDescriptor]

'diagnosticHolder' @ [165:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'report' @ [165:34] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_DELEGATED_CONSTRUCTOR_CALL' @ [165:50] ==> public final val EXTERNAL_DELEGATED_CONSTRUCTOR_CALL: (DiagnosticFactory0<(KtElement..KtElement?)>..DiagnosticFactory0<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [165:86] ==> @NotNull public open fun on(@NotNull p0: KtElement): SimpleDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'delegationCall' @ [165:89] ==> val delegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[LocalVariableDescriptor]

'declaration' @ [168:18] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'descriptor' @ [168:47] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'declaration' @ [169:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'delegate' @ [169:25] ==> public final val KtProperty.delegate: KtPropertyDelegate?[MyPropertyDescriptor]

'let' @ [169:35] ==> @InlineOnly public inline fun <T, R> KtPropertyDelegate.let(block: (KtPropertyDelegate) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPropertyDelegate
    <R> -> Unit

'diagnosticHolder' @ [170:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation[ValueParameterDescriptorImpl]

'report' @ [170:34] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_DELEGATION' @ [170:50] ==> public final val EXTERNAL_DELEGATION: (DiagnosticFactory0<(KtElement..KtElement?)>..DiagnosticFactory0<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [170:70] ==> @NotNull public open fun on(@NotNull p0: KtElement): SimpleDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'delegate' @ [170:73] ==> value-parameter delegate: KtPropertyDelegate defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkDelegation.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [176:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkAnonymousInitializer[ValueParameterDescriptorImpl]

'declaration' @ [178:38] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkAnonymousInitializer[ValueParameterDescriptorImpl]

'getAnonymousInitializers' @ [178:50] ==> public final fun getAnonymousInitializers(): List<KtAnonymousInitializer> defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'diagnosticHolder' @ [179:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkAnonymousInitializer[ValueParameterDescriptorImpl]

'report' @ [179:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_ANONYMOUS_INITIALIZER' @ [179:46] ==> public final val EXTERNAL_ANONYMOUS_INITIALIZER: (DiagnosticFactory0<(KtAnonymousInitializer..KtAnonymousInitializer?)>..DiagnosticFactory0<(KtAnonymousInitializer..KtAnonymousInitializer?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [179:77] ==> @NotNull public open fun on(@NotNull p0: KtAnonymousInitializer): SimpleDiagnostic<(KtAnonymousInitializer..KtAnonymousInitializer?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'anonymousInitializer' @ [179:80] ==> val anonymousInitializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkAnonymousInitializer[LocalVariableDescriptor]

'declaration' @ [184:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkEnumEntry[ValueParameterDescriptorImpl]

'declaration' @ [185:9] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkEnumEntry[ValueParameterDescriptorImpl]

'getBody' @ [185:21] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtEnumEntry[DeserializedSimpleFunctionDescriptor]

'let' @ [185:32] ==> @InlineOnly public inline fun <T, R> KtClassBody.let(block: (KtClassBody) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassBody
    <R> -> Unit

'diagnosticHolder' @ [186:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkEnumEntry[ValueParameterDescriptorImpl]

'report' @ [186:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_ENUM_ENTRY_WITH_BODY' @ [186:46] ==> public final val EXTERNAL_ENUM_ENTRY_WITH_BODY: (DiagnosticFactory0<(KtClassBody..KtClassBody?)>..DiagnosticFactory0<(KtClassBody..KtClassBody?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [186:76] ==> @NotNull public open fun on(@NotNull p0: KtClassBody): SimpleDiagnostic<(KtClassBody..KtClassBody?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'it' @ [186:79] ==> value-parameter it: KtClassBody defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkEnumEntry.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [195:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkConstructorPropertyParam[ValueParameterDescriptorImpl]

'declaration' @ [195:50] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkConstructorPropertyParam[ValueParameterDescriptorImpl]

'descriptor' @ [196:31] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkConstructorPropertyParam[ValueParameterDescriptorImpl]

'containingDeclaration' @ [196:42] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingClass' @ [197:13] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkConstructorPropertyParam[LocalVariableDescriptor]

'isData' @ [197:29] ==> public final val ClassDescriptor.isData: Boolean[MyPropertyDescriptor]

'isAnnotationClass' @ [197:55] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingClass' @ [197:73] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkConstructorPropertyParam[LocalVariableDescriptor]

'diagnosticHolder' @ [198:9] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkConstructorPropertyParam[ValueParameterDescriptorImpl]

'report' @ [198:26] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER' @ [198:42] ==> public final val EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER: (DiagnosticFactory0<(KtParameter..KtParameter?)>..DiagnosticFactory0<(KtParameter..KtParameter?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [198:88] ==> @NotNull public open fun on(@NotNull p0: KtParameter): SimpleDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [198:91] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.checkConstructorPropertyParam[ValueParameterDescriptorImpl]

'declaration' @ [202:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isDirectlyExternal[ValueParameterDescriptorImpl]

'descriptor' @ [202:42] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isDirectlyExternal[ValueParameterDescriptorImpl]

'declaration' @ [204:16] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isDirectlyExternal[ValueParameterDescriptorImpl]

'hasModifier' @ [204:28] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'EXTERNAL_KEYWORD' @ [204:49] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'hasAnnotation' @ [205:33] ==> public open fun hasAnnotation(@NotNull descriptor: DeclarationDescriptor, @NotNull annotation: PredefinedAnnotation): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'descriptor' @ [205:47] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isDirectlyExternal[ValueParameterDescriptorImpl]

'PredefinedAnnotation' @ [205:59] ==> public companion object defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'NATIVE' @ [205:80] ==> enum entry NATIVE defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'descriptor' @ [209:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isPrivateMemberOfExternalClass[ValueParameterDescriptorImpl]

'descriptor' @ [209:57] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isPrivateMemberOfExternalClass[ValueParameterDescriptorImpl]

'visibility' @ [209:68] ==> public final val PropertyAccessorDescriptor.visibility: Visibility[MyPropertyDescriptor]

'descriptor' @ [209:82] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isPrivateMemberOfExternalClass[ValueParameterDescriptorImpl]

'correspondingProperty' @ [209:93] ==> public final val PropertyAccessorDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'visibility' @ [209:115] ==> public final val PropertyDescriptor.visibility: Visibility[MyPropertyDescriptor]

'descriptor' @ [210:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isPrivateMemberOfExternalClass[ValueParameterDescriptorImpl]

'descriptor' @ [210:48] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isPrivateMemberOfExternalClass[ValueParameterDescriptorImpl]

'visibility' @ [210:59] ==> public final val MemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE' @ [210:86] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'descriptor' @ [212:37] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isPrivateMemberOfExternalClass[ValueParameterDescriptorImpl]

'containingDeclaration' @ [212:48] ==> public final val MemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'isNativeObject' @ [213:33] ==> public open fun isNativeObject(@NotNull descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'containingDeclaration' @ [213:48] ==> val containingDeclaration: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isPrivateMemberOfExternalClass[LocalVariableDescriptor]

'modality' @ [217:13] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [217:25] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [217:34] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'isInterface' @ [217:62] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingDeclaration' @ [217:74] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'this' @ [218:13] ==> <this> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isNonAbstractMemberOfInterface[ReceiverParameterDescriptorImpl]

'this' @ [220:65] ==> <this> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isNullableProperty[ReceiverParameterDescriptorImpl]

'isNullableType' @ [220:105] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [220:120] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'!' @ [223:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasBody' @ [223:14] ==> public abstract fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'bodyExpression' @ [224:20] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'when {
            !hasBlockBody() -> body.isDefinedExternallyExpression(bindingContext)
            body is KtBlockExpression -> {
                val statement = body.statements.singleOrNull() ?: return false
                statement.isDefinedExternallyExpression(bindingContext)
            }
            else -> false
        }' @ [225:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'!' @ [226:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasBlockBody' @ [226:14] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'body' @ [226:32] ==> val body: KtExpression defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.hasValidExternalBody[LocalVariableDescriptor]

'isDefinedExternallyExpression' @ [226:37] ==> private final fun KtExpression.isDefinedExternallyExpression(bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'bindingContext' @ [226:67] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.hasValidExternalBody[ValueParameterDescriptorImpl]

'body' @ [227:13] ==> val body: KtExpression defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.hasValidExternalBody[LocalVariableDescriptor]

'body' @ [228:33] ==> val body: KtExpression defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.hasValidExternalBody[LocalVariableDescriptor]

'statements' @ [228:38] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'singleOrNull' @ [228:49] ==> public fun <T> List<(KtExpression..KtExpression?)>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'statement' @ [229:17] ==> val statement: KtExpression defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.hasValidExternalBody[LocalVariableDescriptor]

'isDefinedExternallyExpression' @ [229:27] ==> private final fun KtExpression.isDefinedExternallyExpression(bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[SimpleFunctionDescriptorImpl]

'bindingContext' @ [229:57] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.hasValidExternalBody[ValueParameterDescriptorImpl]

'getResolvedCall' @ [236:26] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [236:42] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isDefinedExternallyExpression[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [236:59] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'descriptor' @ [237:25] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isDefinedExternallyExpression[LocalVariableDescriptor]

'containingDeclaration' @ [237:36] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'DEFINED_EXTERNALLY_PROPERTY_NAMES' @ [238:16] ==> public final val DEFINED_EXTERNALLY_PROPERTY_NAMES: Set<FqNameUnsafe> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker[PropertyDescriptorImpl]

'any' @ [238:50] ==> public inline fun <T> Iterable<FqNameUnsafe>.any(predicate: (FqNameUnsafe) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqNameUnsafe

'container' @ [238:56] ==> val container: PackageFragmentDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isDefinedExternallyExpression[LocalVariableDescriptor]

'fqNameUnsafe' @ [238:66] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'it' @ [238:82] ==> value-parameter it: FqNameUnsafe defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isDefinedExternallyExpression.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [238:85] ==> @NotNull public open fun parent(): FqNameUnsafe defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'descriptor' @ [238:97] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isDefinedExternallyExpression[LocalVariableDescriptor]

'name' @ [238:108] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'it' @ [238:116] ==> value-parameter it: FqNameUnsafe defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsExternalChecker.isDefinedExternallyExpression.<anonymous>[ValueParameterDescriptorImpl]

'shortName' @ [238:119] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

