'setOf' @ [34:35] ==> public fun <T> setOf(vararg elements: ClassKind): Set<ClassKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind

'OBJECT' @ [34:51] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'ENUM_ENTRY' @ [34:69] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'mutableSetOf' @ [35:40] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<MemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberDescriptor

'mutableMapOf' @ [36:37] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<FqName, JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> JsName

'context' @ [38:17] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'fragment' @ [38:25] ==> public final val StaticContext.fragment: JsProgramFragment[MyPropertyDescriptor]

'exportBlock' @ [38:34] ==> public final val JsProgramFragment.exportBlock: JsGlobalBlock[MyPropertyDescriptor]

'statements' @ [38:46] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'exportedDeclarations' @ [41:13] ==> private final val exportedDeclarations: MutableSet<MemberDescriptor> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'contains' @ [41:34] ==> public abstract fun contains(element: MemberDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [41:43] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'descriptor' @ [42:13] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'descriptor' @ [42:52] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'isPrimary' @ [42:63] ==> public final val ConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'isNativeObject' @ [43:13] ==> public open fun isNativeObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'descriptor' @ [43:28] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'isLibraryObject' @ [43:43] ==> public open fun isLibraryObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'descriptor' @ [43:59] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'descriptor' @ [44:13] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'isEffectivelyInlineOnly' @ [44:24] ==> public fun MemberDescriptor.isEffectivelyInlineOnly(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations[DeserializedSimpleFunctionDescriptor]

'context' @ [46:29] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'nameSuggestion' @ [46:37] ==> public final val StaticContext.nameSuggestion: NameSuggestion[MyPropertyDescriptor]

'suggest' @ [46:52] ==> public final fun suggest(descriptor: DeclarationDescriptor): SuggestedName? defined in org.jetbrains.kotlin.js.naming.NameSuggestion[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [46:60] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'suggestedName' @ [48:25] ==> val suggestedName: SuggestedName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[LocalVariableDescriptor]

'scope' @ [48:39] ==> public final val scope: DeclarationDescriptor defined in org.jetbrains.kotlin.js.naming.SuggestedName[DeserializedPropertyDescriptor]

'!' @ [49:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [49:14] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'shouldBeExported' @ [49:25] ==> private final fun MemberDescriptor.shouldBeExported(force: Boolean): Boolean defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[SimpleFunctionDescriptorImpl]

'force' @ [49:42] ==> value-parameter force: Boolean defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'exportedDeclarations' @ [50:9] ==> private final val exportedDeclarations: MutableSet<MemberDescriptor> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'add' @ [50:30] ==> public abstract fun add(element: MemberDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [50:34] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'when {
            container is PackageFragmentDescriptor -> {
                getLocalPackageReference(container.fqName)
            }
            DescriptorUtils.isObject(container) -> {
                JsAstUtils.prototypeOf(context.getInnerNameForDescriptor(container).makeRef())
            }
            else -> {
                context.getInnerNameForDescriptor(container).makeRef()
            }
        }' @ [52:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression, entry1: JsExpression, entry2: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression

'container' @ [53:13] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[LocalVariableDescriptor]

'getLocalPackageReference' @ [54:17] ==> private final fun getLocalPackageReference(packageName: FqName): JsExpression defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[SimpleFunctionDescriptorImpl]

'container' @ [54:42] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[LocalVariableDescriptor]

'fqName' @ [54:52] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'isObject' @ [56:29] ==> public open fun isObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'container' @ [56:38] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[LocalVariableDescriptor]

'prototypeOf' @ [57:28] ==> @NotNull public open fun prototypeOf(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [57:40] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [57:48] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'container' @ [57:74] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[LocalVariableDescriptor]

'makeRef' @ [57:85] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'context' @ [60:17] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [60:25] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'container' @ [60:51] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[LocalVariableDescriptor]

'makeRef' @ [60:62] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'when {
            descriptor is ClassDescriptor && descriptor.kind in objectLikeKinds -> {
                exportObject(descriptor, qualifier)
            }
            descriptor is PropertyDescriptor && container is PackageFragmentDescriptor -> {
                exportProperty(descriptor, qualifier)
            }
            else -> {
                assign(descriptor, qualifier)
            }
        }' @ [64:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [65:13] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'descriptor' @ [65:46] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'kind' @ [65:57] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'objectLikeKinds' @ [65:65] ==> private final val objectLikeKinds: Set<ClassKind> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'exportObject' @ [66:17] ==> private final fun exportObject(declaration: ClassDescriptor, qualifier: JsExpression): Unit defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[SimpleFunctionDescriptorImpl]

'descriptor' @ [66:30] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'qualifier' @ [66:42] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[LocalVariableDescriptor]

'descriptor' @ [68:13] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'container' @ [68:49] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[LocalVariableDescriptor]

'exportProperty' @ [69:17] ==> private final fun exportProperty(declaration: PropertyDescriptor, qualifier: JsExpression): Unit defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[SimpleFunctionDescriptorImpl]

'descriptor' @ [69:32] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'qualifier' @ [69:44] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[LocalVariableDescriptor]

'assign' @ [72:17] ==> private final fun assign(descriptor: DeclarationDescriptor, qualifier: JsExpression): Unit defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[SimpleFunctionDescriptorImpl]

'descriptor' @ [72:24] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[ValueParameterDescriptorImpl]

'qualifier' @ [72:36] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.export[LocalVariableDescriptor]

'context' @ [78:28] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [78:36] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'descriptor' @ [78:62] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.assign[ValueParameterDescriptorImpl]

'exportedName' @ [79:26] ==> val exportedName: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.assign[LocalVariableDescriptor]

'makeRef' @ [79:39] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'context' @ [80:28] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'getNameForDescriptor' @ [80:36] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'descriptor' @ [80:57] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.assign[ValueParameterDescriptorImpl]

'propertyName' @ [81:13] ==> val propertyName: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.assign[LocalVariableDescriptor]

'staticRef' @ [81:26] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'exportedName' @ [81:47] ==> val exportedName: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.assign[LocalVariableDescriptor]

'propertyName' @ [81:63] ==> val propertyName: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.assign[LocalVariableDescriptor]

'propertyName' @ [82:13] ==> val propertyName: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.assign[LocalVariableDescriptor]

'staticRef' @ [82:26] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'expression' @ [82:38] ==> val expression: JsNameRef defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.assign[LocalVariableDescriptor]

'statements' @ [84:9] ==> private final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'assignment' @ [84:23] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsNameRef' @ [84:34] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'propertyName' @ [84:44] ==> val propertyName: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.assign[LocalVariableDescriptor]

'qualifier' @ [84:58] ==> value-parameter qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.assign[ValueParameterDescriptorImpl]

'expression' @ [84:70] ==> val expression: JsNameRef defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.assign[LocalVariableDescriptor]

'exportStatement' @ [84:82] ==> private final fun JsExpression.exportStatement(declaration: DeclarationDescriptor): JsExpressionStatement defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[SimpleFunctionDescriptorImpl]

'descriptor' @ [84:98] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.assign[ValueParameterDescriptorImpl]

'context' @ [88:20] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'getNameForDescriptor' @ [88:28] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'declaration' @ [88:49] ==> value-parameter declaration: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportObject[ValueParameterDescriptorImpl]

'defineGetter' @ [89:37] ==> @NotNull public open fun defineGetter(@NotNull receiver: JsExpression, @NotNull name: String, @NotNull body: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'qualifier' @ [89:50] ==> value-parameter qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportObject[ValueParameterDescriptorImpl]

'name' @ [89:61] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportObject[LocalVariableDescriptor]

'ident' @ [89:66] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'context' @ [90:50] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'getNameForObjectInstance' @ [90:58] ==> @NotNull public open fun getNameForObjectInstance(@NotNull descriptor: ClassDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'declaration' @ [90:83] ==> value-parameter declaration: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportObject[ValueParameterDescriptorImpl]

'makeRef' @ [90:96] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'statements' @ [91:9] ==> private final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'expression' @ [91:23] ==> val expression: JsExpression defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportObject[LocalVariableDescriptor]

'exportStatement' @ [91:34] ==> private final fun JsExpression.exportStatement(declaration: DeclarationDescriptor): JsExpressionStatement defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[SimpleFunctionDescriptorImpl]

'declaration' @ [91:50] ==> value-parameter declaration: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportObject[ValueParameterDescriptorImpl]

'JsObjectLiteral' @ [95:31] ==> public constructor JsObjectLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsObjectLiteral[JavaClassConstructorDescriptor]

'context' @ [97:20] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'getNameForDescriptor' @ [97:28] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'declaration' @ [97:49] ==> value-parameter declaration: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'ident' @ [97:62] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'isSimpleFinalProperty' @ [98:48] ==> public open fun isSimpleFinalProperty(@NotNull propertyDescriptor: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.JsDescriptorUtils[JavaMethodDescriptor]

'declaration' @ [98:70] ==> value-parameter declaration: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'!' @ [99:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldAccessViaFunctions' @ [99:48] ==> public open fun shouldAccessViaFunctions(@NotNull descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'declaration' @ [99:73] ==> value-parameter declaration: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'if (simpleProperty) {
            exportedName = context.getInnerNameForDescriptor(declaration)
            val accessToField = JsReturn(exportedName.makeRef())
            JsFunction(context.fragment.scope, JsBlock(accessToField), "$declaration getter")
        }
        else {
            exportedName = context.getInnerNameForDescriptor(declaration.getter!!)
            exportedName.makeRef()
        }' @ [102:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'simpleProperty' @ [102:44] ==> val simpleProperty: Boolean defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'exportedName' @ [103:13] ==> val exportedName: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'context' @ [103:28] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [103:36] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'declaration' @ [103:62] ==> value-parameter declaration: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'JsReturn' @ [104:33] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'exportedName' @ [104:42] ==> val exportedName: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'makeRef' @ [104:55] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsFunction' @ [105:13] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: JsBlock, @NotNull p2: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'context' @ [105:24] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'fragment' @ [105:32] ==> public final val StaticContext.fragment: JsProgramFragment[MyPropertyDescriptor]

'scope' @ [105:41] ==> public final val JsProgramFragment.scope: JsScope[MyPropertyDescriptor]

'JsBlock' @ [105:48] ==> public constructor JsBlock(p0: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'accessToField' @ [105:56] ==> val accessToField: JsReturn defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'declaration' @ [105:74] ==> value-parameter declaration: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'exportedName' @ [108:13] ==> val exportedName: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'context' @ [108:28] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [108:36] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'declaration' @ [108:62] ==> value-parameter declaration: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'getter' @ [108:74] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'exportedName' @ [109:13] ==> val exportedName: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'makeRef' @ [109:26] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'propertyLiteral' @ [111:9] ==> val propertyLiteral: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'propertyInitializers' @ [111:25] ==> public final val JsObjectLiteral.propertyInitializers: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?)[MyPropertyDescriptor]

'JsPropertyInitializer' @ [111:49] ==> public constructor JsPropertyInitializer(@NotNull p0: JsExpression, @NotNull p1: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsPropertyInitializer[JavaClassConstructorDescriptor]

'JsNameRef' @ [111:71] ==> public constructor JsNameRef(@NotNull p0: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'getterBody' @ [111:89] ==> val getterBody: JsExpression defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'declaration' @ [113:13] ==> value-parameter declaration: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'isVar' @ [113:25] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'if (simpleProperty) {
                val statements = mutableListOf<JsStatement>()
                val function = JsFunction(context.fragment.scope, JsBlock(statements), "$declaration setter")
                function.source = declaration.source.getPsi()
                val valueName = JsScope.declareTemporaryName("value")
                function.parameters += JsParameter(valueName)
                statements += assignment(context.getInnerNameForDescriptor(declaration).makeRef(), valueName.makeRef()).makeStmt()
                function
            }
            else {
                context.getInnerNameForDescriptor(declaration.setter!!).makeRef()
            }' @ [114:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'simpleProperty' @ [114:48] ==> val simpleProperty: Boolean defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'mutableListOf' @ [115:34] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'JsFunction' @ [116:32] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: JsBlock, @NotNull p2: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'context' @ [116:43] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'fragment' @ [116:51] ==> public final val StaticContext.fragment: JsProgramFragment[MyPropertyDescriptor]

'scope' @ [116:60] ==> public final val JsProgramFragment.scope: JsScope[MyPropertyDescriptor]

'JsBlock' @ [116:67] ==> public constructor JsBlock(@NotNull p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'statements' @ [116:75] ==> val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'declaration' @ [116:90] ==> value-parameter declaration: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'function' @ [117:17] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'source' @ [117:26] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'declaration' @ [117:35] ==> value-parameter declaration: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'source' @ [117:47] ==> public final val PropertyDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [117:54] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'declareTemporaryName' @ [118:41] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'function' @ [119:17] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'parameters' @ [119:26] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'JsParameter' @ [119:40] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'valueName' @ [119:52] ==> val valueName: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'statements' @ [120:17] ==> val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'assignment' @ [120:31] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [120:42] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [120:50] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'declaration' @ [120:76] ==> value-parameter declaration: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'makeRef' @ [120:89] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'valueName' @ [120:100] ==> val valueName: JsName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'makeRef' @ [120:110] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'makeStmt' @ [120:121] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'function' @ [121:17] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'context' @ [124:17] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [124:25] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'declaration' @ [124:51] ==> value-parameter declaration: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'setter' @ [124:63] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'makeRef' @ [124:73] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'propertyLiteral' @ [126:13] ==> val propertyLiteral: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'propertyInitializers' @ [126:29] ==> public final val JsObjectLiteral.propertyInitializers: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?)[MyPropertyDescriptor]

'JsPropertyInitializer' @ [126:53] ==> public constructor JsPropertyInitializer(@NotNull p0: JsExpression, @NotNull p1: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsPropertyInitializer[JavaClassConstructorDescriptor]

'JsNameRef' @ [126:75] ==> public constructor JsNameRef(@NotNull p0: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'setterBody' @ [126:93] ==> val setterBody: JsExpression defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'statements' @ [129:9] ==> private final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'defineProperty' @ [129:34] ==> @NotNull public open fun defineProperty(@NotNull receiver: JsExpression, @NotNull name: String, @NotNull value: JsExpression): JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'qualifier' @ [129:49] ==> value-parameter qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'name' @ [129:60] ==> val name: String defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'propertyLiteral' @ [129:66] ==> val propertyLiteral: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[LocalVariableDescriptor]

'exportStatement' @ [129:83] ==> private final fun JsExpression.exportStatement(declaration: DeclarationDescriptor): JsExpressionStatement defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[SimpleFunctionDescriptorImpl]

'declaration' @ [129:99] ==> value-parameter declaration: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportProperty[ValueParameterDescriptorImpl]

'packageName' @ [133:13] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.getLocalPackageReference[ValueParameterDescriptorImpl]

'isRoot' @ [133:25] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'context' @ [134:20] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'fragment' @ [134:28] ==> public final val StaticContext.fragment: JsProgramFragment[MyPropertyDescriptor]

'scope' @ [134:37] ==> public final val JsProgramFragment.scope: JsScope[MyPropertyDescriptor]

'declareName' @ [134:43] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'getRootPackageName' @ [134:61] ==> @NotNull public open fun getRootPackageName(): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'makeRef' @ [134:83] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'localPackageNames' @ [136:20] ==> private final val localPackageNames: MutableMap<FqName, JsName> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'packageName' @ [136:38] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.getLocalPackageReference[ValueParameterDescriptorImpl]

'name' @ [137:13] ==> var name: JsName? defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.getLocalPackageReference[LocalVariableDescriptor]

'name' @ [138:13] ==> var name: JsName? defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.getLocalPackageReference[LocalVariableDescriptor]

'declareTemporaryName' @ [138:28] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'+' @ [138:49] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'packageName' @ [138:62] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.getLocalPackageReference[ValueParameterDescriptorImpl]

'shortName' @ [138:74] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [138:86] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'localPackageNames' @ [139:13] ==> private final val localPackageNames: MutableMap<FqName, JsName> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'packageName' @ [139:31] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.getLocalPackageReference[ValueParameterDescriptorImpl]

'name' @ [139:46] ==> var name: JsName? defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.getLocalPackageReference[LocalVariableDescriptor]

'statements' @ [140:13] ==> private final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'definePackageAlias' @ [140:27] ==> public fun definePackageAlias(name: String, varName: JsName, tag: String, parentRef: JsExpression): JsStatement defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'packageName' @ [140:46] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.getLocalPackageReference[ValueParameterDescriptorImpl]

'shortName' @ [140:58] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [140:70] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [140:82] ==> var name: JsName? defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.getLocalPackageReference[LocalVariableDescriptor]

'packageName' @ [140:88] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.getLocalPackageReference[ValueParameterDescriptorImpl]

'asString' @ [140:100] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'getLocalPackageReference' @ [141:46] ==> private final fun getLocalPackageReference(packageName: FqName): JsExpression defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[SimpleFunctionDescriptorImpl]

'packageName' @ [141:71] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.getLocalPackageReference[ValueParameterDescriptorImpl]

'parent' @ [141:83] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'name' @ [143:16] ==> var name: JsName? defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.getLocalPackageReference[LocalVariableDescriptor]

'makeRef' @ [143:21] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsExpressionStatement' @ [146:84] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'this' @ [146:106] ==> <this> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportStatement[ReceiverParameterDescriptorImpl]

'also' @ [146:112] ==> @InlineOnly @SinceKotlin public inline fun <T> JsExpressionStatement.also(block: (JsExpressionStatement) -> Unit): JsExpressionStatement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpressionStatement

'it' @ [147:9] ==> value-parameter it: JsExpressionStatement defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportStatement.<anonymous>[ValueParameterDescriptorImpl]

'exportedTag' @ [147:12] ==> public var JsExpressionStatement.exportedTag: String? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'context' @ [147:26] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'getTag' @ [147:34] ==> @Nullable public open fun getTag(@NotNull descriptor: DeclarationDescriptor): String? defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'declaration' @ [147:41] ==> value-parameter declaration: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.exportStatement[ValueParameterDescriptorImpl]

'publicApi' @ [151:13] ==> public final val publicApi: Boolean defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[DeserializedPropertyDescriptor]

'context' @ [152:13] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[PropertyDescriptorImpl]

'config' @ [152:21] ==> public final val StaticContext.config: JsConfig[MyPropertyDescriptor]

'configuration' @ [152:28] ==> public final val JsConfig.configuration: CompilerConfiguration[MyPropertyDescriptor]

'getBoolean' @ [152:42] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'FRIEND_PATHS_DISABLED' @ [152:73] ==> public final val FRIEND_PATHS_DISABLED: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'toVisibility' @ [153:16] ==> public abstract fun toVisibility(): Visibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[DeserializedSimpleFunctionDescriptor]

'INTERNAL' @ [153:47] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'force' @ [157:13] ==> value-parameter force: Boolean defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.shouldBeExported[ValueParameterDescriptorImpl]

'effectiveVisibility' @ [157:22] ==> public fun DeclarationDescriptorWithVisibility.effectiveVisibility(visibility: Visibility = ..., checkPublishedApi: Boolean = ...): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'publicOrInternal' @ [157:68] ==> private final fun EffectiveVisibility.publicOrInternal(): Boolean defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter[SimpleFunctionDescriptorImpl]

'!=' @ [157:90] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedSimpleFunctionDescriptor]

'getJsNameAnnotation' @ [157:107] ==> @Nullable public open fun getJsNameAnnotation(@NotNull p0: DeclarationDescriptor): AnnotationDescriptor? defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'this' @ [157:127] ==> <this> defined in org.jetbrains.kotlin.js.translate.context.DeclarationExporter.shouldBeExported[ReceiverParameterDescriptorImpl]

