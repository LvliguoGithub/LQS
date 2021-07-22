import React from 'react';
import { Typography } from 'antd';
import './index.css';

function LqDetail(props) {
  const { Title, Paragraph, Text } = Typography;
  return (
    <Typography>
      <Title>{props.data.ltName}</Title>
      <Paragraph>{props.data.desc}</Paragraph>
    </Typography>
  );
}

export default LqDetail;
