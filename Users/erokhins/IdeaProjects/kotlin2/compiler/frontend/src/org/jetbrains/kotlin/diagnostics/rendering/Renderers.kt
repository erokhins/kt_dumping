'getInstance' @ [58:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'Renderers' @ [58:42] ==> public object Renderers defined in org.jetbrains.kotlin.diagnostics.rendering in file Renderers.kt[FakeCallableDescriptorForObject]

'java' @ [58:59] ==> public val <T> KClass<Renderers>.java: Class<Renderers> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Renderers

'JvmField' @ [60:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [60:31] ==> public fun <O> Renderer(block: (Any) -> String): DiagnosticParameterRenderer<Any> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> Any

'element' @ [62:13] ==> value-parameter element: Any defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.TO_STRING.<anonymous>[ValueParameterDescriptorImpl]

'LOG' @ [63:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'warn' @ [63:17] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [63:22] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [65:80] ==> value-parameter element: Any defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.TO_STRING.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [67:9] ==> value-parameter element: Any defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.TO_STRING.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [67:17] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'JvmField' @ [70:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [70:28] ==> public fun <O> Renderer(block: (String) -> String): DiagnosticParameterRenderer<String> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> String

'it' @ [70:47] ==> value-parameter it: String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.STRING.<anonymous>[ValueParameterDescriptorImpl]

'JvmField' @ [72:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [72:31] ==> public fun <O> Renderer(block: (Throwable) -> String): DiagnosticParameterRenderer<Throwable> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> Throwable

'StringWriter' @ [73:22] ==> public constructor StringWriter() defined in java.io.StringWriter[JavaClassConstructorDescriptor]

'it' @ [74:9] ==> value-parameter it: Throwable defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.THROWABLE.<anonymous>[ValueParameterDescriptorImpl]

'printStackTrace' @ [74:12] ==> public open fun printStackTrace(p0: (PrintWriter..PrintWriter?)): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'PrintWriter' @ [74:28] ==> public constructor PrintWriter(p0: (Writer..Writer?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'writer' @ [74:40] ==> val writer: StringWriter defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.THROWABLE.<anonymous>[LocalVariableDescriptor]

'first' @ [75:20] ==> @NotNull @Contract public open fun first(@NotNull p0: String, p1: Int, p2: Boolean): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'writer' @ [75:26] ==> val writer: StringWriter defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.THROWABLE.<anonymous>[LocalVariableDescriptor]

'toString' @ [75:33] ==> public open fun toString(): String defined in java.io.StringWriter[JavaMethodDescriptor]

'JvmField' @ [78:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [78:26] ==> public fun <O> Renderer(block: (Named) -> String): DiagnosticParameterRenderer<Named> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> Named

'it' @ [78:44] ==> value-parameter it: Named defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.NAME.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [78:47] ==> public final val Named.name: Name[MyPropertyDescriptor]

'asString' @ [78:52] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'JvmField' @ [80:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [80:30] ==> public fun <O> Renderer(block: (ModuleDescriptor) -> String): DiagnosticParameterRenderer<ModuleDescriptor> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> ModuleDescriptor

'it' @ [81:24] ==> value-parameter it: ModuleDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.PLATFORM.<anonymous>[ValueParameterDescriptorImpl]

'getMultiTargetPlatform' @ [81:27] ==> public fun ModuleDescriptor.getMultiTargetPlatform(): MultiTargetPlatform? defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'+' @ [82:9] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [82:13] ==> value-parameter it: ModuleDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.PLATFORM.<anonymous>[ValueParameterDescriptorImpl]

'getCapability' @ [82:16] ==> public abstract fun <T> getCapability(capability: ModuleDescriptor.Capability<ModuleInfo>): ModuleInfo? defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleInfo

'ModuleInfo' @ [82:30] ==> public companion object defined in org.jetbrains.kotlin.analyzer.ModuleInfo[FakeCallableDescriptorForObject]

'Capability' @ [82:41] ==> public final val Capability: ModuleDescriptor.Capability<ModuleInfo> defined in org.jetbrains.kotlin.analyzer.ModuleInfo.Companion[PropertyDescriptorImpl]

'displayedName' @ [82:54] ==> public open val displayedName: String defined in org.jetbrains.kotlin.analyzer.ModuleInfo[PropertyDescriptorImpl]

'when (platform) {
            MultiTargetPlatform.Common -> ""
            is MultiTargetPlatform.Specific -> " for " + platform.platform
            null -> ""
        }' @ [82:78] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'platform' @ [82:84] ==> val platform: MultiTargetPlatform? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.PLATFORM.<anonymous>[LocalVariableDescriptor]

'MultiTargetPlatform' @ [83:13] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'Common' @ [83:33] ==> public object Common : MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'+' @ [84:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'platform' @ [84:58] ==> val platform: MultiTargetPlatform? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.PLATFORM.<anonymous>[LocalVariableDescriptor]

'platform' @ [84:67] ==> public final val platform: String defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific[DeserializedPropertyDescriptor]

'JvmField' @ [89:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [89:32] ==> public fun <O> Renderer(block: (Visibility) -> String): DiagnosticParameterRenderer<Visibility> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> Visibility

'if (it == Visibilities.INVISIBLE_FAKE)
            "invisible (private in a supertype)"
        else it.displayName' @ [90:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [90:13] ==> value-parameter it: Visibility defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.VISIBILITY.<anonymous>[ValueParameterDescriptorImpl]

'INVISIBLE_FAKE' @ [90:32] ==> @NotNull public final val INVISIBLE_FAKE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'it' @ [92:14] ==> value-parameter it: Visibility defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.VISIBILITY.<anonymous>[ValueParameterDescriptorImpl]

'displayName' @ [92:17] ==> public open val displayName: String defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'JvmField' @ [95:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [95:48] ==> public fun <O> Renderer(block: (DeclarationDescriptor) -> String): DiagnosticParameterRenderer<DeclarationDescriptor> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> DeclarationDescriptor

'when (it) {
            is PackageFragmentDescriptor -> "package "
            is ClassDescriptor -> "${it.renderKind()} "
            is TypeAliasDescriptor -> "typealias "
            is ConstructorDescriptor -> "constructor "
            is TypeAliasConstructorDescriptor -> "typealias constructor "
            is PropertyGetterDescriptor -> "property getter "
            is PropertySetterDescriptor -> "property setter "
            is FunctionDescriptor -> "function "
            is PropertyDescriptor -> "property "
            else -> throw AssertionError("Unexpected declaration kind: $it")
        }' @ [96:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String, entry6: String, entry7: String, entry8: String, entry9: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'it' @ [96:46] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.DECLARATION_NAME_WITH_KIND.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [98:38] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.DECLARATION_NAME_WITH_KIND.<anonymous>[ValueParameterDescriptorImpl]

'renderKind' @ [98:41] ==> public fun ClassDescriptor.renderKind(): String defined in org.jetbrains.kotlin.diagnostics.rendering in file DiagnosticRendererUtil.kt[SimpleFunctionDescriptorImpl]

'AssertionError' @ [106:27] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'it' @ [106:73] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.DECLARATION_NAME_WITH_KIND.<anonymous>[ValueParameterDescriptorImpl]

'declarationKindWithSpace' @ [108:11] ==> val declarationKindWithSpace: String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.DECLARATION_NAME_WITH_KIND.<anonymous>[LocalVariableDescriptor]

'it' @ [108:38] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.DECLARATION_NAME_WITH_KIND.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [108:41] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [108:46] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'JvmField' @ [111:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [111:60] ==> public fun <O> Renderer(block: (DeclarationDescriptor) -> String): DiagnosticParameterRenderer<DeclarationDescriptor> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> DeclarationDescriptor

'if (DescriptorUtils.isTopLevelDeclaration(it) && it is DeclarationDescriptorWithVisibility && it.visibility == Visibilities.PRIVATE) {
            "file"
        }
        else {
            val containingDeclaration = it.containingDeclaration
            if (containingDeclaration is PackageFragmentDescriptor) {
                containingDeclaration.fqName.asString().wrapIntoQuotes()
            }
            else {
                containingDeclaration!!.name.asString().wrapIntoQuotes()
            }
        }' @ [112:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isTopLevelDeclaration' @ [112:29] ==> public open fun isTopLevelDeclaration(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [112:51] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.NAME_OF_CONTAINING_DECLARATION_OR_FILE.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [112:58] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.NAME_OF_CONTAINING_DECLARATION_OR_FILE.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [112:103] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.NAME_OF_CONTAINING_DECLARATION_OR_FILE.<anonymous>[ValueParameterDescriptorImpl]

'visibility' @ [112:106] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE' @ [112:133] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'it' @ [116:41] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.NAME_OF_CONTAINING_DECLARATION_OR_FILE.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [116:44] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'if (containingDeclaration is PackageFragmentDescriptor) {
                containingDeclaration.fqName.asString().wrapIntoQuotes()
            }
            else {
                containingDeclaration!!.name.asString().wrapIntoQuotes()
            }' @ [117:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'containingDeclaration' @ [117:17] ==> val containingDeclaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.NAME_OF_CONTAINING_DECLARATION_OR_FILE.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [118:17] ==> val containingDeclaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.NAME_OF_CONTAINING_DECLARATION_OR_FILE.<anonymous>[LocalVariableDescriptor]

'fqName' @ [118:39] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'asString' @ [118:46] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'wrapIntoQuotes' @ [118:57] ==> private final fun String.wrapIntoQuotes(): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'containingDeclaration' @ [121:17] ==> val containingDeclaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.NAME_OF_CONTAINING_DECLARATION_OR_FILE.<anonymous>[LocalVariableDescriptor]

'name' @ [121:41] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [121:46] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'wrapIntoQuotes' @ [121:57] ==> private final fun String.wrapIntoQuotes(): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'JvmField' @ [126:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [126:34] ==> public fun <O> Renderer(block: (PsiElement) -> String): DiagnosticParameterRenderer<PsiElement> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> PsiElement

'it' @ [126:57] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.ELEMENT_TEXT.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [126:60] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'JvmField' @ [128:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [128:38] ==> public fun <O> Renderer(block: (KtNamedDeclaration) -> String): DiagnosticParameterRenderer<KtNamedDeclaration> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> KtNamedDeclaration

'it' @ [128:69] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.DECLARATION_NAME.<anonymous>[ValueParameterDescriptorImpl]

'nameAsSafeName' @ [128:72] ==> public final val KtNamedDeclaration.nameAsSafeName: Name[MyPropertyDescriptor]

'asString' @ [128:87] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'JvmField' @ [130:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [130:44] ==> public fun <O> Renderer(block: (KtClassOrObject) -> String): DiagnosticParameterRenderer<KtClassOrObject> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> KtClassOrObject

'classOrObject' @ [132:20] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_CLASS_OR_OBJECT.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [132:34] ==> public final val KtClassOrObject.name: String?[MyPropertyDescriptor]

'let' @ [132:40] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [132:50] ==> value-parameter it: String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_CLASS_OR_OBJECT.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'wrapIntoQuotes' @ [132:53] ==> private final fun String.wrapIntoQuotes(): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'if (classOrObject is KtClass) "Class" + name else "Object" + name' @ [133:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'classOrObject' @ [133:13] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_CLASS_OR_OBJECT.<anonymous>[ValueParameterDescriptorImpl]

'+' @ [133:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [133:49] ==> val name: String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_CLASS_OR_OBJECT.<anonymous>[LocalVariableDescriptor]

'+' @ [133:59] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [133:70] ==> val name: String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_CLASS_OR_OBJECT.<anonymous>[LocalVariableDescriptor]

'JvmField' @ [136:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [136:49] ==> public fun <O> Renderer(block: (ClassifierDescriptorWithTypeParameters) -> String): DiagnosticParameterRenderer<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> ClassifierDescriptorWithTypeParameters

'it' @ [136:100] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_CLASS_OR_OBJECT_NAME.<anonymous>[ValueParameterDescriptorImpl]

'renderKindWithName' @ [136:103] ==> public fun ClassifierDescriptorWithTypeParameters.renderKindWithName(): String defined in org.jetbrains.kotlin.diagnostics.rendering in file DiagnosticRendererUtil.kt[SimpleFunctionDescriptorImpl]

'JvmField' @ [138:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'SmartTypeRenderer' @ [138:33] ==> public constructor SmartTypeRenderer(baseRenderer: DescriptorRenderer) defined in org.jetbrains.kotlin.diagnostics.rendering.SmartTypeRenderer[ClassConstructorDescriptorImpl]

'DescriptorRenderer' @ [138:51] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [138:70] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'withOptions' @ [138:88] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'parameterNamesInFunctionalTypes' @ [138:102] ==> public abstract var parameterNamesInFunctionalTypes: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'JvmField' @ [140:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [140:46] ==> public fun <O> Renderer(block: (Variance) -> String): DiagnosticParameterRenderer<Variance> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> Variance

'when (variance) {
            Variance.INVARIANT -> "invariant"
            Variance.IN_VARIANCE -> "in"
            Variance.OUT_VARIANCE -> "out"
        }' @ [142:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'variance' @ [142:15] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_POSITION_VARIANCE.<anonymous>[ValueParameterDescriptorImpl]

'INVARIANT' @ [143:22] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [144:22] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [145:22] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'JvmField' @ [149:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [149:37] ==> public fun <O> Renderer(block: (Collection<ResolvedCall<*>>) -> String): DiagnosticParameterRenderer<Collection<ResolvedCall<*>>> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> Collection<ResolvedCall<*>>

'calls' @ [151:27] ==> value-parameter calls: Collection<ResolvedCall<*>> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.AMBIGUOUS_CALLS.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [151:33] ==> public inline fun <T, R> Iterable<ResolvedCall<*>>.map(transform: (ResolvedCall<*>) -> (CallableDescriptor..CallableDescriptor?)): List<(CallableDescriptor..CallableDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<*>
    <R> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'it' @ [151:39] ==> value-parameter it: ResolvedCall<*> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.AMBIGUOUS_CALLS.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [151:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'RenderingContext' @ [152:23] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'Impl' @ [152:40] ==> public constructor Impl(objectsToRender: Collection<Any?>) defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl[ClassConstructorDescriptorImpl]

'descriptors' @ [152:45] ==> val descriptors: List<(CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.AMBIGUOUS_CALLS.<anonymous>[LocalVariableDescriptor]

'descriptors' @ [153:9] ==> val descriptors: List<(CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.AMBIGUOUS_CALLS.<anonymous>[LocalVariableDescriptor]

'sortedWith' @ [154:18] ==> public fun <T> Iterable<(CallableDescriptor..CallableDescriptor?)>.sortedWith(comparator: Comparator<in (CallableDescriptor..CallableDescriptor?)> /* = Comparator<in (CallableDescriptor..CallableDescriptor?)> */): List<(CallableDescriptor..CallableDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'INSTANCE' @ [154:46] ==> public final val INSTANCE: (MemberComparator..MemberComparator?) defined in org.jetbrains.kotlin.resolve.MemberComparator[JavaPropertyDescriptor]

'joinToString' @ [155:18] ==> public fun <T> Iterable<(CallableDescriptor..CallableDescriptor?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((CallableDescriptor..CallableDescriptor?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'FQ_NAMES_IN_TYPES' @ [155:66] ==> @JvmField public final val FQ_NAMES_IN_TYPES: SmartDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'render' @ [155:84] ==> public open fun render(obj: DeclarationDescriptor, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.SmartDescriptorRenderer[SimpleFunctionDescriptorImpl]

'it' @ [155:91] ==> value-parameter it: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.AMBIGUOUS_CALLS.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [155:95] ==> val context: RenderingContext.Impl defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.AMBIGUOUS_CALLS.<anonymous>[LocalVariableDescriptor]

'JvmStatic' @ [158:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'ContextDependentRenderer' @ [158:87] ==> public fun <O> ContextDependentRenderer(block: (Collection<T>, RenderingContext) -> String): DiagnosticParameterRenderer<Collection<T>> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> Collection<T>

'buildString' @ [160:9] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'collection' @ [161:28] ==> value-parameter collection: Collection<T> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.commaSeparated.<anonymous>[ValueParameterDescriptorImpl]

'iterator' @ [161:39] ==> public abstract fun iterator(): Iterator<T> defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'iterator' @ [162:20] ==> val iterator: Iterator<T> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.commaSeparated.<anonymous>.<anonymous>[LocalVariableDescriptor]

'hasNext' @ [162:29] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [163:28] ==> val iterator: Iterator<T> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.commaSeparated.<anonymous>.<anonymous>[LocalVariableDescriptor]

'next' @ [163:37] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'append' @ [164:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'itemRenderer' @ [164:24] ==> value-parameter itemRenderer: DiagnosticParameterRenderer<T> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.commaSeparated[ValueParameterDescriptorImpl]

'render' @ [164:37] ==> public abstract fun render(obj: T, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticParameterRenderer[SimpleFunctionDescriptorImpl]

'next' @ [164:44] ==> val next: T defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.commaSeparated.<anonymous>.<anonymous>[LocalVariableDescriptor]

'context' @ [164:50] ==> value-parameter context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.commaSeparated.<anonymous>[ValueParameterDescriptorImpl]

'iterator' @ [165:21] ==> val iterator: Iterator<T> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.commaSeparated.<anonymous>.<anonymous>[LocalVariableDescriptor]

'hasNext' @ [165:30] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'append' @ [166:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'JvmField' @ [172:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [172:71] ==> public fun <O> Renderer(block: (InferenceErrorData) -> String): DiagnosticParameterRenderer<InferenceErrorData> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> InferenceErrorData

'renderConflictingSubstitutionsInferenceError' @ [173:9] ==> @JvmStatic public final fun renderConflictingSubstitutionsInferenceError(inferenceErrorData: InferenceErrorData, result: TabledDescriptorRenderer): TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'it' @ [173:54] ==> value-parameter it: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.TYPE_INFERENCE_CONFLICTING_SUBSTITUTIONS_RENDERER.<anonymous>[ValueParameterDescriptorImpl]

'create' @ [173:83] ==> public open fun create(): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'toString' @ [173:93] ==> @Override public open fun toString(): String defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'JvmField' @ [176:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [176:72] ==> public fun <O> Renderer(block: (InferenceErrorData) -> String): DiagnosticParameterRenderer<InferenceErrorData> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> InferenceErrorData

'renderParameterConstraintError' @ [177:9] ==> @JvmStatic public final fun renderParameterConstraintError(inferenceErrorData: InferenceErrorData, renderer: TabledDescriptorRenderer): TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'it' @ [177:40] ==> value-parameter it: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.TYPE_INFERENCE_PARAMETER_CONSTRAINT_ERROR_RENDERER.<anonymous>[ValueParameterDescriptorImpl]

'create' @ [177:69] ==> public open fun create(): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'toString' @ [177:79] ==> @Override public open fun toString(): String defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'JvmField' @ [180:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [180:74] ==> public fun <O> Renderer(block: (InferenceErrorData) -> String): DiagnosticParameterRenderer<InferenceErrorData> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> InferenceErrorData

'renderNoInformationForParameterError' @ [181:9] ==> @JvmStatic public final fun renderNoInformationForParameterError(inferenceErrorData: InferenceErrorData, result: TabledDescriptorRenderer): TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'it' @ [181:46] ==> value-parameter it: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.TYPE_INFERENCE_NO_INFORMATION_FOR_PARAMETER_RENDERER.<anonymous>[ValueParameterDescriptorImpl]

'create' @ [181:75] ==> public open fun create(): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'toString' @ [181:85] ==> @Override public open fun toString(): String defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'JvmField' @ [184:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [184:66] ==> public fun <O> Renderer(block: (InferenceErrorData) -> String): DiagnosticParameterRenderer<InferenceErrorData> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> InferenceErrorData

'renderUpperBoundViolatedInferenceError' @ [185:9] ==> @JvmStatic public final fun renderUpperBoundViolatedInferenceError(inferenceErrorData: InferenceErrorData, result: TabledDescriptorRenderer): TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'it' @ [185:48] ==> value-parameter it: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.TYPE_INFERENCE_UPPER_BOUND_VIOLATED_RENDERER.<anonymous>[ValueParameterDescriptorImpl]

'create' @ [185:77] ==> public open fun create(): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'toString' @ [185:87] ==> @Override public open fun toString(): String defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'JvmField' @ [188:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [188:66] ==> public fun <O> Renderer(block: (InferenceErrorData) -> String): DiagnosticParameterRenderer<InferenceErrorData> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> InferenceErrorData

'renderCannotCaptureTypeParameterError' @ [189:9] ==> @JvmStatic public final fun renderCannotCaptureTypeParameterError(inferenceErrorData: InferenceErrorData, result: TabledDescriptorRenderer): TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'it' @ [189:47] ==> value-parameter it: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.TYPE_INFERENCE_CANNOT_CAPTURE_TYPES_RENDERER.<anonymous>[ValueParameterDescriptorImpl]

'create' @ [189:76] ==> public open fun create(): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'toString' @ [189:86] ==> @Override public open fun toString(): String defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'JvmStatic' @ [192:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'LOG' @ [195:9] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'assertTrue' @ [195:13] ==> @Contract public open fun assertTrue(p0: Boolean, @Nullable @NonNls p1: Any?): Boolean defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'inferenceErrorData' @ [195:24] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'constraintSystem' @ [195:43] ==> @NotNull public final val constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'status' @ [195:60] ==> public abstract val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'hasConflictingConstraints' @ [195:67] ==> public abstract fun hasConflictingConstraints(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemStatus[SimpleFunctionDescriptorImpl]

'debugMessage' @ [196:24] ==> private final fun debugMessage(message: String, inferenceErrorData: InferenceErrorData): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [196:123] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'newArrayList' @ [198:44] ==> @GwtCompatible public open fun <E : (Any..Any?)> newArrayList(): (ArrayList<(CallableDescriptor..CallableDescriptor?)>..ArrayList<(CallableDescriptor..CallableDescriptor?)>?) defined in com.google.common.collect.Lists[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CallableDescriptor

'getSubstitutorsForConflictingParameters' @ [199:44] ==> @NotNull public open fun getSubstitutorsForConflictingParameters(@NotNull constraintSystem: ConstraintSystem): (MutableCollection<(TypeSubstitutor..TypeSubstitutor?)>..Collection<(TypeSubstitutor..TypeSubstitutor?)>) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintsUtil[JavaMethodDescriptor]

'inferenceErrorData' @ [199:84] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'constraintSystem' @ [199:103] ==> @NotNull public final val constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'substitutors' @ [200:29] ==> val substitutors: (MutableCollection<(TypeSubstitutor..TypeSubstitutor?)>..Collection<(TypeSubstitutor..TypeSubstitutor?)>) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'inferenceErrorData' @ [201:41] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'descriptor' @ [201:60] ==> @NotNull public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'substitute' @ [201:71] ==> public abstract fun substitute(substitutor: TypeSubstitutor): (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[DeserializedSimpleFunctionDescriptor]

'substitutor' @ [201:82] ==> val substitutor: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'substitutedDescriptors' @ [202:13] ==> val substitutedDescriptors: (ArrayList<(CallableDescriptor..CallableDescriptor?)>..ArrayList<(CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'add' @ [202:36] ==> public open fun add(element: (CallableDescriptor..CallableDescriptor?)): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'substitutedDescriptor' @ [202:40] ==> val substitutedDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'getFirstConflictingVariable' @ [205:56] ==> @Nullable public open fun getFirstConflictingVariable(@NotNull constraintSystem: ConstraintSystem): TypeVariable? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintsUtil[JavaMethodDescriptor]

'inferenceErrorData' @ [205:84] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'constraintSystem' @ [205:103] ==> @NotNull public final val constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'firstConflictingVariable' @ [206:13] ==> val firstConflictingVariable: TypeVariable? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'LOG' @ [207:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'error' @ [207:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'debugMessage' @ [207:23] ==> private final fun debugMessage(message: String, inferenceErrorData: InferenceErrorData): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [207:110] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'result' @ [208:20] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'result' @ [211:9] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'text' @ [211:16] ==> public open fun text(@NotNull textRenderer: TabledDescriptorRenderer.TextRenderer): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'newText' @ [211:21] ==> public open fun newText(): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'normal' @ [212:30] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'strong' @ [213:30] ==> public open fun strong(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'firstConflictingVariable' @ [213:37] ==> val firstConflictingVariable: TypeVariable? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'name' @ [213:62] ==> public final val name: Name defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'normal' @ [214:30] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'newTable' @ [215:21] ==> public open fun newTable(): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'result' @ [216:9] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'table' @ [216:16] ==> public open fun table(@NotNull tableRenderer: TabledDescriptorRenderer.TableRenderer): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'table' @ [216:22] ==> val table: (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'table' @ [217:9] ==> val table: (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'descriptor' @ [217:15] ==> public open fun descriptor(descriptor: (CallableDescriptor..CallableDescriptor?)): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TableRenderer[JavaMethodDescriptor]

'inferenceErrorData' @ [217:26] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'descriptor' @ [217:45] ==> @NotNull public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'text' @ [217:57] ==> public open fun text(@NotNull text: String): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TableRenderer[JavaMethodDescriptor]

'substitutedDescriptors' @ [219:39] ==> val substitutedDescriptors: (ArrayList<(CallableDescriptor..CallableDescriptor?)>..ArrayList<(CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'getReceiverParameterType' @ [220:48] ==> @Nullable public open fun getReceiverParameterType(@Nullable p0: ReceiverParameterDescriptor?): KotlinType? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'substitutedDescriptor' @ [220:73] ==> val substitutedDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'extensionReceiverParameter' @ [220:95] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'newHashSet' @ [222:39] ==> public open fun <E : (Any..Any?)> newHashSet(): (HashSet<(ConstraintPosition..ConstraintPosition?)>..HashSet<(ConstraintPosition..ConstraintPosition?)>?) defined in com.google.common.collect.Sets[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ConstraintPosition

'newArrayList' @ [223:40] ==> @GwtCompatible public open fun <E : (Any..Any?)> newArrayList(): (ArrayList<(KotlinType..KotlinType?)>..ArrayList<(KotlinType..KotlinType?)>?) defined in com.google.common.collect.Lists[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'substitutedDescriptor' @ [224:46] ==> val substitutedDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'valueParameters' @ [224:68] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'parameterTypes' @ [225:17] ==> val parameterTypes: (ArrayList<(KotlinType..KotlinType?)>..ArrayList<(KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'add' @ [225:32] ==> public open fun add(element: (KotlinType..KotlinType?)): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'valueParameterDescriptor' @ [225:36] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'type' @ [225:61] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'valueParameterDescriptor' @ [226:21] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'index' @ [226:46] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'inferenceErrorData' @ [226:55] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'valueArgumentsTypes' @ [226:74] ==> @NotNull public final val valueArgumentsTypes: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'size' @ [226:94] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'inferenceErrorData' @ [227:34] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'valueArgumentsTypes' @ [227:53] ==> @NotNull public final val valueArgumentsTypes: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'get' @ [227:73] ==> public abstract fun get(index: Int): (KotlinType..KotlinType?) defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'valueParameterDescriptor' @ [227:77] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'index' @ [227:102] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'!' @ [228:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [228:40] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [228:48] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'actualType' @ [228:60] ==> val actualType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'valueParameterDescriptor' @ [228:72] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'type' @ [228:97] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'errorPositions' @ [229:21] ==> val errorPositions: (HashSet<(ConstraintPosition..ConstraintPosition?)>..HashSet<(ConstraintPosition..ConstraintPosition?)>?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'add' @ [229:36] ==> public open fun add(element: (ConstraintPosition..ConstraintPosition?)): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'VALUE_PARAMETER_POSITION' @ [229:40] ==> enum entry VALUE_PARAMETER_POSITION defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[FakeCallableDescriptorForObject]

'position' @ [229:65] ==> public final fun position(index: Int): ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[SimpleFunctionDescriptorImpl]

'valueParameterDescriptor' @ [229:74] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'index' @ [229:99] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'receiverType' @ [233:17] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'inferenceErrorData' @ [233:41] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'receiverArgumentType' @ [233:60] ==> @Nullable public final val receiverArgumentType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'!' @ [234:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [234:39] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [234:47] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'inferenceErrorData' @ [234:59] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'receiverArgumentType' @ [234:78] ==> @Nullable public final val receiverArgumentType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'receiverType' @ [234:100] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'errorPositions' @ [235:17] ==> val errorPositions: (HashSet<(ConstraintPosition..ConstraintPosition?)>..HashSet<(ConstraintPosition..ConstraintPosition?)>?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'add' @ [235:32] ==> public open fun add(element: (ConstraintPosition..ConstraintPosition?)): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'RECEIVER_POSITION' @ [235:36] ==> enum entry RECEIVER_POSITION defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[FakeCallableDescriptorForObject]

'position' @ [235:54] ==> public final fun position(): ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[SimpleFunctionDescriptorImpl]

'table' @ [238:13] ==> val table: (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'functionArgumentTypeList' @ [238:19] ==> public final fun functionArgumentTypeList(@Nullable receiverType: KotlinType?, @NotNull argumentTypes: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>), @NotNull isErrorPosition: ((ConstraintPosition..ConstraintPosition?)) -> Boolean): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TableRenderer[MyFunctionDescriptor]

'receiverType' @ [238:44] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'parameterTypes' @ [238:58] ==> val parameterTypes: (ArrayList<(KotlinType..KotlinType?)>..ArrayList<(KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'errorPositions' @ [238:76] ==> val errorPositions: (HashSet<(ConstraintPosition..ConstraintPosition?)>..HashSet<(ConstraintPosition..ConstraintPosition?)>?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'contains' @ [238:91] ==> public open fun contains(element: (ConstraintPosition..ConstraintPosition?)): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [238:100] ==> value-parameter it: (ConstraintPosition..ConstraintPosition?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError.<anonymous>[ValueParameterDescriptorImpl]

'table' @ [241:9] ==> val table: (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[LocalVariableDescriptor]

'text' @ [241:15] ==> public open fun text(@NotNull text: String): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TableRenderer[JavaMethodDescriptor]

'functionArgumentTypeList' @ [241:41] ==> public open fun functionArgumentTypeList(@Nullable receiverType: KotlinType?, @NotNull argumentTypes: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TableRenderer[JavaMethodDescriptor]

'inferenceErrorData' @ [241:66] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'receiverArgumentType' @ [241:85] ==> @Nullable public final val receiverArgumentType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'inferenceErrorData' @ [241:107] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'valueArgumentsTypes' @ [241:126] ==> @NotNull public final val valueArgumentsTypes: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'result' @ [243:16] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConflictingSubstitutionsInferenceError[ValueParameterDescriptorImpl]

'JvmStatic' @ [246:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'inferenceErrorData' @ [249:32] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderParameterConstraintError[ValueParameterDescriptorImpl]

'constraintSystem' @ [249:51] ==> @NotNull public final val constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'status' @ [249:68] ==> public abstract val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'constraintErrors' @ [249:75] ==> public abstract val constraintErrors: List<ConstraintError> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemStatus[PropertyDescriptorImpl]

'constraintErrors' @ [250:30] ==> val constraintErrors: List<ConstraintError> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderParameterConstraintError[LocalVariableDescriptor]

'filter' @ [250:47] ==> public inline fun <T> Iterable<ConstraintError>.filter(predicate: (ConstraintError) -> Boolean): List<ConstraintError> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstraintError

'it' @ [250:56] ==> value-parameter it: ConstraintError defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderParameterConstraintError.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [250:89] ==> public inline fun <T, R> Iterable<ConstraintError>.map(transform: (ConstraintError) -> ConstraintPosition): List<ConstraintPosition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstraintError
    <R> -> ConstraintPosition

'it' @ [250:95] ==> value-parameter it: ConstraintError defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderParameterConstraintError.<anonymous>[ValueParameterDescriptorImpl]

'constraintPosition' @ [250:98] ==> public final val constraintPosition: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintError[PropertyDescriptorImpl]

'renderer' @ [251:16] ==> value-parameter renderer: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderParameterConstraintError[ValueParameterDescriptorImpl]

'table' @ [251:25] ==> public open fun table(@NotNull tableRenderer: TabledDescriptorRenderer.TableRenderer): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'newTable' @ [253:26] ==> public open fun newTable(): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'descriptor' @ [254:26] ==> public open fun descriptor(descriptor: (CallableDescriptor..CallableDescriptor?)): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TableRenderer[JavaMethodDescriptor]

'inferenceErrorData' @ [254:37] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderParameterConstraintError[ValueParameterDescriptorImpl]

'descriptor' @ [254:56] ==> @NotNull public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'text' @ [255:26] ==> public open fun text(@NotNull text: String): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TableRenderer[JavaMethodDescriptor]

'functionArgumentTypeList' @ [256:26] ==> public final fun functionArgumentTypeList(@Nullable receiverType: KotlinType?, @NotNull argumentTypes: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>), @NotNull isErrorPosition: ((ConstraintPosition..ConstraintPosition?)) -> Boolean): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TableRenderer[MyFunctionDescriptor]

'inferenceErrorData' @ [256:51] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderParameterConstraintError[ValueParameterDescriptorImpl]

'receiverArgumentType' @ [256:70] ==> @Nullable public final val receiverArgumentType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'inferenceErrorData' @ [257:51] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderParameterConstraintError[ValueParameterDescriptorImpl]

'valueArgumentsTypes' @ [257:70] ==> @NotNull public final val valueArgumentsTypes: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'errorPositions' @ [258:53] ==> val errorPositions: List<ConstraintPosition> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderParameterConstraintError[LocalVariableDescriptor]

'contains' @ [258:68] ==> public abstract fun contains(element: ConstraintPosition): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'it' @ [258:77] ==> value-parameter it: (ConstraintPosition..ConstraintPosition?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderParameterConstraintError.<anonymous>[ValueParameterDescriptorImpl]

'JvmStatic' @ [262:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'inferenceErrorData' @ [265:36] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderNoInformationForParameterError[ValueParameterDescriptorImpl]

'constraintSystem' @ [265:55] ==> @NotNull public final val constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'typeVariables' @ [265:72] ==> public abstract val typeVariables: Set<TypeVariable> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'firstOrNull' @ [265:86] ==> public inline fun <T> Iterable<TypeVariable>.firstOrNull(predicate: (TypeVariable) -> Boolean): TypeVariable? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariable

'inferenceErrorData' @ [266:13] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderNoInformationForParameterError[ValueParameterDescriptorImpl]

'constraintSystem' @ [266:32] ==> @NotNull public final val constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'getTypeBounds' @ [266:49] ==> public abstract fun getTypeBounds(typeVariable: TypeVariable): TypeBounds defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[SimpleFunctionDescriptorImpl]

'variable' @ [266:63] ==> value-parameter variable: TypeVariable defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderNoInformationForParameterError.<anonymous>[ValueParameterDescriptorImpl]

'values' @ [266:73] ==> public abstract val values: Collection<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds[PropertyDescriptorImpl]

'isEmpty' @ [266:80] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'result' @ [267:21] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderNoInformationForParameterError[ValueParameterDescriptorImpl]

'apply' @ [267:28] ==> @InlineOnly public inline fun <T> TabledDescriptorRenderer.apply(block: TabledDescriptorRenderer.() -> Unit): TabledDescriptorRenderer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TabledDescriptorRenderer

'LOG' @ [268:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'error' @ [268:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'debugMessage' @ [268:23] ==> private final fun debugMessage(message: String, inferenceErrorData: InferenceErrorData): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [268:111] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderNoInformationForParameterError[ValueParameterDescriptorImpl]

'result' @ [271:16] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderNoInformationForParameterError[ValueParameterDescriptorImpl]

'text' @ [272:18] ==> public open fun text(@NotNull textRenderer: TabledDescriptorRenderer.TextRenderer): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'newText' @ [272:23] ==> public open fun newText(): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'normal' @ [272:33] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'strong' @ [273:32] ==> public open fun strong(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'firstUnknownVariable' @ [273:39] ==> val firstUnknownVariable: TypeVariable defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderNoInformationForParameterError[LocalVariableDescriptor]

'name' @ [273:60] ==> public final val name: Name defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'normal' @ [274:32] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'table' @ [275:18] ==> public open fun table(@NotNull tableRenderer: TabledDescriptorRenderer.TableRenderer): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'newTable' @ [275:24] ==> public open fun newTable(): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'descriptor' @ [276:33] ==> public open fun descriptor(descriptor: (CallableDescriptor..CallableDescriptor?)): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TableRenderer[JavaMethodDescriptor]

'inferenceErrorData' @ [276:44] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderNoInformationForParameterError[ValueParameterDescriptorImpl]

'descriptor' @ [276:63] ==> @NotNull public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'text' @ [277:33] ==> public open fun text(@NotNull text: String): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TableRenderer[JavaMethodDescriptor]

'JvmStatic' @ [280:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'inferenceErrorData' @ [283:32] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'constraintSystem' @ [283:51] ==> @NotNull public final val constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'constraintSystem' @ [284:22] ==> val constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'status' @ [284:39] ==> public abstract val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'LOG' @ [285:9] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'assertTrue' @ [285:13] ==> @Contract public open fun assertTrue(p0: Boolean, @Nullable @NonNls p1: Any?): Boolean defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'status' @ [285:24] ==> val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'hasViolatedUpperBound' @ [285:31] ==> public abstract fun hasViolatedUpperBound(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemStatus[SimpleFunctionDescriptorImpl]

'debugMessage' @ [286:24] ==> private final fun debugMessage(message: String, inferenceErrorData: InferenceErrorData): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [286:102] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'constraintSystem' @ [288:44] ==> val constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'filterConstraintsOut' @ [288:61] ==> public fun ConstraintSystem.filterConstraintsOut(excludePositionKind: ConstraintPositionKind): ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference in file constraintSystemUtils.kt[SimpleFunctionDescriptorImpl]

'TYPE_BOUND_POSITION' @ [288:82] ==> enum entry TYPE_BOUND_POSITION defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[FakeCallableDescriptorForObject]

'inferenceErrorData' @ [289:39] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'descriptor' @ [289:58] ==> @NotNull public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'typeParameters' @ [289:69] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'firstOrNull' @ [289:84] ==> public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.firstOrNull(predicate: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Boolean): TypeParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'!' @ [290:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkUpperBoundIsSatisfied' @ [290:30] ==> public open fun checkUpperBoundIsSatisfied(@NotNull constraintSystem: ConstraintSystem, @NotNull typeParameter: TypeParameterDescriptor, @NotNull call: Call, substituteOtherTypeParametersInBound: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintsUtil[JavaMethodDescriptor]

'systemWithoutWeakConstraints' @ [290:57] ==> val systemWithoutWeakConstraints: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'it' @ [290:87] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError.<anonymous>[ValueParameterDescriptorImpl]

'inferenceErrorData' @ [290:91] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'call' @ [290:110] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'typeParameterDescriptor' @ [293:13] ==> val typeParameterDescriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'inferenceErrorData' @ [294:17] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'descriptor' @ [294:36] ==> @NotNull public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor' @ [295:17] ==> private final fun renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor(inferenceErrorData: InferenceErrorData, result: TabledDescriptorRenderer, systemWithoutWeakConstraints: ConstraintSystem): TabledDescriptorRenderer? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [296:25] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'result' @ [296:45] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'systemWithoutWeakConstraints' @ [296:53] ==> val systemWithoutWeakConstraints: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'let' @ [297:20] ==> @InlineOnly public inline fun <T, R> TabledDescriptorRenderer.let(block: (TabledDescriptorRenderer) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TabledDescriptorRenderer
    <R> -> Nothing

'it' @ [298:28] ==> value-parameter it: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError.<anonymous>[ValueParameterDescriptorImpl]

'if (status.hasConflictingConstraints())
                renderConflictingSubstitutionsInferenceError(inferenceErrorData, result)
            else {
                LOG.error(debugMessage("There is no type parameter with violated upper bound for 'upper bound violated' error", inferenceErrorData))
                result
            }' @ [302:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TabledDescriptorRenderer, elseBranch: TabledDescriptorRenderer): TabledDescriptorRenderer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TabledDescriptorRenderer

'status' @ [302:24] ==> val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'hasConflictingConstraints' @ [302:31] ==> public abstract fun hasConflictingConstraints(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemStatus[SimpleFunctionDescriptorImpl]

'renderConflictingSubstitutionsInferenceError' @ [303:17] ==> @JvmStatic public final fun renderConflictingSubstitutionsInferenceError(inferenceErrorData: InferenceErrorData, result: TabledDescriptorRenderer): TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [303:62] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'result' @ [303:82] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'LOG' @ [305:17] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'error' @ [305:21] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'debugMessage' @ [305:27] ==> private final fun debugMessage(message: String, inferenceErrorData: InferenceErrorData): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [305:129] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'result' @ [306:17] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'systemWithoutWeakConstraints' @ [310:28] ==> val systemWithoutWeakConstraints: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'descriptorToVariable' @ [310:57] ==> public fun ConstraintSystem.descriptorToVariable(call: CallHandle, descriptor: TypeParameterDescriptor): TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference in file constraintSystemUtils.kt[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [310:78] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'call' @ [310:97] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'toHandle' @ [310:102] ==> public fun Call.toHandle(): CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference in file TypeVariable.kt[SimpleFunctionDescriptorImpl]

'typeParameterDescriptor' @ [310:114] ==> val typeParameterDescriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'systemWithoutWeakConstraints' @ [311:45] ==> val systemWithoutWeakConstraints: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'getTypeBounds' @ [311:74] ==> public abstract fun getTypeBounds(typeVariable: TypeVariable): TypeBounds defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[SimpleFunctionDescriptorImpl]

'typeVariable' @ [311:88] ==> val typeVariable: TypeVariable defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'value' @ [311:102] ==> public open val value: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds[PropertyDescriptorImpl]

'inferredValueForTypeParameter' @ [312:13] ==> val inferredValueForTypeParameter: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'LOG' @ [313:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'error' @ [313:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'debugMessage' @ [313:23] ==> private final fun debugMessage(message: String, inferenceErrorData: InferenceErrorData): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'+' @ [313:36] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'typeParameterDescriptor' @ [314:36] ==> val typeParameterDescriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'name' @ [314:60] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'systemWithoutWeakConstraints' @ [314:76] ==> val systemWithoutWeakConstraints: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'inferenceErrorData' @ [314:106] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'result' @ [315:20] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'result' @ [318:9] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'text' @ [318:16] ==> public open fun text(@NotNull textRenderer: TabledDescriptorRenderer.TextRenderer): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'newText' @ [318:21] ==> public open fun newText(): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'normal' @ [319:30] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'strong' @ [320:30] ==> public open fun strong(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'typeParameterDescriptor' @ [320:37] ==> val typeParameterDescriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'name' @ [320:61] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'normal' @ [321:30] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'table' @ [322:18] ==> public open fun table(@NotNull tableRenderer: TabledDescriptorRenderer.TableRenderer): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'newTable' @ [322:24] ==> public open fun newTable(): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'descriptor' @ [323:33] ==> public open fun descriptor(descriptor: (CallableDescriptor..CallableDescriptor?)): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TableRenderer[JavaMethodDescriptor]

'inferenceErrorData' @ [323:44] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'descriptor' @ [323:63] ==> @NotNull public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'typeParameterDescriptor' @ [326:28] ==> val typeParameterDescriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'upperBounds' @ [326:52] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'systemWithoutWeakConstraints' @ [327:58] ==> val systemWithoutWeakConstraints: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'resultingSubstitutor' @ [327:87] ==> public abstract val resultingSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'substitute' @ [327:108] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'upperBound' @ [327:119] ==> val upperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'INVARIANT' @ [327:140] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'upperBoundWithSubstitutedInferredTypes' @ [328:17] ==> val upperBoundWithSubstitutedInferredTypes: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'!' @ [329:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [329:39] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [329:47] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'inferredValueForTypeParameter' @ [329:59] ==> val inferredValueForTypeParameter: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'upperBoundWithSubstitutedInferredTypes' @ [329:90] ==> val upperBoundWithSubstitutedInferredTypes: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'violatedUpperBound' @ [330:17] ==> var violatedUpperBound: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'upperBoundWithSubstitutedInferredTypes' @ [330:38] ==> val upperBoundWithSubstitutedInferredTypes: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'violatedUpperBound' @ [334:13] ==> var violatedUpperBound: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'LOG' @ [335:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'error' @ [335:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'debugMessage' @ [335:23] ==> private final fun debugMessage(message: String, inferenceErrorData: InferenceErrorData): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'+' @ [335:36] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'typeParameterDescriptor' @ [336:36] ==> val typeParameterDescriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'name' @ [336:60] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'inferenceErrorData' @ [336:109] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'result' @ [337:20] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'RenderingContext' @ [341:23] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'of' @ [341:40] ==> @JvmStatic public final fun of(vararg objectsToRender: Any?): RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion[SimpleFunctionDescriptorImpl]

'inferredValueForTypeParameter' @ [341:43] ==> val inferredValueForTypeParameter: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'violatedUpperBound' @ [341:74] ==> var violatedUpperBound: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'result' @ [342:28] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'typeRenderer' @ [342:35] ==> public final val TabledDescriptorRenderer.typeRenderer: DiagnosticParameterRenderer<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'result' @ [343:9] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'text' @ [343:16] ==> public open fun text(@NotNull textRenderer: TabledDescriptorRenderer.TextRenderer): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'newText' @ [343:21] ==> public open fun newText(): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'normal' @ [344:30] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'error' @ [345:30] ==> public open fun error(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'typeRenderer' @ [345:36] ==> val typeRenderer: DiagnosticParameterRenderer<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'render' @ [345:49] ==> public abstract fun render(obj: (KotlinType..KotlinType?), renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticParameterRenderer[SimpleFunctionDescriptorImpl]

'inferredValueForTypeParameter' @ [345:56] ==> val inferredValueForTypeParameter: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'context' @ [345:87] ==> val context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'normal' @ [346:30] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'strong' @ [347:30] ==> public open fun strong(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'typeRenderer' @ [347:37] ==> val typeRenderer: DiagnosticParameterRenderer<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'render' @ [347:50] ==> public abstract fun render(obj: (KotlinType..KotlinType?), renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticParameterRenderer[SimpleFunctionDescriptorImpl]

'violatedUpperBound' @ [347:57] ==> var violatedUpperBound: KotlinType? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'context' @ [347:77] ==> val context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[LocalVariableDescriptor]

'result' @ [348:16] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceError[ValueParameterDescriptorImpl]

'inferenceErrorData' @ [356:26] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[ValueParameterDescriptorImpl]

'descriptor' @ [356:45] ==> @NotNull public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'descriptor' @ [357:13] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'LOG' @ [358:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'error' @ [358:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'descriptor' @ [358:69] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'result' @ [359:20] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[ValueParameterDescriptorImpl]

'descriptor' @ [362:46] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'typeParameters' @ [362:57] ==> public final val TypeAliasConstructorDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [362:72] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> KotlinType?): List<KotlinType?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> KotlinType?

'systemWithoutWeakConstraints' @ [363:32] ==> value-parameter systemWithoutWeakConstraints: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[ValueParameterDescriptorImpl]

'descriptorToVariable' @ [363:61] ==> public fun ConstraintSystem.descriptorToVariable(call: CallHandle, descriptor: TypeParameterDescriptor): TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference in file constraintSystemUtils.kt[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [363:82] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[ValueParameterDescriptorImpl]

'call' @ [363:101] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'toHandle' @ [363:106] ==> public fun Call.toHandle(): CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference in file TypeVariable.kt[SimpleFunctionDescriptorImpl]

'it' @ [363:118] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor.<anonymous>[ValueParameterDescriptorImpl]

'systemWithoutWeakConstraints' @ [364:13] ==> value-parameter systemWithoutWeakConstraints: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[ValueParameterDescriptorImpl]

'getTypeBounds' @ [364:42] ==> public abstract fun getTypeBounds(typeVariable: TypeVariable): TypeBounds defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[SimpleFunctionDescriptorImpl]

'typeVariable' @ [364:56] ==> val typeVariable: TypeVariable defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor.<anonymous>[LocalVariableDescriptor]

'value' @ [364:70] ==> public open val value: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds[PropertyDescriptorImpl]

'create' @ [366:55] ==> @NotNull public open fun create(@NotNull p0: TypeSubstitution): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'TypeConstructorSubstitution' @ [366:71] ==> public constructor TypeConstructorSubstitution() defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[DeserializedClassConstructorDescriptor]

'key' @ [368:38] ==> value-parameter key: TypeConstructor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor.<no name provided>.get[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [368:42] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'typeDescriptor' @ [369:21] ==> val typeDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor.<no name provided>.get[LocalVariableDescriptor]

'containingDeclaration' @ [369:36] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [369:61] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'typeAliasDescriptor' @ [369:72] ==> public abstract val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor[DeserializedPropertyDescriptor]

'inferredTypesForTypeParameters' @ [370:24] ==> val inferredTypesForTypeParameters: List<KotlinType?> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'typeDescriptor' @ [370:55] ==> val typeDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor.<no name provided>.get[LocalVariableDescriptor]

'index' @ [370:70] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'let' @ [370:78] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> TypeProjectionImpl): TypeProjectionImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> TypeProjectionImpl

'inferenceErrorData' @ [374:33] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[ValueParameterDescriptorImpl]

'constraintSystem' @ [374:52] ==> @NotNull public final val constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'status' @ [374:69] ==> public abstract val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'constraintErrors' @ [374:76] ==> public abstract val constraintErrors: List<ConstraintError> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemStatus[PropertyDescriptorImpl]

'constraintError' @ [375:34] ==> val constraintError: ConstraintError defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'constraintPosition' @ [375:50] ==> public final val constraintPosition: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintError[PropertyDescriptorImpl]

'getValidityConstraintForConstituentType' @ [375:69] ==> public fun ConstraintPosition.getValidityConstraintForConstituentType(): ValidityConstraintForConstituentType? defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition in file ConstraintPosition.kt[SimpleFunctionDescriptorImpl]

'inferredTypeSubstitutor' @ [377:38] ==> val inferredTypeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'safeSubstitute' @ [377:62] ==> @NotNull public open fun safeSubstitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'constraintInfo' @ [377:77] ==> val constraintInfo: ValidityConstraintForConstituentType defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'bound' @ [377:92] ==> public final val bound: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ValidityConstraintForConstituentType[PropertyDescriptorImpl]

'INVARIANT' @ [377:108] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'inferredTypeSubstitutor' @ [378:41] ==> val inferredTypeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'safeSubstitute' @ [378:65] ==> @NotNull public open fun safeSubstitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'constraintInfo' @ [378:80] ==> val constraintInfo: ValidityConstraintForConstituentType defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'typeArgument' @ [378:95] ==> public final val typeArgument: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ValidityConstraintForConstituentType[PropertyDescriptorImpl]

'INVARIANT' @ [378:118] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'RenderingContext' @ [380:27] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'of' @ [380:44] ==> @JvmStatic public final fun of(vararg objectsToRender: Any?): RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion[SimpleFunctionDescriptorImpl]

'violatingInferredType' @ [380:47] ==> val violatingInferredType: KotlinType defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'violatedUpperBound' @ [380:70] ==> val violatedUpperBound: KotlinType defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'result' @ [381:32] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[ValueParameterDescriptorImpl]

'typeRenderer' @ [381:39] ==> public final val TabledDescriptorRenderer.typeRenderer: DiagnosticParameterRenderer<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'result' @ [383:13] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[ValueParameterDescriptorImpl]

'text' @ [383:20] ==> public open fun text(@NotNull textRenderer: TabledDescriptorRenderer.TextRenderer): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'newText' @ [383:25] ==> public open fun newText(): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'normal' @ [383:35] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'strong' @ [383:71] ==> public open fun strong(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'constraintInfo' @ [383:78] ==> val constraintInfo: ValidityConstraintForConstituentType defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'typeParameter' @ [383:93] ==> public final val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ValidityConstraintForConstituentType[PropertyDescriptorImpl]

'name' @ [383:107] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'normal' @ [384:34] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'table' @ [385:22] ==> public open fun table(@NotNull tableRenderer: TabledDescriptorRenderer.TableRenderer): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'newTable' @ [385:28] ==> public open fun newTable(): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'descriptor' @ [385:39] ==> public open fun descriptor(descriptor: (CallableDescriptor..CallableDescriptor?)): (TabledDescriptorRenderer.TableRenderer..TabledDescriptorRenderer.TableRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TableRenderer[JavaMethodDescriptor]

'inferenceErrorData' @ [385:50] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[ValueParameterDescriptorImpl]

'descriptor' @ [385:69] ==> @NotNull public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'result' @ [387:13] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[ValueParameterDescriptorImpl]

'text' @ [387:20] ==> public open fun text(@NotNull textRenderer: TabledDescriptorRenderer.TextRenderer): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'newText' @ [387:25] ==> public open fun newText(): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'normal' @ [387:35] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'error' @ [387:79] ==> public open fun error(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'typeRenderer' @ [387:85] ==> val typeRenderer: DiagnosticParameterRenderer<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'render' @ [387:98] ==> public abstract fun render(obj: (KotlinType..KotlinType?), renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticParameterRenderer[SimpleFunctionDescriptorImpl]

'violatingInferredType' @ [387:105] ==> val violatingInferredType: KotlinType defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'context' @ [387:128] ==> val context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'normal' @ [388:34] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'strong' @ [388:66] ==> public open fun strong(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'typeRenderer' @ [388:73] ==> val typeRenderer: DiagnosticParameterRenderer<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'render' @ [388:86] ==> public abstract fun render(obj: (KotlinType..KotlinType?), renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticParameterRenderer[SimpleFunctionDescriptorImpl]

'violatedUpperBound' @ [388:93] ==> val violatedUpperBound: KotlinType defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'context' @ [388:113] ==> val context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[LocalVariableDescriptor]

'result' @ [390:20] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderUpperBoundViolatedInferenceErrorForTypeAliasConstructor[ValueParameterDescriptorImpl]

'JvmStatic' @ [396:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'inferenceErrorData' @ [399:22] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[ValueParameterDescriptorImpl]

'constraintSystem' @ [399:41] ==> @NotNull public final val constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'system' @ [400:22] ==> val system: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'status' @ [400:29] ==> public abstract val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'constraintErrors' @ [400:36] ==> public abstract val constraintErrors: List<ConstraintError> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemStatus[PropertyDescriptorImpl]

'errors' @ [401:50] ==> val errors: List<ConstraintError> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'firstIsInstanceOrNull' @ [401:57] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): CannotCapture? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> CannotCapture

'typeVariable' @ [401:97] ==> public final val typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.CannotCapture[PropertyDescriptorImpl]

'typeVariableWithCapturedConstraint' @ [402:13] ==> val typeVariableWithCapturedConstraint: TypeVariable? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'LOG' @ [403:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'error' @ [403:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'debugMessage' @ [403:23] ==> private final fun debugMessage(message: String, inferenceErrorData: InferenceErrorData): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [403:103] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[ValueParameterDescriptorImpl]

'result' @ [404:20] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[ValueParameterDescriptorImpl]

'system' @ [407:26] ==> val system: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'getTypeBounds' @ [407:33] ==> public abstract fun getTypeBounds(typeVariable: TypeVariable): TypeBounds defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[SimpleFunctionDescriptorImpl]

'typeVariableWithCapturedConstraint' @ [407:47] ==> val typeVariableWithCapturedConstraint: TypeVariable? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'typeBounds' @ [408:37] ==> val typeBounds: TypeBounds defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'bounds' @ [408:48] ==> public abstract val bounds: Collection<TypeBounds.Bound> defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds[PropertyDescriptorImpl]

'firstOrNull' @ [408:55] ==> public inline fun <T> Iterable<TypeBounds.Bound>.firstOrNull(predicate: (TypeBounds.Bound) -> Boolean): TypeBounds.Bound? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Bound

'it' @ [408:69] ==> value-parameter it: TypeBounds.Bound defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError.<anonymous>[ValueParameterDescriptorImpl]

'constrainingType' @ [408:72] ==> public final val constrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.Bound[PropertyDescriptorImpl]

'isCaptured' @ [408:89] ==> public fun KotlinType.isCaptured(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference[DeserializedSimpleFunctionDescriptor]

'boundWithCapturedType' @ [409:39] ==> val boundWithCapturedType: TypeBounds.Bound? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'constrainingType' @ [409:62] ==> public final val constrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.Bound[PropertyDescriptorImpl]

'constructor' @ [409:80] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'capturedTypeConstructor' @ [410:13] ==> val capturedTypeConstructor: CapturedTypeConstructor? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'LOG' @ [411:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'error' @ [411:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'debugMessage' @ [411:23] ==> private final fun debugMessage(message: String, inferenceErrorData: InferenceErrorData): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [411:130] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[ValueParameterDescriptorImpl]

'result' @ [412:20] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[ValueParameterDescriptorImpl]

'typeVariableWithCapturedConstraint' @ [415:29] ==> val typeVariableWithCapturedConstraint: TypeVariable? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'originalTypeParameter' @ [415:64] ==> public final val originalTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'getUpperBoundsAsType' @ [416:42] ==> @NotNull public open fun getUpperBoundsAsType(@NotNull descriptor: TypeParameterDescriptor): KotlinType defined in org.jetbrains.kotlin.types.TypeIntersector[JavaMethodDescriptor]

'typeParameter' @ [416:63] ==> val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'assert' @ [418:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [418:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableAny' @ [418:32] ==> public open fun isNullableAny(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'upperBound' @ [418:46] ==> val upperBound: KotlinType defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'capturedTypeConstructor' @ [418:61] ==> val capturedTypeConstructor: CapturedTypeConstructor? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'typeProjection' @ [418:85] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[DeserializedPropertyDescriptor]

'projectionKind' @ [418:100] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'IN_VARIANCE' @ [418:127] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'+' @ [423:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'result' @ [423:54] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[ValueParameterDescriptorImpl]

'typeRenderer' @ [423:61] ==> public final val TabledDescriptorRenderer.typeRenderer: DiagnosticParameterRenderer<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'render' @ [423:74] ==> public abstract fun render(obj: (KotlinType..KotlinType?), renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticParameterRenderer[SimpleFunctionDescriptorImpl]

'upperBound' @ [423:81] ==> val upperBound: KotlinType defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'RenderingContext' @ [423:93] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'of' @ [423:110] ==> @JvmStatic public final fun of(vararg objectsToRender: Any?): RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion[SimpleFunctionDescriptorImpl]

'upperBound' @ [423:113] ==> val upperBound: KotlinType defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'wrapIntoQuotes' @ [423:126] ==> private final fun String.wrapIntoQuotes(): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'result' @ [426:9] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[ValueParameterDescriptorImpl]

'text' @ [426:16] ==> public open fun text(@NotNull textRenderer: TabledDescriptorRenderer.TextRenderer): (TabledDescriptorRenderer..TabledDescriptorRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'newText' @ [426:21] ==> public open fun newText(): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'normal' @ [426:31] ==> public open fun normal(@NotNull text: Any): (TabledDescriptorRenderer.TextRenderer..TabledDescriptorRenderer.TextRenderer?) defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer.TextRenderer[JavaMethodDescriptor]

'typeParameter' @ [427:17] ==> val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'name' @ [427:31] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'wrapIntoQuotes' @ [427:36] ==> private final fun Name.wrapIntoQuotes(): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'capturedTypeConstructor' @ [429:20] ==> val capturedTypeConstructor: CapturedTypeConstructor? defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'typeProjection' @ [429:44] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[DeserializedPropertyDescriptor]

'toString' @ [429:59] ==> public open fun toString(): String defined in org.jetbrains.kotlin.types.TypeProjection[DeserializedSimpleFunctionDescriptor]

'wrapIntoQuotes' @ [429:70] ==> private final fun String.wrapIntoQuotes(): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'explanation' @ [430:17] ==> val explanation: String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[LocalVariableDescriptor]

'result' @ [432:16] ==> value-parameter result: TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderCannotCaptureTypeParameterError[ValueParameterDescriptorImpl]

'JvmField' @ [435:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [435:42] ==> public fun <O> Renderer(block: (Collection<ClassDescriptor>) -> String): DiagnosticParameterRenderer<Collection<ClassDescriptor>> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> Collection<ClassDescriptor>

'buildString' @ [437:9] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'descriptors' @ [439:32] ==> value-parameter descriptors: Collection<ClassDescriptor> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.CLASSES_OR_SEPARATED.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [440:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'getFqName' @ [440:40] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [440:50] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.CLASSES_OR_SEPARATED.<anonymous>.<anonymous>[LocalVariableDescriptor]

'asString' @ [440:62] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'index' @ [441:17] ==> var index: Int defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.CLASSES_OR_SEPARATED.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (index <= descriptors.size - 2) {
                    append(", ")
                }
                else if (index == descriptors.size - 1) {
                    append(" or ")
                }' @ [442:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'index' @ [442:21] ==> var index: Int defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.CLASSES_OR_SEPARATED.<anonymous>.<anonymous>[LocalVariableDescriptor]

'descriptors' @ [442:30] ==> value-parameter descriptors: Collection<ClassDescriptor> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.CLASSES_OR_SEPARATED.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [442:42] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'append' @ [443:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'index' @ [445:26] ==> var index: Int defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.CLASSES_OR_SEPARATED.<anonymous>.<anonymous>[LocalVariableDescriptor]

'descriptors' @ [445:35] ==> value-parameter descriptors: Collection<ClassDescriptor> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.CLASSES_OR_SEPARATED.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [445:47] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'append' @ [446:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'join' @ [452:100] ==> @NotNull @Contract public final fun <T : (Any..Any?)> join(@NotNull p0: (MutableCollection<out (KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>), @NotNull p1: ((KotlinType..KotlinType?)) -> (String..String?), @NotNull @NonNls p2: String): String defined in com.intellij.openapi.util.text.StringUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinType

'types' @ [452:105] ==> value-parameter types: Collection<KotlinType> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypes[ValueParameterDescriptorImpl]

'RENDER_TYPE' @ [452:114] ==> @JvmField public final val RENDER_TYPE: SmartTypeRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'render' @ [452:126] ==> public open fun render(obj: KotlinType, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.SmartTypeRenderer[SimpleFunctionDescriptorImpl]

'it' @ [452:133] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypes.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [452:137] ==> value-parameter context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypes[ValueParameterDescriptorImpl]

'JvmField' @ [454:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'ContextDependentRenderer' @ [454:48] ==> public fun <O> ContextDependentRenderer(block: (Collection<KotlinType>, RenderingContext) -> String): DiagnosticParameterRenderer<Collection<KotlinType>> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> Collection<KotlinType>

'renderTypes' @ [454:117] ==> private final fun renderTypes(types: Collection<KotlinType>, context: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'types' @ [454:129] ==> value-parameter types: Collection<KotlinType> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_COLLECTION_OF_TYPES.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [454:136] ==> value-parameter context: RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_COLLECTION_OF_TYPES.<anonymous>[ValueParameterDescriptorImpl]

'linkedSetOf' @ [457:26] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<TypeBounds> /* = LinkedHashSet<TypeBounds> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeBounds

'constraintSystem' @ [458:26] ==> value-parameter constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConstraintSystem[ValueParameterDescriptorImpl]

'typeVariables' @ [458:43] ==> public abstract val typeVariables: Set<TypeVariable> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'typeBounds' @ [459:13] ==> val typeBounds: LinkedHashSet<TypeBounds> /* = LinkedHashSet<TypeBounds> */ defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConstraintSystem[LocalVariableDescriptor]

'add' @ [459:24] ==> public open fun add(element: TypeBounds): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'constraintSystem' @ [459:28] ==> value-parameter constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConstraintSystem[ValueParameterDescriptorImpl]

'getTypeBounds' @ [459:45] ==> public abstract fun getTypeBounds(typeVariable: TypeVariable): TypeBounds defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[SimpleFunctionDescriptorImpl]

'variable' @ [459:59] ==> val variable: TypeVariable defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConstraintSystem[LocalVariableDescriptor]

'+' @ [461:16] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'join' @ [462:27] ==> @NotNull @Contract public final fun <T : (Any..Any?)> join(@NotNull p0: (MutableCollection<out (TypeBounds..TypeBounds?)>..Collection<(TypeBounds..TypeBounds?)>), @NotNull p1: ((TypeBounds..TypeBounds?)) -> (String..String?), @NotNull @NonNls p2: String): String defined in com.intellij.openapi.util.text.StringUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TypeBounds

'typeBounds' @ [462:32] ==> val typeBounds: LinkedHashSet<TypeBounds> /* = LinkedHashSet<TypeBounds> */ defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConstraintSystem[LocalVariableDescriptor]

'renderTypeBounds' @ [462:46] ==> private final fun renderTypeBounds(typeBounds: TypeBounds, short: Boolean): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'it' @ [462:63] ==> value-parameter it: (TypeBounds..TypeBounds?) defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConstraintSystem.<anonymous>[ValueParameterDescriptorImpl]

'shortTypeBounds' @ [462:75] ==> value-parameter shortTypeBounds: Boolean defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConstraintSystem[ValueParameterDescriptorImpl]

'getDebugMessageForStatus' @ [463:32] ==> public open fun getDebugMessageForStatus(@NotNull status: ConstraintSystemStatus): (String..String?) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintsUtil[JavaMethodDescriptor]

'constraintSystem' @ [463:57] ==> value-parameter constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderConstraintSystem[ValueParameterDescriptorImpl]

'status' @ [463:74] ==> public abstract val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'when (bound.kind) {
                LOWER_BOUND -> ">: "
                UPPER_BOUND -> "<: "
                else -> ":= "
            }' @ [468:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'bound' @ [468:31] ==> value-parameter bound: TypeBounds.Bound defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [468:37] ==> public final val kind: TypeBounds.BoundKind defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.Bound[PropertyDescriptorImpl]

'LOWER_BOUND' @ [469:17] ==> enum entry LOWER_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'UPPER_BOUND' @ [470:17] ==> enum entry UPPER_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'if (short) DescriptorRenderer.SHORT_NAMES_IN_TYPES else DescriptorRenderer.FQ_NAMES_IN_TYPES' @ [473:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DescriptorRenderer, elseBranch: DescriptorRenderer): DescriptorRenderer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DescriptorRenderer

'short' @ [473:32] ==> value-parameter short: Boolean defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds[ValueParameterDescriptorImpl]

'DescriptorRenderer' @ [473:39] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'SHORT_NAMES_IN_TYPES' @ [473:58] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'DescriptorRenderer' @ [473:84] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [473:103] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'arrow' @ [474:33] ==> val arrow: String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds.<anonymous>[LocalVariableDescriptor]

'renderer' @ [474:41] ==> val renderer: DescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds.<anonymous>[LocalVariableDescriptor]

'renderType' @ [474:50] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'bound' @ [474:61] ==> value-parameter bound: TypeBounds.Bound defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds.<anonymous>[ValueParameterDescriptorImpl]

'constrainingType' @ [474:67] ==> public final val constrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.Bound[PropertyDescriptorImpl]

'if (!bound.isProper) "*" else ""' @ [474:88] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!' @ [474:92] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'bound' @ [474:93] ==> value-parameter bound: TypeBounds.Bound defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds.<anonymous>[ValueParameterDescriptorImpl]

'isProper' @ [474:99] ==> public final val isProper: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.Bound[PropertyDescriptorImpl]

'if (short) renderedBound else renderedBound + '(' + bound.position + ')'' @ [475:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'short' @ [475:17] ==> value-parameter short: Boolean defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds[ValueParameterDescriptorImpl]

'renderedBound' @ [475:24] ==> val renderedBound: String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds.<anonymous>[LocalVariableDescriptor]

'renderedBound' @ [475:43] ==> val renderedBound: String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds.<anonymous>[LocalVariableDescriptor]

'bound' @ [475:65] ==> value-parameter bound: TypeBounds.Bound defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds.<anonymous>[ValueParameterDescriptorImpl]

'position' @ [475:71] ==> public final val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.Bound[PropertyDescriptorImpl]

'typeBounds' @ [477:32] ==> value-parameter typeBounds: TypeBounds defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds[ValueParameterDescriptorImpl]

'typeVariable' @ [477:43] ==> public abstract val typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds[PropertyDescriptorImpl]

'name' @ [477:56] ==> public final val name: Name defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'if (typeBounds.bounds.isEmpty()) {
            typeVariableName.asString()
        }
        else
            "$typeVariableName ${StringUtil.join(typeBounds.bounds, renderBound, ", ")}"' @ [478:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'typeBounds' @ [478:20] ==> value-parameter typeBounds: TypeBounds defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds[ValueParameterDescriptorImpl]

'bounds' @ [478:31] ==> public abstract val bounds: Collection<TypeBounds.Bound> defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds[PropertyDescriptorImpl]

'isEmpty' @ [478:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'typeVariableName' @ [479:13] ==> val typeVariableName: Name defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds[LocalVariableDescriptor]

'asString' @ [479:30] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'typeVariableName' @ [482:15] ==> val typeVariableName: Name defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds[LocalVariableDescriptor]

'join' @ [482:45] ==> @NotNull @Contract public final fun <T : (Any..Any?)> join(@NotNull p0: (MutableCollection<out (TypeBounds.Bound..TypeBounds.Bound?)>..Collection<(TypeBounds.Bound..TypeBounds.Bound?)>), @NotNull p1: ((TypeBounds.Bound..TypeBounds.Bound?)) -> (String..String?), @NotNull @NonNls p2: String): String defined in com.intellij.openapi.util.text.StringUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Bound

'typeBounds' @ [482:50] ==> value-parameter typeBounds: TypeBounds defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds[ValueParameterDescriptorImpl]

'bounds' @ [482:61] ==> public abstract val bounds: Collection<TypeBounds.Bound> defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds[PropertyDescriptorImpl]

'renderBound' @ [482:69] ==> val renderBound: (TypeBounds.Bound) -> String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.renderTypeBounds[LocalVariableDescriptor]

'buildString' @ [485:89] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [486:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'message' @ [486:16] ==> value-parameter message: String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.debugMessage[ValueParameterDescriptorImpl]

'append' @ [487:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [488:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderConstraintSystem' @ [488:16] ==> public final fun renderConstraintSystem(constraintSystem: ConstraintSystem, shortTypeBounds: Boolean): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [488:39] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.debugMessage[ValueParameterDescriptorImpl]

'constraintSystem' @ [488:58] ==> @NotNull public final val constraintSystem: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'append' @ [489:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [490:9] ==> public open fun append(p0: (Any..Any?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'inferenceErrorData' @ [490:16] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.debugMessage[ValueParameterDescriptorImpl]

'descriptor' @ [490:35] ==> @NotNull public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'append' @ [491:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'RenderingContext' @ [492:23] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'Empty' @ [492:40] ==> public object Empty : RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'if (TypeUtils.noExpectedType(inferenceErrorData.expectedType)) {
            append(inferenceErrorData.expectedType)
        }
        else {
            append(RENDER_TYPE.render(inferenceErrorData.expectedType, context))
        }' @ [493:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'noExpectedType' @ [493:23] ==> public open fun noExpectedType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'inferenceErrorData' @ [493:38] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.debugMessage[ValueParameterDescriptorImpl]

'expectedType' @ [493:57] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'append' @ [494:13] ==> public open fun append(p0: (Any..Any?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'inferenceErrorData' @ [494:20] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.debugMessage[ValueParameterDescriptorImpl]

'expectedType' @ [494:39] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'append' @ [497:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'RENDER_TYPE' @ [497:20] ==> @JvmField public final val RENDER_TYPE: SmartTypeRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'render' @ [497:32] ==> public open fun render(obj: KotlinType, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.SmartTypeRenderer[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [497:39] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.debugMessage[ValueParameterDescriptorImpl]

'expectedType' @ [497:58] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'context' @ [497:72] ==> val context: RenderingContext.Empty defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.debugMessage.<anonymous>[LocalVariableDescriptor]

'append' @ [499:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'inferenceErrorData' @ [500:13] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.debugMessage[ValueParameterDescriptorImpl]

'receiverArgumentType' @ [500:32] ==> @Nullable public final val receiverArgumentType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'append' @ [501:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'RENDER_TYPE' @ [501:20] ==> @JvmField public final val RENDER_TYPE: SmartTypeRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'render' @ [501:32] ==> public open fun render(obj: KotlinType, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.SmartTypeRenderer[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [501:39] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.debugMessage[ValueParameterDescriptorImpl]

'receiverArgumentType' @ [501:58] ==> @Nullable public final val receiverArgumentType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'context' @ [501:80] ==> val context: RenderingContext.Empty defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.debugMessage.<anonymous>[LocalVariableDescriptor]

'append' @ [501:90] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [503:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [503:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderTypes' @ [503:28] ==> private final fun renderTypes(types: Collection<KotlinType>, context: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[SimpleFunctionDescriptorImpl]

'inferenceErrorData' @ [503:40] ==> value-parameter inferenceErrorData: InferenceErrorData defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.debugMessage[ValueParameterDescriptorImpl]

'valueArgumentsTypes' @ [503:59] ==> @NotNull public final val valueArgumentsTypes: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaPropertyDescriptor]

'context' @ [503:80] ==> val context: RenderingContext.Empty defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.debugMessage.<anonymous>[LocalVariableDescriptor]

'append' @ [503:90] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'this' @ [506:54] ==> <this> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.wrapIntoQuotes[ReceiverParameterDescriptorImpl]

'this' @ [507:53] ==> <this> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.wrapIntoQuotes[ReceiverParameterDescriptorImpl]

'asString' @ [507:58] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'JvmField' @ [511:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [511:47] ==> public fun <O> Renderer(block: (List<WhenMissingCase>) -> String): DiagnosticParameterRenderer<List<WhenMissingCase>> defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> List<WhenMissingCase>

'if (!it.hasUnknown) {
            val list = it.joinToString(", ", limit = WHEN_MISSING_LIMIT) { "'$it'" }
            val branches = if (it.size > 1) "branches" else "branch"
            "$list $branches or 'else' branch instead"
        }
        else {
            "'else' branch"
        }' @ [512:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!' @ [512:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [512:14] ==> value-parameter it: List<WhenMissingCase> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_WHEN_MISSING_CASES.<anonymous>[ValueParameterDescriptorImpl]

'hasUnknown' @ [512:17] ==> public val List<WhenMissingCase>.hasUnknown: Boolean defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[PropertyDescriptorImpl]

'it' @ [513:24] ==> value-parameter it: List<WhenMissingCase> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_WHEN_MISSING_CASES.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [513:27] ==> public fun <T> Iterable<WhenMissingCase>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((WhenMissingCase) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenMissingCase

'WHEN_MISSING_LIMIT' @ [513:54] ==> private final val WHEN_MISSING_LIMIT: Int defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[PropertyDescriptorImpl]

'it' @ [513:79] ==> value-parameter it: WhenMissingCase defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_WHEN_MISSING_CASES.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (it.size > 1) "branches" else "branch"' @ [514:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [514:32] ==> value-parameter it: List<WhenMissingCase> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_WHEN_MISSING_CASES.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [514:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'list' @ [515:15] ==> val list: String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_WHEN_MISSING_CASES.<anonymous>[LocalVariableDescriptor]

'branches' @ [515:21] ==> val branches: String defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers.RENDER_WHEN_MISSING_CASES.<anonymous>[LocalVariableDescriptor]

'JvmField' @ [522:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorRenderer' @ [522:39] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [522:58] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'asRenderer' @ [522:76] ==> public fun DescriptorRenderer.asRenderer(): SmartDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]

'JvmField' @ [523:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorRenderer' @ [523:29] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'COMPACT' @ [523:48] ==> @field:JvmField public final val COMPACT: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'asRenderer' @ [523:56] ==> public fun DescriptorRenderer.asRenderer(): SmartDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]

'JvmField' @ [524:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorRenderer' @ [524:48] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'COMPACT_WITHOUT_SUPERTYPES' @ [524:67] ==> @field:JvmField public final val COMPACT_WITHOUT_SUPERTYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'asRenderer' @ [524:94] ==> public fun DescriptorRenderer.asRenderer(): SmartDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]

'JvmField' @ [525:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorRenderer' @ [525:39] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [525:58] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [526:9] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'emptySet' @ [526:21] ==> public fun <T> emptySet(): Set<DescriptorRendererModifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorRendererModifier

'asRenderer' @ [527:7] ==> public fun DescriptorRenderer.asRenderer(): SmartDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]

'JvmField' @ [528:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorRenderer' @ [528:42] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'SHORT_NAMES_IN_TYPES' @ [528:61] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'asRenderer' @ [528:82] ==> public fun DescriptorRenderer.asRenderer(): SmartDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]

'JvmField' @ [529:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorRenderer' @ [529:44] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'COMPACT_WITH_MODIFIERS' @ [529:63] ==> @field:JvmField public final val COMPACT_WITH_MODIFIERS: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'asRenderer' @ [529:86] ==> public fun DescriptorRenderer.asRenderer(): SmartDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]

'JvmField' @ [530:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorRenderer' @ [530:42] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'ONLY_NAMES_WITH_SHORT_TYPES' @ [530:61] ==> @field:JvmField public final val ONLY_NAMES_WITH_SHORT_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'withOptions' @ [530:89] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'withoutTypeParameters' @ [531:9] ==> public abstract var withoutTypeParameters: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'receiverAfterName' @ [532:9] ==> public abstract var receiverAfterName: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'renderAccessors' @ [533:9] ==> public abstract var renderAccessors: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'asRenderer' @ [534:7] ==> public fun DescriptorRenderer.asRenderer(): SmartDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering[SimpleFunctionDescriptorImpl]

'SmartDescriptorRenderer' @ [537:39] ==> public constructor SmartDescriptorRenderer(baseRenderer: DescriptorRenderer) defined in org.jetbrains.kotlin.diagnostics.rendering.SmartDescriptorRenderer[ClassConstructorDescriptorImpl]

'this' @ [537:63] ==> <this> defined in org.jetbrains.kotlin.diagnostics.rendering.asRenderer[ReceiverParameterDescriptorImpl]

