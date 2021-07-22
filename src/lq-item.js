import { Typography, Space } from 'antd';

function LqItem(props) {
    const { Text, Link } = Typography;
    return (
    <Space direction="vertical">
        <Link href="/lq-detail" target="_blank">{props.item.ltName}</Link>
        <Text>{props.item.desc}</Text>
    </Space>);
}

export default LqItem;
