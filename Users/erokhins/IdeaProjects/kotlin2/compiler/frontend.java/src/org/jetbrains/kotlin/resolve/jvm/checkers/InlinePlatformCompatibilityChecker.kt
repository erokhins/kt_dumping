'doCheck' @ [37:27] ==> public final fun doCheck(): Boolean defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.Companion[SimpleFunctionDescriptorImpl]

'!' @ [40:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'doCheck' @ [40:14] ==> private final val doCheck: Boolean defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker[PropertyDescriptorImpl]

'resolvedCall' @ [42:35] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.check[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [42:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'!' @ [43:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInline' @ [43:25] ==> public open fun isInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'resultingDescriptor' @ [43:34] ==> val resultingDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.check[LocalVariableDescriptor]

'if (resultingDescriptor is PropertyDescriptor && InlineUtil.isInline(resultingDescriptor.getter)) {
            //TODO: we should distinguish setter usage from getter one, now we could report wrong diagnostic on non-inline setter
            //var prop: Int
            // inline get
            // set
            //
            // prop  - resolved call with property descriptor and we should report error
            // prop = 1 - resolved call with setter for whole expression and property descriptor for left part,
            //              so we couldn't distinguish is this expression for setter or for getter and will report wrong diagnostic
            }
            else {
                return
            }' @ [44:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'resultingDescriptor' @ [44:17] ==> val resultingDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.check[LocalVariableDescriptor]

'isInline' @ [44:73] ==> public open fun isInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'resultingDescriptor' @ [44:82] ==> val resultingDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.check[LocalVariableDescriptor]

'getter' @ [44:102] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'getDirectMember' @ [59:45] ==> @NotNull public open fun getDirectMember(@NotNull p0: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'resultingDescriptor' @ [59:61] ==> val resultingDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.check[LocalVariableDescriptor]

'getBytecodeVersionIfDeserializedDescriptor' @ [60:39] ==> public final fun getBytecodeVersionIfDeserializedDescriptor(funOrProperty: DeclarationDescriptor): Int? defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.Companion[SimpleFunctionDescriptorImpl]

'propertyOrFun' @ [60:82] ==> val propertyOrFun: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.check[LocalVariableDescriptor]

'jvmTarget' @ [62:40] ==> public final val jvmTarget: JvmTarget defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker[PropertyDescriptorImpl]

'bytecodeVersion' @ [62:50] ==> public final val bytecodeVersion: Int defined in org.jetbrains.kotlin.config.JvmTarget[PropertyDescriptorImpl]

'compilingBytecodeVersion' @ [63:13] ==> val compilingBytecodeVersion: Int defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.check[LocalVariableDescriptor]

'inliningBytecodeVersion' @ [63:40] ==> val inliningBytecodeVersion: Int defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.check[LocalVariableDescriptor]

'context' @ [64:13] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.check[ValueParameterDescriptorImpl]

'trace' @ [64:21] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [64:27] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INLINE_FROM_HIGHER_PLATFORM' @ [64:44] ==> public final val INLINE_FROM_HIGHER_PLATFORM: (DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [64:72] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: String, @NotNull p2: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'reportOn' @ [65:21] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.check[ValueParameterDescriptorImpl]

'getDescription' @ [66:31] ==> public final fun getDescription(bytecodeVersion: Int): String defined in org.jetbrains.kotlin.config.JvmTarget.Companion[SimpleFunctionDescriptorImpl]

'inliningBytecodeVersion' @ [66:46] ==> val inliningBytecodeVersion: Int defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.check[LocalVariableDescriptor]

'getDescription' @ [67:31] ==> public final fun getDescription(bytecodeVersion: Int): String defined in org.jetbrains.kotlin.config.JvmTarget.Companion[SimpleFunctionDescriptorImpl]

'compilingBytecodeVersion' @ [67:46] ==> val compilingBytecodeVersion: Int defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.check[LocalVariableDescriptor]

'!=' @ [73:25] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getProperty' @ [73:42] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'funOrProperty' @ [76:17] ==> value-parameter funOrProperty: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.Companion.getBytecodeVersionIfDeserializedDescriptor[ValueParameterDescriptorImpl]

'funOrProperty' @ [78:41] ==> value-parameter funOrProperty: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.Companion.getBytecodeVersionIfDeserializedDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [78:55] ==> public final val DeserializedCallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [80:26] ==> val containingDeclaration: ClassOrPackageFragmentDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.Companion.getBytecodeVersionIfDeserializedDescriptor[LocalVariableDescriptor]

'source' @ [80:48] ==> public final val ClassOrPackageFragmentDescriptor.source: SourceElement[MyPropertyDescriptor]

'when (source) {
                        is KotlinJvmBinarySourceElement -> source.binaryClass
                        is KotlinJvmBinaryPackageSourceElement -> source.getContainingBinaryClass(funOrProperty)
                        else -> null
                    }' @ [82:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinJvmBinaryClass?, entry1: KotlinJvmBinaryClass?, entry2: KotlinJvmBinaryClass?): KotlinJvmBinaryClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinJvmBinaryClass?

'source' @ [82:27] ==> val source: SourceElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.Companion.getBytecodeVersionIfDeserializedDescriptor[LocalVariableDescriptor]

'source' @ [83:60] ==> val source: SourceElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.Companion.getBytecodeVersionIfDeserializedDescriptor[LocalVariableDescriptor]

'binaryClass' @ [83:67] ==> public final val binaryClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinarySourceElement[DeserializedPropertyDescriptor]

'source' @ [84:67] ==> val source: SourceElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.Companion.getBytecodeVersionIfDeserializedDescriptor[LocalVariableDescriptor]

'getContainingBinaryClass' @ [84:74] ==> public final fun getContainingBinaryClass(descriptor: DeserializedMemberDescriptor): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryPackageSourceElement[DeserializedSimpleFunctionDescriptor]

'funOrProperty' @ [84:99] ==> value-parameter funOrProperty: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.Companion.getBytecodeVersionIfDeserializedDescriptor[ValueParameterDescriptorImpl]

'binaryClass' @ [88:20] ==> val binaryClass: FileBasedKotlinClass defined in org.jetbrains.kotlin.resolve.jvm.checkers.InlinePlatformCompatibilityChecker.Companion.getBytecodeVersionIfDeserializedDescriptor[LocalVariableDescriptor]

'classVersion' @ [88:32] ==> public final val FileBasedKotlinClass.classVersion: Int[MyPropertyDescriptor]

