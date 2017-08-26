'accept' @ [32:26] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<String, Nothing?>, data: Nothing?): String defined in org.jetbrains.kotlin.ir.IrElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> String
    <D> -> Nothing?

'RenderIrElementVisitor' @ [32:33] ==> public constructor RenderIrElementVisitor() defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor[ClassConstructorDescriptorImpl]

'element' @ [36:18] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitElement[ValueParameterDescriptorImpl]

'java' @ [36:33] ==> public val <T> KClass<out IrElement>.java: Class<out IrElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out IrElement)

'simpleName' @ [36:38] ==> public final val <T : (Any..Any?)> Class<out IrElement>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out IrElement)

'declaration' @ [39:18] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitDeclaration[ValueParameterDescriptorImpl]

'java' @ [39:37] ==> public val <T> KClass<out IrDeclaration>.java: Class<out IrDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out IrDeclaration)

'simpleName' @ [39:42] ==> public final val <T : (Any..Any?)> Class<out IrDeclaration>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out IrDeclaration)

'declaration' @ [39:56] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [39:68] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[PropertyDescriptorImpl]

'ref' @ [39:79] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [42:32] ==> value-parameter declaration: IrModuleFragment defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitModuleFragment[ValueParameterDescriptorImpl]

'descriptor' @ [42:44] ==> public abstract val descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[PropertyDescriptorImpl]

'ref' @ [42:55] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [45:42] ==> value-parameter declaration: IrExternalPackageFragment defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitExternalPackageFragment[ValueParameterDescriptorImpl]

'packageFragmentDescriptor' @ [45:54] ==> public abstract val packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrExternalPackageFragment[PropertyDescriptorImpl]

'fqName' @ [45:80] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'declaration' @ [48:21] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitFile[ValueParameterDescriptorImpl]

'name' @ [48:33] ==> public val IrFile.name: String defined in org.jetbrains.kotlin.ir.declarations in file IrFile.kt[PropertyDescriptorImpl]

'declaration' @ [51:20] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitFunction[ValueParameterDescriptorImpl]

'renderOrigin' @ [51:32] ==> internal final fun IrDeclaration.renderOrigin(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [51:49] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitFunction[ValueParameterDescriptorImpl]

'renderDeclared' @ [51:61] ==> internal final fun IrDeclaration.renderDeclared(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [54:28] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitConstructor[ValueParameterDescriptorImpl]

'renderOrigin' @ [54:40] ==> internal final fun IrDeclaration.renderOrigin(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [54:57] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitConstructor[ValueParameterDescriptorImpl]

'renderDeclared' @ [54:69] ==> internal final fun IrDeclaration.renderDeclared(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [57:25] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitProperty[ValueParameterDescriptorImpl]

'renderOrigin' @ [57:37] ==> internal final fun IrDeclaration.renderOrigin(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [57:54] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitProperty[ValueParameterDescriptorImpl]

'renderDeclared' @ [57:66] ==> internal final fun IrDeclaration.renderDeclared(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [60:22] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitField[ValueParameterDescriptorImpl]

'renderOrigin' @ [60:34] ==> internal final fun IrDeclaration.renderOrigin(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [60:51] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitField[ValueParameterDescriptorImpl]

'renderDeclared' @ [60:63] ==> internal final fun IrDeclaration.renderDeclared(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [63:22] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitClass[ValueParameterDescriptorImpl]

'renderOrigin' @ [63:34] ==> internal final fun IrDeclaration.renderOrigin(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [63:51] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitClass[ValueParameterDescriptorImpl]

'descriptor' @ [63:63] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'kind' @ [63:74] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'declaration' @ [63:82] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitClass[ValueParameterDescriptorImpl]

'descriptor' @ [63:94] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'ref' @ [63:105] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [66:26] ==> value-parameter declaration: IrTypeAlias defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitTypeAlias[ValueParameterDescriptorImpl]

'renderOrigin' @ [66:38] ==> internal final fun IrDeclaration.renderOrigin(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [66:55] ==> value-parameter declaration: IrTypeAlias defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitTypeAlias[ValueParameterDescriptorImpl]

'descriptor' @ [66:67] ==> public abstract val descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrTypeAlias[PropertyDescriptorImpl]

'ref' @ [66:78] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [66:92] ==> value-parameter declaration: IrTypeAlias defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitTypeAlias[ValueParameterDescriptorImpl]

'descriptor' @ [66:104] ==> public abstract val descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrTypeAlias[PropertyDescriptorImpl]

'underlyingType' @ [66:115] ==> public abstract val underlyingType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'render' @ [66:130] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [69:20] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitVariable[ValueParameterDescriptorImpl]

'renderOrigin' @ [69:32] ==> internal final fun IrDeclaration.renderOrigin(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [69:49] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitVariable[ValueParameterDescriptorImpl]

'renderDeclared' @ [69:61] ==> internal final fun IrDeclaration.renderDeclared(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [72:27] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitEnumEntry[ValueParameterDescriptorImpl]

'renderOrigin' @ [72:39] ==> internal final fun IrDeclaration.renderOrigin(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [72:56] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitEnumEntry[ValueParameterDescriptorImpl]

'renderDeclared' @ [72:68] ==> internal final fun IrDeclaration.renderDeclared(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [75:38] ==> value-parameter declaration: IrAnonymousInitializer defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'descriptor' @ [75:50] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer[PropertyDescriptorImpl]

'ref' @ [75:61] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [78:31] ==> value-parameter declaration: IrTypeParameter defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitTypeParameter[ValueParameterDescriptorImpl]

'renderDeclared' @ [78:43] ==> internal final fun IrDeclaration.renderDeclared(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [81:32] ==> value-parameter declaration: IrValueParameter defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitValueParameter[ValueParameterDescriptorImpl]

'renderDeclared' @ [81:44] ==> internal final fun IrDeclaration.renderDeclared(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [84:41] ==> value-parameter declaration: IrLocalDelegatedProperty defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitLocalDelegatedProperty[ValueParameterDescriptorImpl]

'renderOrigin' @ [84:53] ==> internal final fun IrDeclaration.renderOrigin(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [84:70] ==> value-parameter declaration: IrLocalDelegatedProperty defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitLocalDelegatedProperty[ValueParameterDescriptorImpl]

'renderDeclared' @ [84:82] ==> internal final fun IrDeclaration.renderDeclared(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'body' @ [93:36] ==> value-parameter body: IrSyntheticBody defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitSyntheticBody[ValueParameterDescriptorImpl]

'kind' @ [93:41] ==> public abstract val kind: IrSyntheticBodyKind defined in org.jetbrains.kotlin.ir.expressions.IrSyntheticBody[PropertyDescriptorImpl]

'expression' @ [96:18] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitExpression[ValueParameterDescriptorImpl]

'java' @ [96:36] ==> public val <T> KClass<out IrExpression>.java: Class<out IrExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out IrExpression)

'simpleName' @ [96:41] ==> public final val <T : (Any..Any?)> Class<out IrExpression>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out IrExpression)

'expression' @ [96:60] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitExpression[ValueParameterDescriptorImpl]

'type' @ [96:71] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'render' @ [96:76] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [99:22] ==> value-parameter expression: IrConst<T> defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitConst[ValueParameterDescriptorImpl]

'kind' @ [99:33] ==> public abstract val kind: IrConstKind<T> defined in org.jetbrains.kotlin.ir.expressions.IrConst[PropertyDescriptorImpl]

'expression' @ [99:46] ==> value-parameter expression: IrConst<T> defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitConst[ValueParameterDescriptorImpl]

'type' @ [99:57] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrConst[PropertyDescriptorImpl]

'render' @ [99:62] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [99:81] ==> value-parameter expression: IrConst<T> defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitConst[ValueParameterDescriptorImpl]

'value' @ [99:92] ==> public abstract val value: T defined in org.jetbrains.kotlin.ir.expressions.IrConst[PropertyDescriptorImpl]

'expression' @ [102:28] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitVararg[ValueParameterDescriptorImpl]

'type' @ [102:39] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrVararg[PropertyDescriptorImpl]

'expression' @ [102:65] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitVararg[ValueParameterDescriptorImpl]

'varargElementType' @ [102:76] ==> public abstract val varargElementType: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrVararg[PropertyDescriptorImpl]

'expression' @ [108:27] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitBlock[ValueParameterDescriptorImpl]

'type' @ [108:38] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrBlock[PropertyDescriptorImpl]

'render' @ [108:43] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [108:62] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitBlock[ValueParameterDescriptorImpl]

'origin' @ [108:73] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrBlock[PropertyDescriptorImpl]

'expression' @ [111:31] ==> value-parameter expression: IrComposite defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitComposite[ValueParameterDescriptorImpl]

'type' @ [111:42] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrComposite[PropertyDescriptorImpl]

'render' @ [111:47] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [111:66] ==> value-parameter expression: IrComposite defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitComposite[ValueParameterDescriptorImpl]

'origin' @ [111:77] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrComposite[PropertyDescriptorImpl]

'expression' @ [114:28] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitReturn[ValueParameterDescriptorImpl]

'type' @ [114:39] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrReturn[PropertyDescriptorImpl]

'render' @ [114:44] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [114:62] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitReturn[ValueParameterDescriptorImpl]

'returnTarget' @ [114:73] ==> public abstract val returnTarget: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrReturn[PropertyDescriptorImpl]

'ref' @ [114:86] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'+' @ [117:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expression' @ [117:22] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [117:33] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'ref' @ [117:44] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [117:54] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitCall[ValueParameterDescriptorImpl]

'renderSuperQualifier' @ [117:65] ==> private final fun IrCall.renderSuperQualifier(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [118:21] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitCall[ValueParameterDescriptorImpl]

'type' @ [118:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'render' @ [118:37] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [118:56] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitCall[ValueParameterDescriptorImpl]

'origin' @ [118:67] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'superQualifier' @ [121:13] ==> public abstract val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'let' @ [121:29] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> String

'it' @ [121:53] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.renderSuperQualifier.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [121:56] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'expression' @ [124:45] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'descriptor' @ [124:56] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[PropertyDescriptorImpl]

'ref' @ [124:67] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [127:39] ==> value-parameter expression: IrEnumConstructorCall defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitEnumConstructorCall[ValueParameterDescriptorImpl]

'descriptor' @ [127:50] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrEnumConstructorCall[PropertyDescriptorImpl]

'ref' @ [127:61] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [130:59] ==> value-parameter expression: IrInstanceInitializerCall defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitInstanceInitializerCall[ValueParameterDescriptorImpl]

'classDescriptor' @ [130:70] ==> public abstract val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrInstanceInitializerCall[PropertyDescriptorImpl]

'ref' @ [130:86] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [133:25] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitGetValue[ValueParameterDescriptorImpl]

'descriptor' @ [133:36] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[PropertyDescriptorImpl]

'ref' @ [133:47] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [133:62] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitGetValue[ValueParameterDescriptorImpl]

'type' @ [133:73] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[PropertyDescriptorImpl]

'render' @ [133:78] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [133:97] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitGetValue[ValueParameterDescriptorImpl]

'origin' @ [133:108] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[PropertyDescriptorImpl]

'expression' @ [136:25] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitSetVariable[ValueParameterDescriptorImpl]

'descriptor' @ [136:36] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[PropertyDescriptorImpl]

'ref' @ [136:47] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [136:62] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitSetVariable[ValueParameterDescriptorImpl]

'type' @ [136:73] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[PropertyDescriptorImpl]

'render' @ [136:78] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [136:97] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitSetVariable[ValueParameterDescriptorImpl]

'origin' @ [136:108] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[PropertyDescriptorImpl]

'expression' @ [139:27] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitGetField[ValueParameterDescriptorImpl]

'descriptor' @ [139:38] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetField[PropertyDescriptorImpl]

'ref' @ [139:49] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [139:64] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitGetField[ValueParameterDescriptorImpl]

'type' @ [139:75] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrGetField[PropertyDescriptorImpl]

'render' @ [139:80] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [139:99] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitGetField[ValueParameterDescriptorImpl]

'origin' @ [139:110] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrGetField[PropertyDescriptorImpl]

'expression' @ [142:27] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitSetField[ValueParameterDescriptorImpl]

'descriptor' @ [142:38] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrSetField[PropertyDescriptorImpl]

'ref' @ [142:49] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [142:64] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitSetField[ValueParameterDescriptorImpl]

'type' @ [142:75] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrSetField[PropertyDescriptorImpl]

'render' @ [142:80] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [142:99] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitSetField[ValueParameterDescriptorImpl]

'origin' @ [142:110] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrSetField[PropertyDescriptorImpl]

'expression' @ [145:28] ==> value-parameter expression: IrGetObjectValue defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitGetObjectValue[ValueParameterDescriptorImpl]

'descriptor' @ [145:39] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetObjectValue[PropertyDescriptorImpl]

'ref' @ [145:50] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [145:65] ==> value-parameter expression: IrGetObjectValue defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitGetObjectValue[ValueParameterDescriptorImpl]

'type' @ [145:76] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrGetObjectValue[PropertyDescriptorImpl]

'render' @ [145:81] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [148:26] ==> value-parameter expression: IrGetEnumValue defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitGetEnumValue[ValueParameterDescriptorImpl]

'descriptor' @ [148:37] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetEnumValue[PropertyDescriptorImpl]

'ref' @ [148:48] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [148:63] ==> value-parameter expression: IrGetEnumValue defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitGetEnumValue[ValueParameterDescriptorImpl]

'type' @ [148:74] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrGetEnumValue[PropertyDescriptorImpl]

'render' @ [148:79] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [151:42] ==> value-parameter expression: IrStringConcatenation defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitStringConcatenation[ValueParameterDescriptorImpl]

'type' @ [151:53] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrStringConcatenation[PropertyDescriptorImpl]

'render' @ [151:58] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [154:29] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitTypeOperator[ValueParameterDescriptorImpl]

'type' @ [154:40] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[PropertyDescriptorImpl]

'render' @ [154:45] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [154:64] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitTypeOperator[ValueParameterDescriptorImpl]

'operator' @ [154:75] ==> public abstract val operator: IrTypeOperator defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[PropertyDescriptorImpl]

'expression' @ [154:99] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitTypeOperator[ValueParameterDescriptorImpl]

'typeOperand' @ [154:110] ==> public abstract val typeOperand: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[PropertyDescriptorImpl]

'render' @ [154:122] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [157:26] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitWhen[ValueParameterDescriptorImpl]

'type' @ [157:37] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrWhen[PropertyDescriptorImpl]

'render' @ [157:42] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [157:61] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitWhen[ValueParameterDescriptorImpl]

'origin' @ [157:72] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrWhen[PropertyDescriptorImpl]

'loop' @ [163:28] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'label' @ [163:33] ==> public abstract val label: String? defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[PropertyDescriptorImpl]

'loop' @ [163:49] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'origin' @ [163:54] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[PropertyDescriptorImpl]

'loop' @ [166:31] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'label' @ [166:36] ==> public abstract val label: String? defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[PropertyDescriptorImpl]

'loop' @ [166:52] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'origin' @ [166:57] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[PropertyDescriptorImpl]

'jump' @ [169:28] ==> value-parameter jump: IrBreak defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitBreak[ValueParameterDescriptorImpl]

'label' @ [169:33] ==> public abstract val label: String? defined in org.jetbrains.kotlin.ir.expressions.IrBreak[PropertyDescriptorImpl]

'jump' @ [169:53] ==> value-parameter jump: IrBreak defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitBreak[ValueParameterDescriptorImpl]

'loop' @ [169:58] ==> public abstract var loop: IrLoop defined in org.jetbrains.kotlin.ir.expressions.IrBreak[PropertyDescriptorImpl]

'label' @ [169:63] ==> public abstract val label: String? defined in org.jetbrains.kotlin.ir.expressions.IrLoop[PropertyDescriptorImpl]

'jump' @ [172:31] ==> value-parameter jump: IrContinue defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitContinue[ValueParameterDescriptorImpl]

'label' @ [172:36] ==> public abstract val label: String? defined in org.jetbrains.kotlin.ir.expressions.IrContinue[PropertyDescriptorImpl]

'jump' @ [172:56] ==> value-parameter jump: IrContinue defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitContinue[ValueParameterDescriptorImpl]

'loop' @ [172:61] ==> public abstract var loop: IrLoop defined in org.jetbrains.kotlin.ir.expressions.IrContinue[PropertyDescriptorImpl]

'label' @ [172:66] ==> public abstract val label: String? defined in org.jetbrains.kotlin.ir.expressions.IrLoop[PropertyDescriptorImpl]

'expression' @ [175:27] ==> value-parameter expression: IrThrow defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitThrow[ValueParameterDescriptorImpl]

'type' @ [175:38] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrThrow[PropertyDescriptorImpl]

'render' @ [175:43] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [178:36] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitFunctionReference[ValueParameterDescriptorImpl]

'descriptor' @ [178:47] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[PropertyDescriptorImpl]

'ref' @ [178:58] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [178:73] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitFunctionReference[ValueParameterDescriptorImpl]

'type' @ [178:84] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[PropertyDescriptorImpl]

'render' @ [178:89] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [178:108] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitFunctionReference[ValueParameterDescriptorImpl]

'origin' @ [178:119] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[PropertyDescriptorImpl]

'buildString' @ [181:13] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [182:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [183:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expression' @ [183:28] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'descriptor' @ [183:39] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'ref' @ [183:50] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'appendNullableAttribute' @ [184:17] ==> private final inline fun <T : Any> StringBuilder /* = StringBuilder */.appendNullableAttribute(prefix: String, value: IrFieldSymbol?, toString: (IrFieldSymbol) -> String): Unit defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> IrFieldSymbol

'expression' @ [184:51] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'field' @ [184:62] ==> public abstract val field: IrFieldSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'it' @ [184:75] ==> value-parameter it: IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitPropertyReference.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [184:78] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFieldSymbol[PropertyDescriptorImpl]

'ref' @ [184:89] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'appendNullableAttribute' @ [185:17] ==> private final inline fun <T : Any> StringBuilder /* = StringBuilder */.appendNullableAttribute(prefix: String, value: IrFunctionSymbol?, toString: (IrFunctionSymbol) -> String): Unit defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> IrFunctionSymbol

'expression' @ [185:52] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'getter' @ [185:63] ==> public abstract val getter: IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'it' @ [185:77] ==> value-parameter it: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitPropertyReference.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [185:80] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol[PropertyDescriptorImpl]

'ref' @ [185:91] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'appendNullableAttribute' @ [186:17] ==> private final inline fun <T : Any> StringBuilder /* = StringBuilder */.appendNullableAttribute(prefix: String, value: IrFunctionSymbol?, toString: (IrFunctionSymbol) -> String): Unit defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> IrFunctionSymbol

'expression' @ [186:52] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'setter' @ [186:63] ==> public abstract val setter: IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'it' @ [186:77] ==> value-parameter it: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitPropertyReference.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [186:80] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol[PropertyDescriptorImpl]

'ref' @ [186:91] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'append' @ [187:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expression' @ [187:32] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'type' @ [187:43] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'render' @ [187:48] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'append' @ [188:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expression' @ [188:34] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'origin' @ [188:45] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'append' @ [192:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'prefix' @ [192:16] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.appendNullableAttribute[ValueParameterDescriptorImpl]

'if (value != null) {
            append(toString(value))
        }
        else {
            append("null")
        }' @ [193:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'value' @ [193:13] ==> value-parameter value: T? defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.appendNullableAttribute[ValueParameterDescriptorImpl]

'append' @ [194:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'invoke' @ [194:20] ==> public abstract operator fun invoke(p1: T): String defined in kotlin.Function1[FunctionInvokeDescriptor]

'value' @ [194:29] ==> value-parameter value: T? defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.appendNullableAttribute[ValueParameterDescriptorImpl]

'append' @ [197:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [199:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'buildString' @ [203:13] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [204:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [205:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expression' @ [205:28] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'descriptor' @ [205:39] ==> public abstract val descriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'ref' @ [205:50] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'append' @ [206:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expression' @ [206:37] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'delegate' @ [206:48] ==> public abstract val delegate: IrVariableSymbol defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'descriptor' @ [206:57] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrVariableSymbol[PropertyDescriptorImpl]

'ref' @ [206:68] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'append' @ [207:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expression' @ [207:35] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'getter' @ [207:46] ==> public abstract val getter: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'descriptor' @ [207:53] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol[PropertyDescriptorImpl]

'ref' @ [207:64] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'appendNullableAttribute' @ [208:17] ==> private final inline fun <T : Any> StringBuilder /* = StringBuilder */.appendNullableAttribute(prefix: String, value: IrFunctionSymbol?, toString: (IrFunctionSymbol) -> String): Unit defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> IrFunctionSymbol

'expression' @ [208:52] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'setter' @ [208:63] ==> public abstract val setter: IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'it' @ [208:77] ==> value-parameter it: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitLocalDelegatedPropertyReference.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [208:80] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol[PropertyDescriptorImpl]

'ref' @ [208:91] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'append' @ [209:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expression' @ [209:32] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'type' @ [209:43] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'render' @ [209:48] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'append' @ [210:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expression' @ [210:34] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'origin' @ [210:45] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'expression' @ [214:33] ==> value-parameter expression: IrClassReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitClassReference[ValueParameterDescriptorImpl]

'descriptor' @ [214:44] ==> public abstract val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrClassReference[PropertyDescriptorImpl]

'ref' @ [214:55] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [214:70] ==> value-parameter expression: IrClassReference defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitClassReference[ValueParameterDescriptorImpl]

'type' @ [214:81] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrClassReference[PropertyDescriptorImpl]

'render' @ [214:86] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [217:31] ==> value-parameter expression: IrGetClass defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitGetClass[ValueParameterDescriptorImpl]

'type' @ [217:42] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrGetClass[PropertyDescriptorImpl]

'render' @ [217:47] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'aTry' @ [220:25] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitTry[ValueParameterDescriptorImpl]

'type' @ [220:30] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTry[PropertyDescriptorImpl]

'render' @ [220:35] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'aCatch' @ [223:32] ==> value-parameter aCatch: IrCatch defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitCatch[ValueParameterDescriptorImpl]

'parameter' @ [223:39] ==> public abstract val parameter: VariableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCatch[PropertyDescriptorImpl]

'ref' @ [223:49] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [226:27] ==> value-parameter declaration: IrErrorDeclaration defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitErrorDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [226:39] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrErrorDeclaration[PropertyDescriptorImpl]

'java' @ [226:57] ==> public val <T> KClass<out DeclarationDescriptor>.java: Class<out DeclarationDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out DeclarationDescriptor)

'simpleName' @ [226:62] ==> public final val <T : (Any..Any?)> Class<out DeclarationDescriptor>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out DeclarationDescriptor)

'declaration' @ [226:76] ==> value-parameter declaration: IrErrorDeclaration defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitErrorDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [226:88] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrErrorDeclaration[PropertyDescriptorImpl]

'ref' @ [226:99] ==> internal final fun DeclarationDescriptor.ref(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [229:28] ==> value-parameter expression: IrErrorExpression defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitErrorExpression[ValueParameterDescriptorImpl]

'description' @ [229:39] ==> public abstract val description: String defined in org.jetbrains.kotlin.ir.expressions.IrErrorExpression[PropertyDescriptorImpl]

'expression' @ [229:60] ==> value-parameter expression: IrErrorExpression defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitErrorExpression[ValueParameterDescriptorImpl]

'type' @ [229:71] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrErrorExpression[PropertyDescriptorImpl]

'render' @ [229:76] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [232:28] ==> value-parameter expression: IrErrorCallExpression defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitErrorCallExpression[ValueParameterDescriptorImpl]

'description' @ [232:39] ==> public abstract val description: String defined in org.jetbrains.kotlin.ir.expressions.IrErrorCallExpression[PropertyDescriptorImpl]

'expression' @ [232:60] ==> value-parameter expression: IrErrorCallExpression defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.visitErrorCallExpression[ValueParameterDescriptorImpl]

'type' @ [232:71] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrErrorCallExpression[PropertyDescriptorImpl]

'render' @ [232:76] ==> internal final fun KotlinType.render(): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'DescriptorRenderer' @ [235:36] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [235:55] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'withDefinedIn' @ [236:13] ==> public abstract var withDefinedIn: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'overrideRenderingPolicy' @ [237:13] ==> public abstract var overrideRenderingPolicy: OverrideRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'RENDER_OPEN_OVERRIDE' @ [237:63] ==> enum entry RENDER_OPEN_OVERRIDE defined in org.jetbrains.kotlin.renderer.OverrideRenderingPolicy[FakeCallableDescriptorForObject]

'includePropertyConstant' @ [238:13] ==> public abstract var includePropertyConstant: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'classifierNamePolicy' @ [239:13] ==> public abstract var classifierNamePolicy: ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'FULLY_QUALIFIED' @ [239:57] ==> public object FULLY_QUALIFIED : ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy[FakeCallableDescriptorForObject]

'verbose' @ [240:13] ==> public abstract var verbose: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'modifiers' @ [241:13] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'DescriptorRendererModifier' @ [241:25] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'ALL' @ [241:52] ==> @field:JvmField public final val ALL: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier.Companion[DeserializedPropertyDescriptor]

'DescriptorRenderer' @ [244:34] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'ONLY_NAMES_WITH_SHORT_TYPES' @ [244:53] ==> @field:JvmField public final val ONLY_NAMES_WITH_SHORT_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'descriptor' @ [247:17] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[PropertyDescriptorImpl]

'name' @ [247:28] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'toString' @ [247:33] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'if (descriptor is ReceiverParameterDescriptor)
                    "this@${descriptor.containingDeclaration.name}: ${descriptor.type}"
                else
                    render(descriptor)' @ [250:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'descriptor' @ [250:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion.renderDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [251:29] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion.renderDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [251:40] ==> public final val ReceiverParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'name' @ [251:62] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'descriptor' @ [251:71] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion.renderDescriptor[ValueParameterDescriptorImpl]

'type' @ [251:82] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'render' @ [253:21] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [253:28] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion.renderDescriptor[ValueParameterDescriptorImpl]

'DECLARATION_RENDERER' @ [256:17] ==> public final val DECLARATION_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[PropertyDescriptorImpl]

'renderDescriptor' @ [256:38] ==> internal final fun DescriptorRenderer.renderDescriptor(descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'this' @ [256:55] ==> <this> defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion.renderDeclared[ReceiverParameterDescriptorImpl]

'descriptor' @ [256:60] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[PropertyDescriptorImpl]

'REFERENCE_RENDERER' @ [259:17] ==> public final val REFERENCE_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[PropertyDescriptorImpl]

'renderDescriptor' @ [259:36] ==> internal final fun DescriptorRenderer.renderDescriptor(descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[SimpleFunctionDescriptorImpl]

'this' @ [259:53] ==> <this> defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion.ref[ReceiverParameterDescriptorImpl]

'DECLARATION_RENDERER' @ [262:17] ==> public final val DECLARATION_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion[PropertyDescriptorImpl]

'renderType' @ [262:38] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [262:49] ==> <this> defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor.Companion.render[ReceiverParameterDescriptorImpl]

'if (origin != IrDeclarationOrigin.DEFINED) origin.toString() + " " else ""' @ [265:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'origin' @ [265:21] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[PropertyDescriptorImpl]

'DEFINED' @ [265:51] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'origin' @ [265:60] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[PropertyDescriptorImpl]

'toString' @ [265:67] ==> public open fun toString(): String defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[DeserializedSimpleFunctionDescriptor]

